package com.ehsanzhao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
@Controller
public class ViewController {

    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        //视图名称没有配置任何前缀的话，就会被ThemeleafViewResolver视图解析器解析，从而跳转到/WEB-INF/templates/success.html
        // 最后会通过转发的方式跳转
        return "success";
    }

    @RequestMapping("/testForwardView")
    public String testForwardView(){
        // 转发，浏览器只会请求一次，服务器内部两次
        // 请求域都能使用
        // 不可以跨域
        return "forward:/testThymeleafView";
    }

    @RequestMapping("/testRedirectView")
    public String testRedirectView(){
        // 重定向，浏览器会请求两次
        // 请求域只有重定向前可以使用
        // 可以跨域
        return "redirect:http://www.baidu.com";
    }

}
