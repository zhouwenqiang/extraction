package com.example.extraction.service.impl;


import com.example.common.annotation.DataSourceAnnotation;
import com.example.common.annotation.InsertBigDataLog;
import com.example.common.constants.DBConstants;
import com.example.common.utils.DateUtils;
import com.example.extraction.entity.Canmileage;
import com.example.extraction.mapper.CanmileageMapper;
import com.example.extraction.service.CanmileageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import static com.example.common.constants.DBConstants.dbNameMap;


@Service
public class CanmileageServiceImpl implements CanmileageService {

    @Autowired
    private CanmileageMapper canmileageMapper;

    @Autowired
    private CanmileageService canmileageService;

    @Override
    @DataSourceAnnotation
    public List<Canmileage> list(String dbid, Map<String, Object> map) {
        return canmileageMapper.list(map);
    }

    @Override
    public int insertTrainRecordBatch(List<Canmileage> mode) throws Exception {
        return canmileageMapper.insertTrainRecordBatch(mode);
    }

    @Override
    @InsertBigDataLog
    public Map<String, Object> insertBig(Map<String, Object> params) throws Exception {
        Map<String, Object> map=new HashMap<>();
        if(params.size()>0) {
            map.put("selectobject","canmileage");
            params.put("dbid",(params.get("dbid")+"").toUpperCase());
            map.put("corpname", dbNameMap.get(DBConstants.DBType.valueOf(params.get("dbid")+"")));
            List<Canmileage> list = new ArrayList<>();
            try {
                params.put("corpname",map.get("corpname"));
                params.put("newdate",DateUtils.getPastDate(1)+" 00:00:00");
                long startTime = System.currentTimeMillis();
                list=canmileageService.list(params.get("dbid").toString(), params);
                map.put("selectnumber",list.size() );
                map.put("selecttime", (System.currentTimeMillis() - startTime));
                map.put("state", 1);
                map.put("remark", "成功");
            } catch (Exception e) {
                e.printStackTrace();
                map.put("remark", e.getMessage());
                map.put("state", 0);
            }
            if (list.size() > 0) {
                try {
                    long startTime = System.currentTimeMillis();
                    int insertnumber = canmileageService.insertTrainRecordBatch(list);
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

}
