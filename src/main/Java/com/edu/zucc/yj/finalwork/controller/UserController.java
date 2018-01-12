package com.edu.zucc.yj.finalwork.controller;

import javax.servlet.http.HttpServletRequest;

import com.edu.zucc.yj.finalwork.model.User;
import com.edu.zucc.yj.finalwork.service.ISuperUserService;
import com.edu.zucc.yj.finalwork.service.IUserService;
import com.edu.zucc.yj.finalwork.utils.MD5Util;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @ProjectName: FinalWork
 * @ClassName: UserController
 * @Description: 用户操作控制器
 * @Author: YuJing
 * @CreateDate: 2018/1/10
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private ISuperUserService superUserService;
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = this.userService.getSelectUser("123");
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

    @RequestMapping("/login.do")
    @ResponseBody
    /**
     * @method  login
     * @description 用户登录
     * @date: 2018/1/12
     * @author: yuritian
     * @param username 用户账号
     * @param userpassword 用户密码
     * @return JSONObject
     */
    public JSONObject login(HttpServletRequest request) throws IOException {
        String result = "密码错误";
        String useraccount = request.getParameter("useraccount");
        String userpassword = request.getParameter("userpassword");
        String MD5password;
        JSONObject jsonObject = new JSONObject();
        User user = this.userService.getSelectUser(useraccount);
        MD5password = MD5Util.MD5Encode(userpassword, "UTF-8").toUpperCase();
        if (user == null) {
            result = "不存在该用户";
        } else if (user.getUser_banned() != null) {
            if (new Date().getTime()>user.getUser_banned().getTime()){
                user.setUser_banned(null);
                this.superUserService.bannedUser(user);
                request.getSession().setAttribute("userId", useraccount);
                request.getSession().setAttribute("userState",user.getUser_state());
                result = "succesful";
            }else {
                result = "该账号被封禁,详细情况请联系管理员";
            }
        } else if (user.getUser_password().equals(MD5password)) {
            request.getSession().setAttribute("userId", useraccount);
            request.getSession().setAttribute("userState",user.getUser_state());
            result = "succesful";
        }
        jsonObject.put("result", result);
        return jsonObject;
    }

    @RequestMapping("/registered.do")
    @ResponseBody
    /**
     * @method  registered
     * @description 描述一下方法的作用
     * @date: 2018/1/12
     * @author: yuritian
     * @param username 用户账号
     * @param userpassword 用户密码
     * @param useremail 用户邮箱
     * @return JSONObject
     */
    public JSONObject registered(HttpServletRequest request) throws IOException {
        JSONObject jsonObject = new JSONObject();
        String useraccount = request.getParameter("useraccount");
        String userpassword = request.getParameter("userpassword");
        String useremail = request.getParameter("useremail");
        String result = "已经存在该用户";
        User user = this.userService.getSelectUser(useraccount);
        if (user == null) {
            user = new User();
            user.setUser_account(useraccount);
            String MD5_Password = MD5Util.MD5Encode(userpassword, "UTF-8").toUpperCase();
            user.setUser_password(MD5_Password);
            user.setUser_email(useremail);
            this.userService.addUser(user);
            result = "succesful";
        }
        jsonObject.put("result", result);
        return jsonObject;
    }

    @RequestMapping("/modifyUserInformation.do")
    @ResponseBody
    /**
     * @method  addUserInformation
     * @description 描述一下方法的作用
     * @date: 2018/1/12
     * @author: yuritian
     * @param username
     * @param useremail
     * @param userclass
     * @param userstudentid
     * @return net.sf.json.JSONObject
     */
    public JSONObject modifyUserInformation(HttpServletRequest request)throws IOException {
        JSONObject jsonObject = new JSONObject();
        String result = "修改信息成功";
        String username = request.getParameter("username");
        String useremail = request.getParameter("useremail");
        String userclass = request.getParameter("userclass");
        String userstudentid = request.getParameter("userstudentid");
        User user = this.userService.getSelectUser(request.getSession().getAttribute("userId").toString());
        user.setUser_name(username);
        user.setUser_email(useremail);
        user.setUser_class(userclass);
        user.setUser_studentid(userstudentid);
        this.userService.modifyUser(user);
        jsonObject.put("result",result);
        return jsonObject;
    }


}