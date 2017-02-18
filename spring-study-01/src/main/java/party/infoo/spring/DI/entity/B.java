package party.infoo.spring.DI.entity;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by infoo on 2017/2/18.
 */
public class B implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        return "我是B";
    }
}
