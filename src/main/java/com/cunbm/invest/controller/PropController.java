package com.cunbm.invest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropController {
    @RequestMapping(value = "/list-proposals")
    public String viewProducts(){
            return "list-proposals";
        }

    @RequestMapping(value="/add-proposal")
    public String addProducts(){
            return "add-proposal";
        }
}
