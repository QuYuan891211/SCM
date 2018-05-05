package cn.qy.scm.service.impl;

import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.entity.Pagination;
import cn.qy.scm.service.IDeptJDAY70Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("deptJDAY70Service")
public class DeptJDAY70Service implements IDeptJDAY70Service {

    @Autowired
    private IDeptJDAY70Dao deptJDAY70Dao;
    @Override
    public int insert(DeptJDAY70 deptJDAY70) throws Exception {
        return deptJDAY70Dao.insert(deptJDAY70);

    }

    @Override
    public DeptJDAY70 selectById(DeptJDAY70 deptJDAY70) throws Exception {
        return deptJDAY70Dao.selectById(deptJDAY70);
    }

    @Override
    public int deleteById(DeptJDAY70 deptJDAY70) throws Exception {
        return deptJDAY70Dao.deleteById(deptJDAY70);
    }

    @Override
    public int updateById(DeptJDAY70 deptJDAY70) throws Exception {
        return deptJDAY70Dao.updateById(deptJDAY70);
    }

    @Override
    public List<DeptJDAY70> findAll() throws Exception {
        return deptJDAY70Dao.findAll();
    }

    @Override
    public int deleteAll() throws Exception {
        return deptJDAY70Dao.deleteAll();
    }

    @Override
    public Pagination<DeptJDAY70> Pagination(Pagination pagination) throws Exception {
        return null;
    }
}
