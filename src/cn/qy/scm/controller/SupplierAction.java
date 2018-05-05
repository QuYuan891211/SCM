package cn.qy.scm.controller;

import cn.qy.scm.entity.Account;
import cn.qy.scm.entity.Pagination;
import cn.qy.scm.entity.Supplier;
import cn.qy.scm.service.IAccountService;
import cn.qy.scm.service.ISupplierService;
import org.codehaus.jackson.map.Serializers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/supplier")
public class SupplierAction extends BaseAction{
    @Resource
    private ISupplierService supplierService;

    @RequestMapping(value = "/insertSupplier")
    public String insert(Supplier supplier) throws Exception {
        supplier.setId();
        supplierService.insert(supplier);
        return "forward:/main.jsp";
    }

    @RequestMapping(value = "/pagination")
    public @ResponseBody Map<String,Object> Pagination(Pagination<Supplier> pagination, Supplier supplier)throws Exception{
        pagination.setKeywords(supplier.getName());
        pagination.setStartNext();
        pagination = supplierService.Pagination(pagination);

        Map<String,Object> map = new LinkedHashMap<String,Object>();
        map.put("total",pagination.getTotalNum());
        map.put("rows",pagination.getEntityList());
        return map;
    }
}
