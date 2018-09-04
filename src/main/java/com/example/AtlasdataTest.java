package com.example;

import com.example.extraction.service.VehiclefileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ExtractionApplication.class)
//@Slf4j
public class AtlasdataTest {
    @Autowired
    private VehiclefileService vehiclefileService;
    @Test
    public  void test() {
        /*System.out.println("---------TprjCheliangInfo-------"+vehiclefileService.selectTprjCheliangInfoCount("sgsdb"));
        System.out.println("---------VehiclefileCount-------"+vehiclefileService.selectVehiclefileCount("",new HashMap<String, Object>()));
        System.out.println("---------TprjCheliangInfo-------"+vehiclefileService.selectTprjCheliangInfoCount("bjdb"));
        System.out.println("---------VehiclefileCount-------"+vehiclefileService.selectVehiclefileCount("",new HashMap<String, Object>()));*/

        String name="lwcgdb, bjdb, sgsdb, hzdb, wndb, yadb, tcdb,yldb,akdb,sldb,xydb,xadb,odbdb";
        System.out.println(name.toUpperCase());
    }

}
