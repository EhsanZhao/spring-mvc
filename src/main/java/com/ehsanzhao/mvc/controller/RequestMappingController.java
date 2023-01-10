package com.ehsanzhao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhaoyuan
 * @date 2023/1/6
 */
@Controller
@RequestMapping("/test")
public class RequestMappingController {

    @RequestMapping(
            value = {
                    "/target","/testRequestMapping"
            }
    )
    public String toTarget(){
        return "target";
    }

    @RequestMapping(value = "/submit",method = { RequestMethod.GET,RequestMethod.POST })
    public String submit(){
        return "target";
    }

    @RequestMapping(
            value = "/params",
            method = { RequestMethod.GET,RequestMethod.POST },
            params = {"username!=admin","pwd"}
    )
    public String submitParams(){
        return "target";
    }

    @RequestMapping(
            value = "/header",
            method = { RequestMethod.GET,RequestMethod.POST },
            headers = {"Host=xxx"}
    )
    public String submitHeader(){
        return "target";
    }

    /**
     * ？：表示任意的单个字符
     * *：表示任意的0个或多个字符
     * **：表示任意的一层或多层目录
     * 注意：在使用**时，只能使用/**
     * @return
     */
    @RequestMapping(
            value = "/**/a?t/*",
            method = { RequestMethod.GET,RequestMethod.POST }
    )
    public String ant(){
        return "target";
    }

    @RequestMapping(value = "/path/{id}")
    public String path(@PathVariable("id") Integer id){
        System.out.println("path id = "+id);
        return "target";
    }

}
