package party.infoo.spring.DI.factory;

import party.infoo.spring.DI.entity.User;

/**
 * Created by infoo on 2017/2/18.
 */
public class UserFactory {
    public User createUser(){
        System.out.println("=========非静态==========");
        User user=new User();
        user.setUserId(1);
        user.setUserName("gongchang");
        user.setUserPass("1223333");
        user.setUserAge(25);
        System.out.println("=========非静态==========");
        return user;

    }

    public static User createUserStatic(){
        System.out.println("=========静态==========");
        User user=new User();
        user.setUserId(2);
        user.setUserName("gongchangJingtai");
        user.setUserPass("1223333");
        user.setUserAge(20);
        System.out.println("=========静态==========");
        return user;
    }
}
