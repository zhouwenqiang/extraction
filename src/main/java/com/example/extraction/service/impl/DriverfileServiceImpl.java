package com.example.extraction.service.impl;


import com.example.common.annotation.DataSourceAnnotation;
import com.example.common.annotation.InsertBigDataLog;
import com.example.common.constants.DBConstants;
import com.example.extraction.entity.Driverfile;
import com.example.extraction.mapper.DriverfileMapper;
import com.example.extraction.service.DriverfileService;
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
public class DriverfileServiceImpl implements DriverfileService {

    @Autowired
    private DriverfileMapper driverfileMapper;

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    private DriverfileService driverfileService;
    @Override
    @DataSourceAnnotation
    @Transactional
    public List<Driverfile> list(String dbid,Map<String, Object> map) {
        if(dbid.equals("lwcgdb")){
            return driverfileMapper.list(map);
        }else{
            return driverfileMapper.listcg(map);
        }
    }

    @Override
    @Transactional
    public int insertBigData(List<Driverfile> mode) throws Exception {
        int result = 0;
        SqlSession batchSqlSession = null;
        try {
            batchSqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
            DriverfileMapper mapper = batchSqlSession.getMapper(DriverfileMapper.class);
            int batchCount = 1000;
            int batchLastIndex = batchCount;
            for (int index = 0; index < mode.size();) {
                if (batchLastIndex >= mode.size()) {
                    batchLastIndex = mode.size();
                   // batchSqlSession.insert("Driverfile.insertBigData",mode.subList(index, batchLastIndex));
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
    @Transactional
    public int updatecgBigData(String dbid,List<Driverfile> list) throws Exception{
        return driverfileMapper.updatecgBigData(list);
    }

    @Override
    @InsertBigDataLog
    public Map<String, Object> insertBig(Map<String, Object> params) throws Exception {
        Map<String, Object> map=new HashMap<>();
        if(params.size()>0) {
            map.put("selectobject","Driverfile");
            params.put("dbid",(params.get("dbid")+"").toUpperCase());
            map.put("corpname", dbNameMap.get(DBConstants.DBType.valueOf(params.get("dbid")+"")));
            List<Driverfile> list = new ArrayList<>();
            try {
                params.put("corpname",map.get("corpname"));
                long startTime = System.currentTimeMillis();
                list=driverfileService.list(params.get("dbid").toString(), params);
                map.put("selectnumber",list.size() );
                map.put("selecttime", (System.currentTimeMillis() - startTime));
                map.put("state", 1);
                map.put("remark", "成功");
            } catch (Exception e) {
                e.printStackTrace();
                map.put("remark", e.getMessage());
                map.put("state", 0);
                throw new Exception(e);
            }
            if (list.size() > 0) {
                try {
                    driverfileService.deleteName(params);
                    long startTime = System.currentTimeMillis();
                    int insertnumber = driverfileService.insertBigData(list);
                    map.put("insertnumber", insertnumber);
                    map.put("inserttime", (System.currentTimeMillis() - startTime));
                    map.put("state", 1);
                    map.put("remark", "成功");
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
        return driverfileMapper.deleteName(map);
    }


}
