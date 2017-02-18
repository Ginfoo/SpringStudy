package party.infoo.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import party.infoo.spring.TX.service.BankService;

/**
 * Created by infoo on 2017/2/19.
 */
public class TestTX {
    private ApplicationContext applicationContext;
    @Before
    public void getApplicationContext() {
        if (applicationContext == null) {
            applicationContext = new ClassPathXmlApplicationContext("TX.xml");
        }
    }
    @Test
    public void testTransferAccountFormAtoB(){
        BankService bankService=(BankService)applicationContext.getBean("bankService");
        bankService.transferAccountFormAtoB(100,1,2);
    }
}
