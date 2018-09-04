package com.example.extraction.mapper;

import com.example.extraction.entity.Truckingorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface TruckingorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Truckingorder record);

    Truckingorder selectByPrimaryKey(Integer id);

    List<Truckingorder> selectAll();
    int deleteName(Map<String, Object> map);
    int updateByPrimaryKey(Truckingorder record);

    int selectTruckingorderCount(Map<String, Object> map);

    int selectTprjYcsqGongcheCount(Map<String, Object> map);

    List<Truckingorder> list(Map<String, Object> map);

    List<Truckingorder> listcg(Map<String, Object> map);

    int insertBigData(@Param("list")List<Truckingorder> list)throws Exception;

    int updatecgBigData(@Param("list")List<Truckingorder> list);
}