package cn.qy.scm.service.impl;

import cn.qy.scm.dao.IAccountDao;
import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.Pagination;
import cn.qy.scm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountService extends BaseService<Account> implements IAccountService {

    @Override
    public List<Account> selectByNameAndPassword(Account account) {
        return accountDao.selectByNameAndPassword(account);
    }
}
