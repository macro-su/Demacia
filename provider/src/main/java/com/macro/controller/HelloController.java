package com.macro.controller;

import com.macro.common.ServerConfig;
import com.macro.facade.Hello;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author suhong
 * @version V1.0
 * @Title: Demacia
 * @Package com.macro.controller
 * @Description:
 * @date 2020/01/08 17:36
 */
@RestController
public class HelloController implements Hello {


    @Resource
    private ServerConfig serverConfig;

    @Override
    public String hello() {
        return "生产者："+serverConfig.getUrl();
    }
}
