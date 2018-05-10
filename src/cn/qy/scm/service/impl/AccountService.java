package cn.qy.scm.service.impl;

import cn.qy.scm.dao.IAccountDao;
import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.Pagination;
import cn.qy.scm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDao accountDao;
    @Override
    public int insert(Account account) throws Exception {
        return accountDao.insert(account);

    }

    @Override
    public Account selectById(Account account) throws Exception {
        return accountDao.selectById(account);
    }

    @Override
    public int deleteById(String[] pks) throws Exception {
        return accountDao.deleteById(pks);
    }

    @Override
    public int updateById(Account account) throws Exception {
        return accountDao.updateById(account);
    }

    @Override
    public List<Account> findAll() throws Exception {
        return accountDao.findAll();
    }

    @Override
    public int deleteAll() throws Exception {
        return accountDao.deleteAll();
    }

    @Override
    public Pagination<Account> Pagination(Pagination pagination) throws Exception {
        return null;
    }

    @Override
    public List<Account> selectByNameAndPassword(Account account) {
        return accountDao.selectByNameAndPassword(account);
    }
}
