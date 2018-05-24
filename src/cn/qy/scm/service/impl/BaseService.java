package cn.qy.scm.service.impl;

import cn.qy.scm.dao.*;
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
    protected IBuyOrderDao buyOrderDao;

    @Autowired
    protected IBuyOrderDetailDao buyOrderDetailDao;
    @Autowired
    protected IAccountDao accountDao;
    @Autowired
    protected ISupplierDao supplierDao;

    @Autowired
    protected IGoodsDao goodsDao;

    protected BaseDao<T> baseDao;


    @PostConstruct
    private void initBaseMapper() throws Exception{
        //目的：需要把让父类对象由子类实例化 即BaseDao baseDao = new SupplierDao();or BaseDao baseDao = new AccountDao()
        //但此时不需要new， SPRING容器中已经存在Mapper代理实现实现类的，需要把这个实现类的对象赋过去
        //1.获取BaseService的泛型参数
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class entityClass  = (Class) parameterizedType.getActualTypeArguments()[0];
        String childDaoName = entityClass.getSimpleName().substring(0,1).toLowerCase() + entityClass.getSimpleName().substring(1) + "Dao";
        Field field = this.getClass().getSuperclass().getDeclaredField(childDaoName);
        Field baseField = this.getClass().getSuperclass().getDeclaredField("baseDao");
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
