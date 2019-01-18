package com.venkat.spring5;


import org.springframework.beans.factory.InitializingBean;


public class PlainSimpleLogic2 implements InitializingBean{


    private SimpleLogic simpleLogic;

    public PlainSimpleLogic2(SimpleLogic simpleLogic){
        System.out.println("PlainSimpleLogic2 is created.");
        this.simpleLogic = simpleLogic;
    }


    public void init(){
        System.out.println("PlainSimpleLogic2 Class was initialized.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PlainSimpleLogic2 Class was initialized in afterPropertiesSet.");
    }


    public void destroyed(){
        System.out.println("PlainSimpleLogic2 Bean is about to be destroyed.");
    }

    public void doSomeWork(){
        simpleLogic.doSimpleWork();
    }
}
