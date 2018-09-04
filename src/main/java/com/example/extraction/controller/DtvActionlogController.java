package com.example.extraction.controller;

import com.example.extraction.entity.DtvActionlog;
import com.example.extraction.service.DtvActionlogService;
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
@RequestMapping("/extraction/dtvactionlog")
public class DtvActionlogController {

    @Autowired
    private DtvActionlogService dtvActionlogService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<DtvActionlog> list(@RequestParam Map<String, Object> params){
        List<DtvActionlog> list=dtvActionlogService.list(params);
        return list;
    }
}
