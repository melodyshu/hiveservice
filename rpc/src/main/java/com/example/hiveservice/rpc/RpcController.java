package com.example.hiveservice.rpc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huangzhimao
 * @Date: 2020-05-12
 */
@RestController
@RequestMapping("/rpc")
public class RpcController {
    @GetMapping("/get")
    public String ql(){
        return "rpc";
    }
}
