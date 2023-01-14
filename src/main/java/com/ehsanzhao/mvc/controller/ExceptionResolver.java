package com.ehsanzhao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaoyuan
 * @date 2023/1/14
 */
@Controller
public class ExceptionResolver {

    @RequestMapping("/exceptionResolver")
    public String exceptionResolver() throws Exception {
        if(true) throw new Exception("未知错误");
        return "success";
    }

}
