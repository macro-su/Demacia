package com.macro.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author suhong
 * @version V1.0
 * @Title: Demacia
 * @Package com.macro.facade
 * @Description:
 * @date 2020/01/09 19:01
 */
@FeignClient("PROVIDER")
public interface Hello {

    @GetMapping("hello")
    String hello();
}
