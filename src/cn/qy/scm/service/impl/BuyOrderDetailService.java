package cn.qy.scm.service.impl;

import cn.qy.scm.entity.BuyOrderDetail;
import cn.qy.scm.service.IBuyOrderDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("buyOrderDetailService")
public class BuyOrderDetailService extends BaseService<BuyOrderDetail> implements IBuyOrderDetailService {
    @Override
    public int insertBuyOrderDetailList(List<BuyOrderDetail> buyOrderDetailList) {
        return 0;
    }
}
