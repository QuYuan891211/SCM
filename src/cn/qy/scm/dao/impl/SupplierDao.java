package cn.qy.scm.dao.impl;

import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.dao.ISupplierDao;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.entity.Supplier;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("supplierDao")
public class SupplierDao implements ISupplierDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    public int insert(Supplier supplier) throws Exception {
        return sqlSessionTemplate.insert("cn.qy.scm.dao.ISupplierDao.insert",supplier);
    }

}
