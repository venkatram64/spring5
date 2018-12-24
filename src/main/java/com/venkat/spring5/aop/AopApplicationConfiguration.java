package com.venkat.spring5.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AopApplicationConfiguration {
    @Bean
    public TracibleService tracibleService(){
        return new TracibleService();
    }
}
