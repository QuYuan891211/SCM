package cn.qy.scm.controller;

import cn.qy.scm.entity.BuyOrder;
import cn.qy.scm.entity.BuyOrderDetail;
import cn.qy.scm.service.IBuyOrderService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;

@Controller
@RequestMapping(value = "/buyOrder")
public class BuyOrderAction extends BaseAction{
    @Resource
    private IBuyOrderService buyOrderService;

    @RequestMapping(value = "/insertBuyOrder")
    public @ResponseBody Object insertBuyOrder(BuyOrder buyOrder,String rows){
        System.out.println("buyorderaction.buyOrder："+buyOrder);
        System.out.println("buyorderaction.把json作为字符串的采购单明细："+rows);
        int i = 0;
        if(rows != null || rows.trim().length() > 0){

            ObjectMapper objectMapper = new ObjectMapper();
            try{
                BuyOrderDetail[] buyOrderDetails = null;
                buyOrderDetails = objectMapper.readValue(rows,BuyOrderDetail[].class);
                buyOrder.setBuyOrderDetails(Arrays.asList(buyOrderDetails));
                i = buyOrderService.insert(buyOrder);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return i;

    }

}
