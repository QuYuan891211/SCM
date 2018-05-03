package cn.qy.scm.controller;

import cn.qy.scm.dao.impl.DeptJDAY70Dao;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.service.IDeptJDAY70Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/dept")
public class DeptJDAY70Action extends BaseAction{
    @Resource
    private IDeptJDAY70Service deptJDAY70Service;

    @RequestMapping(value = "/insertDept")
    public String insert(DeptJDAY70 deptJDAY70) throws Exception {
        deptJDAY70.setId();
        deptJDAY70Service.insert(deptJDAY70);
        return "forward:/JSP/main.jsp";
    }
}
