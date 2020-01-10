package com.macro.fallback;

import com.macro.facade.Hello;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author suhong
 * @version V1.0
 * @Title: Demacia
 * @Package com.macro.fallback
 * @Description:
 * @date 2020/01/09 20:10
 */
@Component
public class HelloFallBack implements FallbackFactory<Hello> {

    @Override
    public Hello create(Throwable throwable) {
        return () -> "调用失败，所以你看到这条信息";
    }
}
