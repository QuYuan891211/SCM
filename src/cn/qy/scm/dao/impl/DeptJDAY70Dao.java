package cn.qy.scm.dao.impl;

import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.entity.Supplier;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("deptJDAY70Dao")
public class DeptJDAY70Dao implements IDeptJDAY70Dao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    public int insert(DeptJDAY70 deptJDAY70) throws Exception {
        return sqlSessionTemplate.insert("cn.qy.scm.dao.IDeptJDAY70Dao.insert",deptJDAY70);
    }

    @Override
    public DeptJDAY70 selectById(DeptJDAY70 deptJDAY70) throws Exception {
        return sqlSessionTemplate.selectOne("cn.qy.scm.dao.IDeptJDAY70Dao.selectById",deptJDAY70);
    }



    @Override
    public int deleteById(DeptJDAY70 deptJDAY70) throws Exception {
        return sqlSessionTemplate.delete("cn.qy.scm.dao.IDeptJDAY70Dao.deleteById",deptJDAY70);
    }

    @Override
    public int updateById(DeptJDAY70 deptJDAY70) throws Exception {
        return sqlSessionTemplate.update("cn.qy.scm.dao.IDeptJDAY70Dao.updateById",deptJDAY70);
    }

    @Override
    public List<DeptJDAY70> findAll() throws Exception {
        return sqlSessionTemplate.selectList("cn.qy.scm.dao.IDeptJDAY70Dao.findAll");
    }

    @Override
    public int deleteAll() throws Exception {
        return sqlSessionTemplate.delete("cn.qy.scm.dao.IDeptJDAY70Dao.deleteAll");
    }

}
