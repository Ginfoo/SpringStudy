package party.infoo.spring.TX.service;

import org.springframework.transaction.annotation.Transactional;
import party.infoo.spring.TX.dao.BankDao;

/**
 * Created by infoo on 2017/2/19.
 */
//@Transactional  使用注解配置事务
public class BankServiceImpl_xml implements BankService {
    private BankDao bankDao;

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }

    /**
     * xml声明式事务管理
     *
     * @param money
     * @param userIdA
     * @param userIdB
     */
    @Override
    public void transferAccountFormAtoB(int money, int userIdA, int userIdB) {
        bankDao.outMoney(money, userIdA);
        bankDao.inMoney(money, userIdB);
    }
}
