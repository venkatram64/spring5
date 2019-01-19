package com.venkat.spring5;

import com.venkat.spring5.aop.TracibleService;
import com.venkat.spring5.tx.BusinessService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring5Application.class, args);
		System.out.println(context.getBean(PlainSimpleLogic.class));
		System.out.println(context.getBean(PlainSimpleLogic.class));
		System.out.println(context.getBean(PlainSimpleLogic.class));
		//above will call the java config
		context.getBean(PlainSimpleLogic.class).doSomeWork();
		context.getBean(TracibleService.class).hello("aop");
		//above will call the java config

		//calling the programatic transaction bean
		context.getBean("businessServiceProgramaticTx", BusinessService.class).doProcess();
        context.getBean("businessServiceProgramaticTx", BusinessService.class).doProcess2();

        //calling the declarative transaction bean
        context.getBean("businessServiceDeclarativeTx", BusinessService.class).doProcess();
        context.getBean("businessServiceDeclarativeTx", BusinessService.class).doProcess2();
	}

}

