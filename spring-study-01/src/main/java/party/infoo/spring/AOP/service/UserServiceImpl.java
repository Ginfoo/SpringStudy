package party.infoo.spring.AOP.service;

/**
 * Created by infoo on 2017/2/18.
 */
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(String name) {
        System.out.println("=添加学生："+name);
        //System.out.println(1/0);
        return name;
    }
}
