package com.example.extraction.service.impl;


import com.example.common.annotation.DataSourceAnnotation;
import com.example.extraction.entity.DtvActionlog;
import com.example.extraction.mapper.DtvActionlogMapper;
import com.example.extraction.service.DtvActionlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class DtvActionlogServiceImpl implements DtvActionlogService {

    @Autowired
    private DtvActionlogMapper dtvActionlogMapper;

    @Override
    public List<DtvActionlog> list(Map<String, Object> map) {
        return dtvActionlogMapper.list(map);
    }

    @Override
    public int insert(DtvActionlog record) {
        return dtvActionlogMapper.insert(record);
    }
}
