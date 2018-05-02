package cn.qy.scm.service.impl;

import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.dao.ISupplierDao;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.entity.Supplier;
import cn.qy.scm.service.IDeptJDAY70Service;
import cn.qy.scm.service.ISupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("supplierService")
public class SupplierService implements ISupplierService {

    @Resource
    private ISupplierDao supplierDao;
    @Override
    public int insert(Supplier supplier) throws Exception {
        return supplierDao.insert(supplier);

    }
}
