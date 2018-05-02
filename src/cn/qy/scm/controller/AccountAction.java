package cn.qy.scm.controller;

import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.service.IAccountService;
import cn.qy.scm.service.IDeptJDAY70Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/account")
public class AccountAction {
    @Resource
    private IAccountService accountService;

    @RequestMapping(value = "/insertAccount")
    public String insert(Account account) throws Exception {
        account.setId();
        accountService.insert(account);
        return "forward:/JSP/main.jsp";
    }
}
