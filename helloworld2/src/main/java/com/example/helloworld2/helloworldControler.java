package com.example.helloworld2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloworldControler {
    @RequestMapping(value = {"/hello"})
    public ModelAndView showhelloworldpage()
    {
        ModelAndView modelAndView = new ModelAndView("helloworld");
        return modelAndView;
    }
}

