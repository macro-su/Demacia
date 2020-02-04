package com.macro;

import com.macro.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author suhong
 * @version V1.0
 * @Title: Demacia
 * @Package com.macro
 * @Description:
 * @date 2020/02/04 10:41
 */

@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy//注解开启api网关功能
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
