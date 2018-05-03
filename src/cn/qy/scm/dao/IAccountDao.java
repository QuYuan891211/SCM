package cn.qy.scm.dao;

import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.DeptJDAY70;

import java.util.List;

public interface IAccountDao extends BaseDao<Account> {
    List<Account> selectByNameAndPassword(Account account);
}
