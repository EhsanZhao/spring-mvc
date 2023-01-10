package com.ehsanzhao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

}
