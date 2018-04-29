package cn.qy.scm.service.impl;

import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.service.IDeptJDAY70Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("deptJDAY70Service")
public class DeptJDAY70Service implements IDeptJDAY70Service {

    @Resource
    private IDeptJDAY70Dao deptJDAY70Dao;
    @Override
    public int insert(DeptJDAY70 deptJDAY70) throws Exception {
        return deptJDAY70Dao.insert(deptJDAY70);

    }
}
