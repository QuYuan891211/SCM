package cn.qy.scm.controller;

import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.DeptJDAY70;
import cn.qy.scm.service.IAccountService;
import cn.qy.scm.service.IDeptJDAY70Service;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/account")
public class AccountAction extends BaseAction{
    @Resource
    private IAccountService accountService;

    @RequestMapping(value = "/insertAccount")
    public String insert(Account account) throws Exception {
        account.setId();
        accountService.insert(account);
        return "forward:/main.jsp";
    }

    @RequestMapping(value = "/loginAccount")
    public String login(Account account, HttpServletRequest request, HttpServletResponse response){
        if(account != null||account.getLoginName() != null||account.getPassword()!=null){
            if(account.getLoginName().trim().length()>0 || account.getPassword().trim().length()>0){
                try {
                    List<Account> accountList = accountService.selectByNameAndPassword(account);
                    if (accountList.size()>0){
//                        System.out.println(accountList.get(0));
                        request.getSession().setAttribute("userName",accountList.get(0).getName());
                        return "forward:/main.jsp";
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        request.setAttribute("msg","error,please input again");
        return "forward:/index.jsp";

    }
}
