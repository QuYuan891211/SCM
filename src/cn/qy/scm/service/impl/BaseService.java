package cn.qy.scm.service.impl;

import cn.qy.scm.dao.BaseDao;
import cn.qy.scm.dao.IAccountDao;
import cn.qy.scm.dao.IDeptJDAY70Dao;
import cn.qy.scm.dao.ISupplierDao;
import cn.qy.scm.entity.Pagination;
import cn.qy.scm.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BaseService<T> implements IBaseService<T> {
    @Autowired
    protected IDeptJDAY70Dao deptJDAY70Dao;

    @Autowired
    protected IAccountDao accountDao;
    @Autowired
    protected ISupplierDao supplierDao;

    protected BaseDao<T> baseDao;


    @PostConstruct
    private void initBaseMapper() throws Exception{
        Class baseClass = this.getClass().getSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class entityClass = (Class)parameterizedType.getActualTypeArguments()[0];
        String daoName = entityClass.getSimpleName().substring(0,1).toLowerCase() + entityClass.getSimpleName().substring(1) + "Dao";

        Field field = baseClass.getDeclaredField(daoName);
        Field baseField = baseClass.getDeclaredField("baseDao");
        baseField.set(this,field.get(this));

    }




    @Override
    public int insert(T t) throws Exception {
        return baseDao.insert(t);

    }

    @Override
    public T selectById(T t) throws Exception {
        return baseDao.selectById(t);
    }

    @Override
    public int deleteById(String[] pks) throws Exception {
        return baseDao.deleteById(pks);
    }

    @Override
    public int updateById(T t) throws Exception {
        return baseDao.updateById(t);
    }

    @Override
    public List<T> findAll() throws Exception {
        return baseDao.findAll();
    }

    @Override
    public int deleteAll() throws Exception {
        return baseDao.deleteAll();
    }

    @Override
    public Pagination<T> Pagination(Pagination pagination) throws Exception {
        pagination.setTotalNum(baseDao.count(pagination));
        pagination.setEntityList(baseDao.pagination(pagination));
        return pagination;
    }
}
