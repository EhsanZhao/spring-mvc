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

}
