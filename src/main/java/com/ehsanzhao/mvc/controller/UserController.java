package com.ehsanzhao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhaoyuan
 * @date 2023/1/12
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 使用RESTFul模拟用户资源的增删改查
     * /user  GET 查询所有用户
     * /user/1  GET 根据id查询用户
     * /user  POST 添加用户
     * /user/1  DELETE 删除用户
     * /user  PUT 修改用户
     */
    @GetMapping()
    public String getAllUser(){
        System.out.println("查询所有用户");
        return "success";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("根据id查询用户:"+id);
        return "success";
    }

    @PostMapping()
    public String insertUser(String username, String pwd){
        System.out.println("添加用户:"+username+":"+pwd);
        return "success";
    }

    @PutMapping()
    public String updateUser(String username, String pwd){
        System.out.println("修改用户:"+username+":"+pwd);
        return "success";
    }

    @DeleteMapping()
    public String deleteUser(String username, String pwd){
        System.out.println("删除用户:"+username+":"+pwd);
        return "success";
    }

}
