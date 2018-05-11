package com.ancrazyking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ancrazyking
 * @date 2018/5/11 21:39
 **/
@Controller
@RequestMapping("/crm")
public class testController
{

    @RequestMapping("/test")
    public String Test(){
        return "test";

    }





}
