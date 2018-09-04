package com.example.extraction.service.impl;


import com.example.common.annotation.DataSourceAnnotation;
import com.example.common.annotation.InsertBigDataLog;
import com.example.common.constants.DBConstants;
import com.example.extraction.entity.Maintenanceorder;
import com.example.extraction.mapper.MaintenanceorderMapper;
import com.example.extraction.service.MaintenanceorderService;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.common.constants.DBConstants.dbNameMap;


@Service
public class MaintenanceorderServiceImpl implements MaintenanceorderService {

    @Autowired
    private MaintenanceorderMapper maintenanceorderMapper;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    private MaintenanceorderService maintenanceorderService;

    @Override
    public int insertBigData(List<Maintenanceorder> mode) throws Exception {
        int result = 0;
        SqlSession batchSqlSession = null;
        try {
            batchSqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
            MaintenanceorderMapper mapper = batchSqlSession.getMapper(MaintenanceorderMapper.class);
            int batchCount = 1000;
            int batchLastIndex = batchCount;
            for (int index = 0; index < mode.size();) {
                if (batchLastIndex >= mode.size()) {
                    batchLastIndex = mode.size();
                    result = result + mapper.insertBigData(mode.subList(index, batchLastIndex));

                    batchSqlSession.commit();
                    //清理缓存，防止溢出
                    batchSqlSession.clearCache();

                    System.out.println("index:" + index + " batchLastIndex:" + batchLastIndex);
                    result=batchLastIndex;
                    break;
                } else {
                    result = result + mapper.insertBigData(mode.subList(index, batchLastIndex));
                    batchSqlSession.commit();
                    //清理缓存，防止溢出
                    batchSqlSession.clearCache();
                    System.out.println("index:" + index+ " batchLastIndex:" + batchLastIndex);
                    index = batchLastIndex;
                    batchLastIndex = index + (batchCount - 1);
                    result=batchLastIndex;
                }
            }
            batchSqlSession.commit();
        }
        finally {
            batchSqlSession.close();
        }
        return result;
    }

    @Override
    @DataSourceAnnotation
    public int updatecgBigData(String dbid,List<Maintenanceorder> list) {
        return maintenanceorderMapper.updatecgBigData(list);
    }

    @Override
    @InsertBigDataLog
    public Map<String, Object> insertBig(Map<String, Object> params) throws Exception {
        Map<String, Object> map=new HashMap<>();
        if(params.size()>0) {
            map.put("selectobject","Maintenanceorder");
            params.put("dbid",(params.get("dbid")+"").toUpperCase());
            map.put("corpname", dbNameMap.get(DBConstants.DBType.valueOf(params.get("dbid")+"")));
            List<Maintenanceorder> list = new ArrayList<>();
            try {
                params.put("corpname",map.get("corpname"));
                long startTime = System.currentTimeMillis();
                list=maintenanceorderService.list(params.get("dbid").toString(), params);
                map.put("selectnumber",list.size() );
                map.put("selecttime", (System.currentTimeMillis() - startTime));
                map.put("state", 1);
                map.put("remark", "成功");
            } catch (Exception e) {
                map.put("remark", e.getMessage());
                map.put("state", 0);
                e.printStackTrace();
                throw new Exception(e);
            }
            if (list.size() > 0) {

                try {
                    maintenanceorderService.deleteName(params);
                    long startTime = System.currentTimeMillis();
                    int insertnumber = maintenanceorderService.insertBigData(list);
                    map.put("insertnumber", insertnumber);
                    map.put("inserttime", (System.currentTimeMillis() - startTime));
                    map.put("state", 1);
                    map.put("remark", "成功");
                  /*  try {
                        long startTimes = System.currentTimeMillis();
                        int updatenumber = maintenanceorderService.updatecgBigData(params.get("dbid").toString(), list);
                        map.put("updatenumber", updatenumber);
                        map.put("updatetime", (System.currentTimeMillis() - startTimes));
                        map.put("updateobject","tprj_ycsq_weixiu");
                        map.put("state", 1);
                        map.put("remark", "成功");
                    } catch (Exception e) {
                        e.printStackTrace();
                        map.put("state", 0);
                        map.put("remark", e.getMessage());
                        throw new Exception(e);
                    }*/
                } catch (Exception e) {
                    e.printStackTrace();
                    map.put("state", 0);
                    map.put("remark", e.getMessage());
                    throw new Exception(e);
                }

            }
        }
        return map;
    }

    @Override
    public int deleteName(Map<String, Object> map) throws Exception {
        return maintenanceorderMapper.deleteName(map);
    }

    @Override
    @DataSourceAnnotation
    public List<Maintenanceorder> list(String dbid, Map<String, Object> map) {
        if(dbid.equals("lwcgdb")){
            return maintenanceorderMapper.list(map);
        }else{
            return maintenanceorderMapper.listcg(map);
        }
    }
}
