package com.example.extraction.service;


import com.example.extraction.entity.Driverfile;

import java.util.List;
import java.util.Map;

/**
 * @author zwq
 */
public interface DriverfileService {

    List<Driverfile> list(String dbid,Map<String, Object> map);
    int insertBigData(List<Driverfile> mode)throws Exception;
    int updatecgBigData(String dbid,List<Driverfile> list) throws Exception;
    Map<String, Object> insertBig(Map<String, Object> params) throws Exception;
    int deleteName(Map<String, Object> map) throws Exception;
}
