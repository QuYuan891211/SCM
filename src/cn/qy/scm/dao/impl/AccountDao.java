package cn.qy.scm.dao.impl;

import cn.qy.scm.dao.IAccountDao;
import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.DeptJDAY70;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("accountDao")
public class AccountDao implements IAccountDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    public int insert(Account account) throws Exception {
        return sqlSessionTemplate.insert("cn.qy.scm.dao.IAccountDao.insert",account);
    }

    @Override
    public Account selectById(Object o) throws Exception {
        return sqlSessionTemplate.selectOne("cn.qy.scm.dao.IAccountDao.selectById",o);
    }



    @Override
    public int deleteById(Object o) throws Exception {
        return sqlSessionTemplate.delete("cn.qy.scm.dao.IAccountDao.deleteById",o);
    }

    @Override
    public int updateById(Object o) throws Exception {
        return sqlSessionTemplate.update("cn.qy.scm.dao.IAccountDao.updateById",o);
    }

    @Override
    public List<Account> findAll() throws Exception {
        return sqlSessionTemplate.selectList("cn.qy.scm.dao.IAccountDao.findAll");
    }

    @Override
    public int deleteAll() throws Exception {
        return sqlSessionTemplate.delete("cn.qy.scm.dao.IAccountDao.deleteAll");
    }

}
