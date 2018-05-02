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

@Service("accountService")
public class AccountService implements IAccountService {

    @Resource
    private IAccountDao accountDao;
    @Override
    public int insert(Account account) throws Exception {
        return accountDao.insert(account);

    }
}
