package com.edu.zucc.yj.finalwork.controller;

import javax.servlet.http.HttpServletRequest;

import com.edu.zucc.yj.finalwork.model.User;
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

@Controller
@RequestMapping("/user")
public class UserController {

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
    public JSONObject login(@RequestParam("username") String username, @RequestParam("userpassword") String userpassword,HttpServletRequest request) throws IOException{
        String result = "密码错误";
        String password;
        JSONObject jsonObject = new JSONObject();
        User user = this.userService.getSelectUser(username);
        password = MD5Util.MD5Encode(userpassword, "UTF-8").toUpperCase();
        if (user == null){
            result = "不存在该用户";
        }else if(user.getUser_state()!=null){
            result = "该账号被封禁,详细情况请联系管理员";
        }else if (user.getUser_password().equals(password)){
            request.getSession().setAttribute("userId",username);
            result = "succesful";
        }
        jsonObject.put("result",result);
        return jsonObject;
    }

    @RequestMapping("/registered.do")
    @ResponseBody
    public JSONObject registered(@RequestParam("username") String username, @RequestParam("userpassword") String userpassword,@RequestParam("useremail") String useremail)throws IOException{
        JSONObject jsonObject = new JSONObject();
        String result = "已经存在该用户";
        User user = this.userService.getSelectUser(username);
        if (user == null){
            user = new User();
            user.setUser_account(username);
            String MD5_Password = MD5Util.MD5Encode(userpassword, "UTF-8").toUpperCase();
            user.setUser_password(MD5_Password);
            user.setUser_email(useremail);
            this.userService.addUser(user);
            result = "succesful";
        }
        jsonObject.put("result",result);
        return jsonObject;
    }






}