package com.example.extraction.controller;

import com.example.common.config.DruidConfig;
import com.example.common.constants.DBConstants;
import com.example.extraction.entity.Canmileage;
import com.example.extraction.service.CanmileageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.example.common.constants.DBConstants.dbNameMap;


/**
 * Created by zwq on 2018/6/21.
 */
@Controller
@RequestMapping("/data/")
public class DataSourceNameController {

    @Autowired
    private CanmileageService canmileageService;

    @RequestMapping(value = "/nameList")
    @ResponseBody
    public Map<String, Object> nameList(){
        Map<String, Object> mapname =new LinkedHashMap<>();
        mapname.put("datasize",DruidConfig.customDataSourceNames.size());
        for (int i = 0; i <DruidConfig.customDataSourceNames.size() ; i++) {
            mapname.put(DruidConfig.customDataSourceNames.get(i),dbNameMap.get(DBConstants.DBType.valueOf(DruidConfig.customDataSourceNames.get(i))));
        }
        return mapname;
    }
}
