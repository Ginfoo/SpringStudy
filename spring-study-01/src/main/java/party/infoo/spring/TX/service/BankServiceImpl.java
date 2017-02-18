package party.infoo.spring.TX.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import party.infoo.spring.TX.dao.BankDao;

/**
 * Created by infoo on 2017/2/19.
 */
public class BankServiceImpl implements BankService {
    private BankDao bankDao;
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }

    /**
     * 编程式事务
     * @param money
     * @param userIdA
     * @param userIdB
     */
    @Override
    public void transferAccountFormAtoB(int money, int userIdA, int userIdB) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                bankDao.outMoney(money,userIdA);
                bankDao.inMoney(money,userIdB);
            }
        });

    }
}
