package com.macro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suhong
 * @version V1.0
 * @Title: Demacia
 * @Package com.macro.controller
 * @Description:
 * @date 2020/01/08 17:36
 */
@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String name;
    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String hello() {
        return "hello,this message is from " + name + port;
    }
}
