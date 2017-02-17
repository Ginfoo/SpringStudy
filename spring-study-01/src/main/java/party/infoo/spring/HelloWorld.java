package party.infoo.spring;

/**
 * Created by infoo on 2017/2/18.
 */
public class HelloWorld {
    private String name;
    public HelloWorld(){
        System.out.println("调用HelloWorld构造器");
    }
    public void setName(String name){
        this.name=name;
    }
    public void sayHello(){
        System.out.println("Hello: "+name);
    }
}
