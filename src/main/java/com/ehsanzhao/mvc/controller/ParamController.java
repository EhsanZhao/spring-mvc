package com.ehsanzhao.mvc.controller;

import com.ehsanzhao.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zhaoyuan
 * @date 2023/1/9
 */
@Controller
public class ParamController {

    @RequestMapping("/paramServletApi")
    public String paramServletApi(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "target";
    }
    @RequestMapping("/paramFormal")
    public String paramFormal(String username,String password){
        System.out.println("username:"+username+",password:"+password);
        return "target";
    }

    @RequestMapping("/paramParameterValues")
    public String paramParameterValues(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] role = request.getParameterValues("role");
        System.out.println("username:"+username+",password:"+password+",role:"+ Arrays.toString(role));
        return "target";
    }

    @RequestMapping("/paramRequestParam")
    public String paramRequestParam(
            @RequestParam(value = "user_name",defaultValue = "hehe",required = false) String username,
            String password,
            String[] role,
            @RequestHeader("host") String host,
            @CookieValue("JSESSIONID") String cookie){
        System.out.println("username:"+username+",password:"+password+",role:"+ Arrays.toString(role));
        System.out.println("host:"+host);
        System.out.println("cookie:"+cookie);
        return "target";
    }

    @RequestMapping("/paramPojo")
    public String paramPojo(User user){
        System.out.println("user:"+user.toString());
        return "target";
    }

}
