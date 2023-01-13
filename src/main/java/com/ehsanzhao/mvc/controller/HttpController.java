package com.ehsanzhao.mvc.controller;

import com.ehsanzhao.mvc.entity.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhaoyuan
 * @date 2023/1/13
 */
@Controller
public class HttpController {

    @RequestMapping("/requestBody")
    public String requestBody(@RequestBody String requestBody){
        System.out.println("requestBody:"+requestBody);
        return "success";
    }

    @RequestMapping("/requestEntity")
    public String requestEntity(RequestEntity<String> requestEntity){
        System.out.println("requestHeader:"+requestEntity.getHeaders());
        System.out.println("requestBody:"+requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello,response");
    }

    @RequestMapping("/responseBody")
    @ResponseBody
    public User responseBody() throws IOException {
        User user = new User();
        user.setUsername("test");
        return user;
    }

}
