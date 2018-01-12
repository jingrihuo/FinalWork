package com.edu.zucc.yj.finalwork.controller;

import com.edu.zucc.yj.finalwork.model.User;
import com.edu.zucc.yj.finalwork.service.ISuperUserService;
import com.edu.zucc.yj.finalwork.service.IUserService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @ProjectName: FinalWork
 * @ClassName: SuperUserController
 * @Description: 管理员操作控制器
 * @Author: YuJing
 * @CreateDate: 2018/1/12
 */

@Controller
@RequestMapping("/superUser")
public class SuperUserController {

    @Resource
    private ISuperUserService superUserService;
    @Resource
    private IUserService userService;

    @RequestMapping("/banned.do")
    @ResponseBody
    public JSONObject bannedUser(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String result = "封禁用户成功";
        Date bannedTime = new Date();
        bannedTime = new Date(bannedTime.getTime()+3 * 24 * 60 * 60 * 1000);
        User user = this.userService.getSelectUser(request.getSession().getAttribute("userId").toString());
        user.setUser_banned(bannedTime);
        this.superUserService.bannedUser(user);
        jsonObject.put("result", result);
        return  jsonObject;
    }
}
