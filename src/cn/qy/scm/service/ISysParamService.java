package cn.qy.scm.service;

import cn.qy.scm.entity.SysParam;

import java.util.List;
import java.util.Map;

public interface ISysParamService extends IBaseService<SysParam> {
    Map<String,Object> selectList();
}
