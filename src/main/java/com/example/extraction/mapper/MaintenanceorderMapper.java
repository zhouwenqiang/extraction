package com.example.extraction.mapper;

import com.example.extraction.entity.Maintenanceorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MaintenanceorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Maintenanceorder record);

    int deleteName(Map<String, Object> map);

    Maintenanceorder selectByPrimaryKey(Integer id);

    List<Maintenanceorder> selectAll();

    int updateByPrimaryKey(Maintenanceorder record);

    List<Maintenanceorder> list(Map<String, Object> map);

    List<Maintenanceorder> listcg(Map<String, Object> map);

    int insertBigData(@Param("list")List<Maintenanceorder> list)throws Exception;

    int updatecgBigData(@Param("list")List<Maintenanceorder> list);
}