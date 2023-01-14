package com.ehsanzhao.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author zhaoyuan
 * @date 2023/1/14
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = {Exception.class})
    public String handlerException(Exception exception, Model model){
        model.addAttribute("error",exception);
        return "error";
    }

}
