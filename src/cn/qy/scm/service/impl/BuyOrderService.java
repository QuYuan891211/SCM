package cn.qy.scm.service.impl;

import cn.qy.scm.entity.BuyOrder;
import cn.qy.scm.entity.BuyOrderDetail;
import cn.qy.scm.service.IBuyOrderService;
import org.springframework.stereotype.Service;

@Service("buyOrderService")
public class BuyOrderService extends BaseService<BuyOrder> implements IBuyOrderService {
    @Override
    public int insert(BuyOrder buyOrder) throws Exception {
        buyOrder.setUUID();
        int i = 0;
        for(BuyOrderDetail buyOrderDetail:buyOrder.getBuyOrderDetails()){
            buyOrderDetail.setBoId(buyOrder.getBoId());
            buyOrderDetail.setUUID();
        }
        i = buyOrderDao.insert(buyOrder);
        buyOrderDetailDao.insertList(buyOrder.getBuyOrderDetails());
        return i;
    }
}
