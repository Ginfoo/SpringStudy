package party.infoo.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import party.infoo.spring.DI.entity.Man;
import party.infoo.spring.DI.entity.People;
import party.infoo.spring.DI.entity.User;
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
            applicationContext = new ClassPathXmlApplicationContext("IOC.xml");
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
         * 查看spring配置,让谁做工作直接在Spring配置文件配置即可
         * 将控制权交给了Spring 管理；又称依赖注入
         */
        Work work = (Work) applicationContext.getBean("work");
        work.doWork();

    }
}
