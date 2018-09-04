package com.example.extraction.service;


import com.example.extraction.entity.Truckingorder;

import java.util.List;
import java.util.Map;

/**
 * @author zwq
 */
public interface TruckingorderService {

    List<Truckingorder> list(String dbid, Map<String, Object> map);
    public int insertBigData(List<Truckingorder> mode)throws Exception;
    int updatecgBigData(String dbid,List<Truckingorder> list)throws Exception;
    Map<String, Object> insertBig(Map<String, Object> params) throws Exception;
    int deleteName(Map<String, Object> map) throws Exception;
}
