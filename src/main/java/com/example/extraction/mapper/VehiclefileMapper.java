package com.example.extraction.mapper;

import com.example.extraction.entity.Vehiclefile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface VehiclefileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Vehiclefile record);

    Vehiclefile selectByPrimaryKey(Integer id);

    int deleteName(Map<String, Object> map);

    List<Vehiclefile> selectAll();

    int updateByPrimaryKey(Vehiclefile record);

    int selectVehiclefileCount(Map<String, Object> map);

    int selectTprjCheliangInfoCount();

    List<Vehiclefile> list(Map<String, Object> map);

    List<Vehiclefile> listcg(Map<String, Object> map);

    int insertBigData(@Param("list")List<Vehiclefile> list)throws Exception;

    int updatecgBigData(@Param("list")List<Vehiclefile> list);
}