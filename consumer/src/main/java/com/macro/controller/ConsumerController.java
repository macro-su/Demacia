package com.macro.controller;

import com.macro.facade.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author suhong
 * @version V1.0
 * @Title: Demacia
 * @Package com.macro.controller
 * @Description:
 * @date 2020/01/09 19:46
 */
@RestController
public class ConsumerController {

    @Resource
    private Hello hello;

    @GetMapping
    public String getHello(){
        return hello.hello();
    }
}
