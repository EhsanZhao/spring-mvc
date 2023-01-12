package com.ehsanzhao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaoyuan
 * @date 2023/1/5
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/param")
    public String param(){
        return "param";
    }

    @GetMapping("/scope")
    public String scope(){
        return "scope";
    }

    @GetMapping("/view")
    public String view(){
        return "view";
    }

    @GetMapping("/restful")
    public String restful(){
        return "restful";
    }

}
