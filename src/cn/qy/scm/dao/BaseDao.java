package cn.qy.scm.dao;

import java.util.List;

public interface BaseDao<T> {
    //添加实体对象信息到表
    int insert(T t) throws Exception;
    //根据对象主键查询
    T selectById(Object o) throws Exception;
    //根据对象主键删除
    int deleteById(Object o) throws Exception;
    //根据对象主键修改
    int updateById(Object o) throws Exception;
    //查询全部
    List<T> findAll() throws Exception;
    //删除全部
    int deleteAll() throws Exception;
}
