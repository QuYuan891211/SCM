package cn.qy.scm.service.impl;

import cn.qy.scm.dao.BaseDao;
import cn.qy.scm.entity.Goods;
import cn.qy.scm.service.IBaseService;
import cn.qy.scm.service.IGoodsService;
import org.springframework.stereotype.Service;

@Service("goodsService")
public class GoodsService extends BaseService<Goods> implements IGoodsService {
}
