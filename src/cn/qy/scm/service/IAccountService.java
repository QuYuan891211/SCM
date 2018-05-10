package cn.qy.scm.service;

import cn.qy.scm.entity.Account;

import java.util.List;

public interface IAccountService extends IBaseService<Account> {
    List<Account> selectByNameAndPassword(Account account);
}
