package cn.qy.scm.service.impl;

import cn.qy.scm.dao.IAccountDao;
import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.dao.ISupplierDao;
import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.service.IAccountService;
import cn.qy.scm.service.IDeptJDAY70Service;
import com.sun.org.apache.bcel.internal.generic.IADD;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("accountService")
public class AccountService implements IAccountService {

    @Resource
    private IAccountDao accountDao;
    @Override
    public int insert(Account account) throws Exception {
        return accountDao.insert(account);

    }

    @Override
    public Account selectById(Object o) throws Exception {
        return accountDao.selectById(o);
    }

    @Override
    public int deleteById(Object o) throws Exception {
        return accountDao.deleteById(o);
    }

    @Override
    public int updateById(Object o) throws Exception {
        return accountDao.updateById(o);
    }

    @Override
    public List<Account> findAll() throws Exception {
        return accountDao.findAll();
    }

    @Override
    public int deleteAll() throws Exception {
        return accountDao.deleteAll();
    }
}
