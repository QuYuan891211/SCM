package cn.qy.scm.service;

import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.DeptJDAY70;

import java.util.List;

public interface IAccountService extends BaseService<Account> {
    List<Account> selectByNameAndPassword(Account account);
}
