package com.venkat.spring5.tx.imp;

import com.venkat.spring5.tx.BusinessService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("businessServiceDeclarativeTx")
public class BusinessServiceDeclarativeTx implements BusinessService {

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRES_NEW)
    @Override
    public void doProcess() {
        String msg = "Hello from declarative transaction management.";
        System.out.println(msg);
    }
    @Override
    public void doProcess2() {

        System.out.println("throws testing");
        throw new IllegalStateException("Hello from Declarative transaction management.");
    }


}
