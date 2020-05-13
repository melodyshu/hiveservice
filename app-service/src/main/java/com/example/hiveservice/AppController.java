package com.example.hiveservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huangzhimao
 * @Date: 2020-05-13
 */
@RestController
@RequestMapping("/app")
public class AppController {
    @GetMapping("/get")
    public String app(){
        return "app";
    }
}
