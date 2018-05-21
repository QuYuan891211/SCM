package cn.qy.scm.dao;

import cn.qy.scm.entity.BuyOrderDetail;

import java.util.List;

public interface IBuyOrderDetailDao extends BaseDao<BuyOrderDetail> {
    int insertList(List<BuyOrderDetail> buyOrderDetailsList);
}
