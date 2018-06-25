package com.feign_hystrix.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements TestFeignClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

    @Override
    public String add(Integer a, Integer b) {
        HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数： {},{}", a, b);
        return "feign-hystrix";
    }
}