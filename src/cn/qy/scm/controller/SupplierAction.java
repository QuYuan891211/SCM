package cn.qy.scm.controller;

import cn.qy.scm.entity.Pagination;
import cn.qy.scm.entity.Supplier;
import cn.qy.scm.service.ISupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/supplier")
public class SupplierAction extends BaseAction{
    @Resource
    private ISupplierService supplierService;

    @RequestMapping(value = "/insertSupplier")
    public @ResponseBody int insert(Supplier supplier) throws Exception {
        int i = 0;
        try{
            supplier.setUUID();
            supplierService.insert(supplier);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return i;
    }

    @RequestMapping(value = "/deleteById")
    public @ResponseBody int deleteById(String[] pks) throws Exception {
        int i = 0;
        if(pks != null && pks.length > 0){
           i = supplierService.deleteById(pks);
        }
        return i;
    }


    @RequestMapping(value="/updateById")
    public @ResponseBody int updateById(Supplier supplier){
        int i = 0;
        if (supplier != null && supplier.getId() != null){
            try {
             i= supplierService.updateById(supplier);
            }catch (Exception e){
               e.printStackTrace();
            }

        }

        return i;
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
