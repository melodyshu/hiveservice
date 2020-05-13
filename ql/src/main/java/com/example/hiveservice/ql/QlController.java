package com.example.hiveservice.ql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huangzhimao
 * @Date: 2020-05-12
 */
@RestController
@RequestMapping("/ql")
public class QlController {
    @GetMapping("/get")
    public String ql(){
        return "ql";
    }
}
