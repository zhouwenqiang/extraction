package com.example.extraction.service;


import com.example.extraction.entity.Canmileage;

import java.util.List;
import java.util.Map;

/**
 * @author zwq
 */
public interface CanmileageService {

    List<Canmileage> list(String dbid, Map<String, Object> map);

    public int insertTrainRecordBatch(List<Canmileage> mode) throws Exception;
    Map<String, Object> insertBig(Map<String, Object> params) throws Exception;
}
