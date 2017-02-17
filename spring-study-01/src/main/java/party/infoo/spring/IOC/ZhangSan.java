package party.infoo.spring.IOC;

/**
 * Created by infoo on 2017/2/18.
 */
public class ZhangSan implements People {
    @Override
    public void doWork() {
        System.out.println("ZhangSan"+": 我做的工作");
    }
}
