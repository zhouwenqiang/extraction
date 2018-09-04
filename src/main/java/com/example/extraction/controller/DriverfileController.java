package com.example.extraction.controller;

import com.example.extraction.entity.Driverfile;
import com.example.extraction.service.DriverfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * Created by zwq on 2018/6/21.
 */
@RestController
@RequestMapping("/extraction/driverfile")
public class DriverfileController {

    @Autowired
    private DriverfileService driverfileService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<Driverfile> list(@RequestParam Map<String, Object> params){
        List<Driverfile> list=driverfileService.list(params.get("dbid").toString(),params);
        return list;
    }
    @RequestMapping(value = "/insertbigdata")
    @ResponseBody
    public Map<String, Object> insertbigdata(@RequestParam Map<String, Object> params){
        //Map<String, Object> map=new HashMap<>();
        try {
            return driverfileService.insertBig(params);
        } catch (Exception e) {
            e.printStackTrace();
        }
         return null;
    }

}
