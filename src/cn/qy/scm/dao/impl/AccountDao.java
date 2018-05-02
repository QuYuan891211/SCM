package cn.qy.scm.dao.impl;

import cn.qy.scm.dao.IAccountDao;
import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.DeptJDAY70;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("accountDao")
public class AccountDao implements IAccountDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    public int insert(Account account) throws Exception {
        return sqlSessionTemplate.insert("cn.qy.scm.dao.IAccountDao.insert",account);
    }

}
