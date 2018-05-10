package cn.qy.scm.service;

import cn.qy.scm.entity.Pagination;
import cn.qy.scm.entity.Supplier;

import java.util.List;

public interface IBaseService<T> {
    //添加实体对象信息到表
    int insert(T t) throws Exception;
    //根据对象主键查询
    T selectById(T t) throws Exception;
    //根据对象主键删除
    int deleteById(String[] pks) throws Exception;
    //根据对象主键修改
    int updateById(T t) throws Exception;
    //查询全部
    List<T> findAll() throws Exception;
    //删除全部
    int deleteAll() throws Exception;

    Pagination<T> Pagination(Pagination pagination) throws Exception;
}
