package cn.qy.scm.controller;

import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.Supplier;
import cn.qy.scm.service.IAccountService;
import cn.qy.scm.service.ISupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/supplier")
public class SupplierAction {
    @Resource
    private ISupplierService supplierService;

    @RequestMapping(value = "/insertSupplier")
    public String insert(Supplier supplier) throws Exception {
        supplier.setId();
        supplierService.insert(supplier);
        return "forward:/JSP/main.jsp";
    }
}
