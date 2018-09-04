package com.example.extraction.mapper;

import com.example.extraction.entity.Canmileage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CanmileageMapper {
    /*int deleteByPrimaryKey(Integer id);

    int insert(Canmileage record);

    Canmileage selectByPrimaryKey(Integer id);

    List<Canmileage> selectAll();

    int updateByPrimaryKey(Canmileage record);*/

    List<Canmileage> list(Map<String, Object> map);

    int insertTrainRecordBatch(List<Canmileage> mode) throws Exception;
}