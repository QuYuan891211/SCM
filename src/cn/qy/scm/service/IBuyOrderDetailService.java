package cn.qy.scm.service;

import cn.qy.scm.entity.BuyOrderDetail;

import java.util.List;

public interface IBuyOrderDetailService extends IBaseService<BuyOrderDetail> {
    int insertBuyOrderDetailList(List<BuyOrderDetail> buyOrderDetailList);
}
