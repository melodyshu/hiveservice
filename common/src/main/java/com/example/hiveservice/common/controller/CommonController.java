package com.example.hiveservice.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huangzhimao
 * @Date: 2020-05-13
 */
@RestController
@RequestMapping("/common")
public class CommonController {
    @GetMapping("/get")
    public String common(){
        return "common";
    }
}
