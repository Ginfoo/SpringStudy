package party.infoo.spring.DI.entity;

/**
 * Created by infoo on 2017/2/18.
 */
public class User {
    private long userId;
    private String userName;
    private String userPass;
    private int userAge;

    public long getUserId() {
        return userId;
    }
    public User(){
        super();
        System.out.println("调用了默认构造函数");
    }

    public User(long userId, String userName, String userPass, int userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.userAge = userAge;
        System.out.println("调用了含参构造函数");
    }

    public void setUserId(long userId) {
        System.out.println("调用了setUserId方法");
        this.userId = userId;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("调用了setUserName方法");
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        System.out.println("调用了setUserName方法");
        this.userPass = userPass;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        System.out.println("调用了setUserAge方法");
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userAge=" + userAge +
                '}';
    }
    public void toSout(){
        System.out.println(this.toString());
    }
}
