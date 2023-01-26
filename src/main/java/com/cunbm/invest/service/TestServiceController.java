package com.cunbm.invest.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class TestServiceController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<Object> test(){

        return new ResponseEntity<>(Arrays.asList(
                new com.cunbm.invest.model.Company(1001,"Company001"),
                new com.cunbm.invest.model.Company(1002,"Company002"),
                new com.cunbm.invest.model.Company(1003,"Company003")
                ),
        HttpStatus.OK);
    }
}


