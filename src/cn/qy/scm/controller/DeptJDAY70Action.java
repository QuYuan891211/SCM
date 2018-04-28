package cn.qy.scm.controller;

import cn.qy.scm.dao.impl.DeptJDAY70Dao;
import cn.qy.scm.entity.DeptJDAY70;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/dept")
public class DeptJDAY70Action {
    @Resource
    private DeptJDAY70Dao deptJDAY70Dao;

    @RequestMapping(value = "/insertDept")
    public String insert(DeptJDAY70 deptJDAY70) throws Exception {
        deptJDAY70.setId();
        deptJDAY70Dao.insert(deptJDAY70);
        return "forward:/JSP/main.jsp";
    }
}
