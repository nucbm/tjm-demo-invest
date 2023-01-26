package com.cunbm.invest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/list-items")
    public String viewItems(){
        return "list-items";
    }

}
