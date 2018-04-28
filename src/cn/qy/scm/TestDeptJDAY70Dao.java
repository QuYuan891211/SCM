package cn.qy.scm;

import cn.qy.scm.dao.impl.DeptJDAY70Dao;
import cn.qy.scm.entity.DeptJDAY70;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeptJDAY70Dao {
    //@Resource //这里没法使用，后继版本有其它方式可以注入
    static private DeptJDAY70Dao deptJDAY70Dao;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        deptJDAY70Dao=(DeptJDAY70Dao) context.getBean("DeptJDAY70Dao");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }


    @Test
    public void testInsertDept() throws Exception {
        DeptJDAY70 deptJDAY70=new DeptJDAY70("董事会",62188888);
        //dept.setDeptId(117);
        System.out.println("受影响行数："+ deptJDAY70Dao.insert(deptJDAY70));
    }
}
