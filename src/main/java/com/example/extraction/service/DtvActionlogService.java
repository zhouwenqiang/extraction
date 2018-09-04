package com.example.extraction.service;


import com.example.extraction.entity.DtvActionlog;

import java.util.List;
import java.util.Map;

/**
 * @author zwq
 */
public interface DtvActionlogService {

    List<DtvActionlog> list(Map<String, Object> map);

    int insert(DtvActionlog record);
}
