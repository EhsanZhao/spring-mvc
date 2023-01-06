package com.ehsanzhao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

}
