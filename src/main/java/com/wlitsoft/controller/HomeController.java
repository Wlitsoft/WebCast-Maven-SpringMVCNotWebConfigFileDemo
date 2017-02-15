package com.wlitsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liliang on 2017/2/15.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){

        return "test";
    }
}
