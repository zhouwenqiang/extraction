package com.example.extraction.controller;

import com.example.extraction.entity.Canmileage;
import com.example.extraction.service.CanmileageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * Created by zwq on 2018/6/21.
 */
@Controller
@RequestMapping("/extraction/canmileage")
public class CanmileageController {

    @Autowired
    private CanmileageService canmileageService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<Canmileage> list(@RequestParam Map<String, Object> params){
        List<Canmileage> list=canmileageService.list(params.get("dbid").toString(),params);
        return list;
    }
    @RequestMapping(value = "/insertbigdata")
    @ResponseBody
    public Map<String, Object> insertbigdata(@RequestParam Map<String, Object> params){
        try {
            params = canmileageService.insertBig(params);
            return params;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
