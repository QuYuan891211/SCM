package cn.qy.scm.controller;

import cn.qy.scm.service.ISysParamService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping(value = "/loadSysParam")
public class SysParamAction extends BaseAction{
    @Resource
    private ISysParamService sysParamService;
    //系统启动时加载参数
    @PostConstruct
    public void initSysParam(){
        loadSysParam();
    }

    public void loadSysParam(){
        Map<String, Object> sysParamMap = sysParamService.selectList();
        servletContext.setAttribute("sysParam", sysParamMap);
        System.out.println("===================系统参数加载成功2=====================");
    }

    @RequestMapping(value = "/reload")
    public void reload(){
        loadSysParam();
    }
}
