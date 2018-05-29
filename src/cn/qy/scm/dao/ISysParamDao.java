package cn.qy.scm.dao;

import cn.qy.scm.entity.SysParam;

import java.util.List;
import java.util.Map;

public interface ISysParamDao extends BaseDao {
    List<SysParam> selectOtherTable(String sql);
    List<SysParam> selectList(String type);
}
