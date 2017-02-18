package party.infoo.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import party.infoo.spring.HelloWorld.HelloWorld;

/**
 * Created by infoo on 2017/2/18.
 */
public class TestHelloWorld {
    /*
         传统方式
     */
    @Test
    public void testHelloWorldSayHello(){
        HelloWorld helloWorld=new HelloWorld();//创建HelloWorldd对象
        helloWorld.setName("world");//调用对象赋值
        helloWorld.sayHello();//执行对象方法
    }
    /*
       使用Spring方法
     */

    @Test
    public void testSpringHelloworldSayHello(){
        //查看spring配置
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("HelloWorld.xml");

        HelloWorld helloWorld=(HelloWorld)applicationContext.getBean("helloWorld");//通过id 获取对象
        helloWorld.sayHello();

        HelloWorld helloWorld3=(HelloWorld)applicationContext.getBean("helloWorld");//通过id 获取对象
        helloWorld3.sayHello();
        System.out.println(helloWorld==helloWorld3);

        HelloWorld helloWorld2=(HelloWorld)applicationContext.getBean("helloWorld2");//通过id 获取对象
        helloWorld2.sayHello();
        System.out.println(helloWorld2==helloWorld3);
        /**
         *  调用HelloWorld构造器
            调用HelloWorld构造器
            Hello: world
            Hello: world
            true
            Hello: world2
            false
         */

    }
}
