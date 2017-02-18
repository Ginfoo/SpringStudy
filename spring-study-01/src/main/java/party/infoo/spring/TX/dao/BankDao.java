package party.infoo.spring.TX.dao;

/**
 * Created by infoo on 2017/2/19.
 */
public interface BankDao {
    public void inMoney(int money, int userId);

    public void outMoney(int money, int userId);
}
