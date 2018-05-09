package cn.qy.scm.service.impl;

import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.dao.ISupplierDao;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.entity.Pagination;
import cn.qy.scm.entity.Supplier;
import cn.qy.scm.service.IDeptJDAY70Service;
import cn.qy.scm.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("supplierService")
public class SupplierService implements ISupplierService {

    @Autowired
    private ISupplierDao supplierDao;
    @Override
    public int insert(Supplier supplier) throws Exception {
        return supplierDao.insert(supplier);

    }

    @Override
    public Supplier selectById(Supplier supplier) throws Exception {
        return supplierDao.selectById(supplier);
    }

    @Override
    public int deleteById(String[] pks) throws Exception {
        return supplierDao.deleteById(pks);
    }

    @Override
    public int updateById(Supplier supplier) throws Exception {
        return supplierDao.updateById(supplier);
    }

    @Override
    public List<Supplier> findAll() throws Exception {
        return supplierDao.findAll();
    }

    @Override
    public int deleteAll() throws Exception {
        return supplierDao.deleteAll();
    }

    @Override
    public Pagination<Supplier> Pagination(Pagination pagination) throws Exception {
        pagination.setTotalNum(supplierDao.count(pagination));
        pagination.setEntityList(supplierDao.pagination(pagination));
        return pagination;
    }
}
