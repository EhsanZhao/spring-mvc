package com.ehsanzhao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author zhaoyuan
 * @date 2023/1/11
 */
@Controller
public class ScopeController {

    /*----------请求域---------*/

    @RequestMapping("/testRequestByServletApi")
    public String testRequestByServletApi(HttpServletRequest request){
        request.setAttribute("testRequestScope","hello,testRequestByServletApi");
        return "success";
    }

    @RequestMapping("/testRequestByModelAndView")
    public ModelAndView testRequestByModelAndView(){ //这几种方法HttpServletRequest、Model、ModelMap、Map最后都会封装成一个ModelAndView返回
        ModelAndView mav = new ModelAndView();
        mav.addObject("testRequestScope","hello,testRequestByModelAndView");
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/testRequestByModel")
    public String testRequestByModel(Model model){
        model.addAttribute("testRequestScope","hello,testRequestByModel");
        System.out.println(model.getClass().getName()); //org.springframework.validation.support.BindingAwareModelMap
        return "success";
    }

    @RequestMapping("/testRequestByMap")
    public String testRequestByModel(Map<String,Object> map){
        map.put("testRequestScope","hello,testRequestByMap");
        System.out.println(map.getClass().getName()); //org.springframework.validation.support.BindingAwareModelMap
        return "success";
    }

    @RequestMapping("/testRequestByModelMap")
    public String testRequestByModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","hello,testRequestByModelMap");
        System.out.println(modelMap.getClass().getName()); //org.springframework.validation.support.BindingAwareModelMap
        return "success";
    }

    /*----------session域---------*/
    @RequestMapping("/testSession")
    public String testSession(HttpSession httpSession){
        httpSession.setAttribute("testSessionScope","hello,session");
        return "success";
    }

    /*----------application域---------*/
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession httpSession){
        ServletContext servletContext = httpSession.getServletContext();
        servletContext.setAttribute("testApplicationScope","hello,Application");
        return "success";
    }
}
