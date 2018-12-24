package com.venkat.spring5;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SimpleLogic implements InitializingBean{

    public SimpleLogic(){
        System.out.println("SimpleLogic is created.");
    }

    @PostConstruct
    public void init(){
        System.out.println("SimpleLogic Class was initialized.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SimpleLogic Class was initialized in afterPropertiesSet.");
    }

    @PreDestroy
    public void destroyed(){
        System.out.println("SimpleLogic Bean is about to be destroyed.");
    }

    public void doSimpleWork(){
        System.out.println("Work from simple logic");
    }
}
