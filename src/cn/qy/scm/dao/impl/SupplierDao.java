package cn.qy.scm.dao.impl;

import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.dao.ISupplierDao;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.entity.Supplier;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("supplierDao")
public class SupplierDao implements ISupplierDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    public int insert(Supplier supplier) throws Exception {
        return sqlSessionTemplate.insert("cn.qy.scm.dao.ISupplierDao.insert",supplier);
    }

    @Override
    public Supplier selectById(Supplier supplier) throws Exception {
        return sqlSessionTemplate.selectOne("cn.qy.scm.dao.ISupplierDao.selectById",supplier);
    }



    @Override
    public int deleteById(Supplier supplier) throws Exception {
        return sqlSessionTemplate.delete("cn.qy.scm.dao.ISupplierDao.deleteById",supplier);
    }

    @Override
    public int updateById(Supplier supplier) throws Exception {
        return sqlSessionTemplate.update("cn.qy.scm.dao.ISupplierDao.updateById",supplier);
    }

    @Override
    public List<Supplier> findAll() throws Exception {
        return sqlSessionTemplate.selectList("cn.qy.scm.dao.ISupplierDao.findAll");
    }

    @Override
    public int deleteAll() throws Exception {
        return sqlSessionTemplate.delete("cn.qy.scm.dao.ISupplierDao.deleteAll");
    }

}
