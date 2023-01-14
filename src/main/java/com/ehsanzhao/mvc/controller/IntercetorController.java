package com.ehsanzhao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaoyuan
 * @date 2023/1/14
 */
@Controller
public class IntercetorController {

    @RequestMapping("/testInterceptor")
    public String interceptor(){
        return "success";
    }

}
