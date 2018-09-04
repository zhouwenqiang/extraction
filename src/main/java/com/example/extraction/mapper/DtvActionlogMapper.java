package com.example.extraction.mapper;

import com.example.extraction.entity.DtvActionlog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DtvActionlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DtvActionlog record);

    DtvActionlog selectByPrimaryKey(Integer id);

    List<DtvActionlog> selectAll();

    int updateByPrimaryKey(DtvActionlog record);

    List<DtvActionlog> list(Map<String, Object> map);
}