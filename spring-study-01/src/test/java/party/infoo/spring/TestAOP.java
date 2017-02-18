package party.infoo.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import party.infoo.spring.AOP.service.UserService;

/**
 * Created by infoo on 2017/2/18.
 */
public class TestAOP {
    private ApplicationContext applicationContext;
    @Before
    public void get(){
        if(applicationContext==null){
            applicationContext=new ClassPathXmlApplicationContext("AOP.xml");
        }
    }

    @Test
    public void testAOP(){
        UserService userService=(UserService) applicationContext.getBean("userService");
        userService.addUser("INFOO");
    }
}
