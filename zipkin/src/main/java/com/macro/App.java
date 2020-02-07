package com.macro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author suhong
 * @version V1.0
 * @Title: Demacia
 * @Package com.macro
 * @Description:
 * @date 2020/02/05 12:55
 */
@EnableZipkinServer
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
