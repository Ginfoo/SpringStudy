package party.infoo.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import party.infoo.entity.Man;
import party.infoo.entity.People;
import party.infoo.entity.User;
import party.infoo.spring.IOC.Work;
import party.infoo.spring.IOC.ZhangSan;
import party.infoo.spring.IOC.ZhangSi;

/**
 * Created by infoo on 2017/2/18.
 */
public class TestIOC {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        if (applicationContext == null) {
            applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        }
    }

    @Test
    public void testIOC() {
        /*
           控制反转介绍
           如有两个人，ZhangSan 与 ZhangSi
           主管有一个新工作Work要做，让人来做的权利由主管来控制
         */
        Work work = new Work();//主管创建新的工作任务
        work.setPeople(new ZhangSan());//让张三去做
        work.doWork();//工作被做

        work.setPeople(new ZhangSi());//让张四去做
        work.doWork();//工作被做

        /**
         * 上述就是控制反转
         *  及将谁做工作交给别人来控制，而不是在工作被创建的时候就指定好做工作的人
         */
    }

    @Test
    public void testSpringIOC() {
        /**
         * 使用Spring的IOC
         * 查看spring配置
         * 将控制权交给了Spring 管理；又称依赖注入
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Work work = (Work) applicationContext.getBean("work");
        work.doWork();

        Work work2 = (Work) applicationContext.getBean("work2");
        work2.doWork();
    }

    @Test
    public void testSpringIOCUser() {
        System.out.println("==================================");
        User user = (User) applicationContext.getBean("user");
        user.toSout();
        System.out.println("==================================");
        User user2 = (User) applicationContext.getBean("user2");
        user2.toSout();
        System.out.println("==================================");
        User user3 = (User) applicationContext.getBean("user3");
        user3.toSout();
        System.out.println("==================================");
        User user4 = (User) applicationContext.getBean("user4");
        user4.toSout();
        System.out.println("==================================");
        User user5 = (User) applicationContext.getBean("user5");
        user5.toSout();
        System.out.println("==================================");
        User user6 = (User) applicationContext.getBean("user6");
        user6.toSout();
    }

    @Test
    public void testPeople(){
        System.out.println("==================================");
        People people = (People) applicationContext.getBean("people2");
        System.out.println(people);
    }
    @Test
    public void testMan(){
        Man man1 = (Man) applicationContext.getBean("man1");
        Man man2 = (Man) applicationContext.getBean("man2");
        System.out.println(man1==man2);
        System.out.println(man1.getDog()==man1.getDog());
        System.out.println(man1.getDog()==man2.getDog());
        Man man3 = (Man) applicationContext.getBean("man3");
        Man man4 = (Man) applicationContext.getBean("man4");
        Man man5 = (Man) applicationContext.getBean("man3");
        System.out.println(man3==man4);
        System.out.println(man3.getDog()==man4.getDog());
        System.out.println(man3.getDog()==man5.getDog());
    }
}
