package cn.qy.scm.service.impl;

import cn.qy.scm.dao.ISysParamDao;
import cn.qy.scm.entity.SysParam;
import cn.qy.scm.service.ISysParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service("sysParamService")
public class SysParamService extends BaseService<SysParam> implements ISysParamService {



    @Override
    public Map<String, Object> selectList() {
        Map<String,Object> sysParamMap = new HashMap<String,Object>();
        Map<String,Object> fieldMap = null;
        List<SysParam> sysParamsList = sysParamDao.selectList("");
        if(sysParamsList.size() < 1){return null;}
        for(SysParam sysParam:sysParamsList ){

            if("1".equals(sysParam.getSysParamType())){
                String sql = sysParam.getSysParamValue();
                System.out.println("===========" + sql);
                List<SysParam> otherList= sysParamDao.selectOtherTable(sql);
                if(otherList.size() < 1){return null;}
                fieldMap = new HashMap<String, Object>();
                for (SysParam otherSysParam1:otherList){
                    fieldMap.put(otherSysParam1.getSysParamValue(),otherSysParam1.getSysParamText());

                }
                sysParamMap.put(sysParam.getSysParamField(),fieldMap);
            }else {
                //            1. 系统参数中没有此类型，则新增此类型
                if(sysParamMap.get(sysParam.getSysParamField())==null){
                    fieldMap = new HashMap<String, Object>();
                    fieldMap.put(sysParam.getSysParamValue(),sysParam.getSysParamText());
                    sysParamMap.put(sysParam.getSysParamField(),fieldMap);
                }else {
//                    2. 系统参数中有此类型，则增加此类型
                   fieldMap = (Map<String, Object>) sysParamMap.get(sysParam.getSysParamField());
                   fieldMap.put(sysParam.getSysParamValue(),sysParam.getSysParamText());
                    System.out.println("============"+((Map<String, Object>) sysParamMap.get(sysParam.getSysParamField())).get(sysParam.getSysParamValue()));
            }
            }
        }
        return sysParamMap;
    }
}
