package cn.qy.scm.controller;

import cn.qy.scm.entity.Goods;
import cn.qy.scm.entity.Pagination;
import cn.qy.scm.entity.Supplier;
import cn.qy.scm.service.IGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/goods")
public class GoodsAction extends BaseAction {

    @Resource
    private IGoodsService goodsService;

    @RequestMapping(value = "/pagination")
    public @ResponseBody Map<String,Object> Pagination(Pagination<Goods> pagination, Goods goods)throws Exception {
        Map<String,Object> map = new LinkedHashMap<String,Object>();
        pagination.setKeywords(goods.getGoodsName());
        pagination.setStartNext();
        pagination =goodsService.Pagination(pagination);

        map.put("total",pagination.getTotalNum());
        map.put("rows",pagination.getEntityList());
        return map;
    }
}
