package com.example.extraction.service;


import com.example.extraction.entity.Vehiclefile;

import java.util.List;
import java.util.Map;

/**
 * @author zwq
 */
public interface VehiclefileService {

    int selectVehiclefileCount(String dbid,Map<String, Object> map);
    int selectTprjCheliangInfoCount(String dbid);
    List<Vehiclefile> list(String dbid, Map<String, Object> map);
    public int insertBigData(List<Vehiclefile> mode)throws Exception;
    int updatecgBigData(String dbid,List<Vehiclefile> list)throws Exception;
    Map<String, Object> insertBig(Map<String, Object> params) throws Exception;
    int deleteName(Map<String, Object> map) throws Exception;
}
