package com.example.extraction.mapper;

import com.example.extraction.entity.Driverfile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DriverfileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Driverfile record);

    Driverfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Driverfile record);

    List<Driverfile> list(Map<String, Object> map);

    List<Driverfile> listcg(Map<String, Object> map);

    int deleteName(Map<String, Object> map);

    int insertBigData(@Param("list")List<Driverfile> list);

    int updatecgBigData(@Param("list")List<Driverfile> list);
}