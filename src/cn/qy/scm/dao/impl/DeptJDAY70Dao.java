package cn.qy.scm.dao.impl;

import cn.qy.scm.entity.DeptJDAY70;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("DeptJDAY70Dao")
public class DeptJDAY70Dao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    public int insert(DeptJDAY70 deptJDAY70) throws Exception {
        return sqlSessionTemplate.insert("DeptJDAY70.insert",deptJDAY70);
    }

}
