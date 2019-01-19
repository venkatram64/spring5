package com.venkat.spring5.tx.imp;

import com.venkat.spring5.tx.BusinessService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

@Service("businessServiceProgramaticTx")
public class BusinessServiceProgramaticTx implements BusinessService {

    private TransactionTemplate transactionTemplate;

    public BusinessServiceProgramaticTx(PlatformTransactionManager transactionManager){
        this.transactionTemplate = new TransactionTemplate(transactionManager);
        this.transactionTemplate.setTimeout(30);
        this.transactionTemplate.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
    }

    @Override
    public void doProcess() {
        String msg = transactionTemplate.execute(status ->{
            return "Hello from Declarative transaction management.";
        });
        System.out.println(msg);
    }
    @Override
    public void doProcess2() {
        String msg = transactionTemplate.execute(status ->{
            try{
                throw new IllegalStateException("Hello from Declarative transaction management.");
            }catch (Exception ex){
                status.setRollbackOnly();
                return "Nothing has happened.";
            }
        });
        System.out.println(msg);
    }

}
