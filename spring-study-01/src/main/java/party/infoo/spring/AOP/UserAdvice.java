package party.infoo.spring.AOP;

/**
 * Created by infoo on 2017/2/18.
 */


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 此类用来写切面
 */
public class UserAdvice {
    /**
     * Joinpoint 是切点对象
     *
     * @param jp
     */
    public void doBefore(JoinPoint jp) {
        System.out.println("开始添加学生==类名: " + jp.getTarget().getClass().getName());
        System.out.println("添加学生准备==学生姓名: " + jp.getArgs()[0]);

    }

    public void doAfter(JoinPoint jp) {
        System.out.println("添加学生完成==使用的方法: " + jp.getSignature().getName());
        System.out.println("添加学生完成==学生姓名: " + jp.getArgs()[0]);
    }

    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("**********************************");
        Object retVal=null;
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("**********************************");
        return retVal;
    }
   public void doAfterReturning(){
       System.out.println("返回通知");
   }
   public void doAfterThrowing(JoinPoint jp,Throwable ex){
       System.out.println("异常通知！！！！！！！！！！！！！！");
       System.out.println(ex.getMessage());
       System.out.println("异常通知！！！！！！！！！！！！！！");
   }

}
