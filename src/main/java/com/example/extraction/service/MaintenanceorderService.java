package com.example.extraction.service;


import com.example.extraction.entity.Maintenanceorder;

import java.util.List;
import java.util.Map;

/**
 * @author zwq
 */
public interface MaintenanceorderService {


    List<Maintenanceorder> list(String dbid, Map<String, Object> map);
    public int insertBigData(List<Maintenanceorder> mode)throws Exception;
    int updatecgBigData(String dbid,List<Maintenanceorder> list)throws Exception;
    Map<String, Object> insertBig(Map<String, Object> params) throws Exception;
    int deleteName(Map<String, Object> map) throws Exception;
}
