package party.infoo.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import party.infoo.spring.DI.entity.A;

/**
 * Created by infoo on 2017/2/18.
 */
public class TestDI_other {
    private ApplicationContext applicationContext;
    @Before
    public void before(){
        if(applicationContext==null){
            applicationContext=new ClassPathXmlApplicationContext("DI_other.xml");
        }
    }
    @Test
    public void testReplaceMethod(){
       A a=(A) applicationContext.getBean("a");
        System.out.println(a.getName());
    }
}
