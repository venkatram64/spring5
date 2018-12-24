package com.venkat.spring5;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class PlainSimpleLogic implements InitializingBean{

    public PlainSimpleLogic(){
        System.out.println("PlainSimpleLogic is created.");
    }


    public void init(){
        System.out.println("PlainSimpleLogic Class was initialized.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PlainSimpleLogic Class was initialized in afterPropertiesSet.");
    }


    public void destroyed(){
        System.out.println("PlainSimpleLogic Bean is about to be destroyed.");
    }
}
