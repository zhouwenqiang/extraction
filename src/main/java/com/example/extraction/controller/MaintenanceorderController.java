package com.example.extraction.controller;

import com.example.common.constants.DBConstants;
import com.example.common.utils.DateUtils;
import com.example.extraction.entity.Driverfile;
import com.example.extraction.entity.Maintenanceorder;
import com.example.extraction.entity.Vehiclefile;
import com.example.extraction.service.MaintenanceorderService;
import com.example.extraction.service.VehiclefileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.common.constants.DBConstants.dbNameMap;


/**
 * Created by zwq on 2018/6/21.
 */
@Controller
@RequestMapping("/extraction/maintenanceorder")
public class MaintenanceorderController {

    @Autowired
    private MaintenanceorderService maintenanceorderService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<Maintenanceorder> list(@RequestParam Map<String, Object> params){
        List<Maintenanceorder> list=maintenanceorderService.list(params.get("dbid").toString(),params);
        return list;
    }
    @RequestMapping(value = "/insertbigdata")
    @ResponseBody
    public Map<String, Object> insertbigdata(@RequestParam Map<String, Object> params){
        try {
            if(!params.containsKey("lastupdatetime")){
                params.put("lastupdatetime",DateUtils.getPastDate(1));
            }
            return maintenanceorderService.insertBig(params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
