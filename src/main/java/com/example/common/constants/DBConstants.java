package com.example.common.constants;

import java.util.Map;
import java.util.TreeMap;

public class DBConstants {
    public enum DBType {
        LWCGDB, BJDB, SGSDB, HZDB, WNDB, YADB, TCDB,YLDB,AKDB,SLDB,XYDB,XADB,XXDB,ODBDB,CXDB
    };
    public final static Map<DBType, String> dbNameMap = new TreeMap<DBType, String>();

    static {
        dbNameMap.put(DBType.LWCGDB,"联网系统");
        dbNameMap.put(DBType.BJDB,"宝鸡分公司");
        dbNameMap.put(DBType.SGSDB,"省公司");
        dbNameMap.put(DBType.HZDB,"汉中分公司");
        dbNameMap.put(DBType.WNDB,"渭南分公司");
        dbNameMap.put(DBType.YADB,"延安分公司");
        dbNameMap.put(DBType.TCDB,"铜川分公司");
        dbNameMap.put(DBType.YLDB,"榆林分公司");
        dbNameMap.put(DBType.AKDB,"安康分公司");
        dbNameMap.put(DBType.SLDB,"商洛分公司");
        dbNameMap.put(DBType.XYDB,"咸阳分公司");
        dbNameMap.put(DBType.XADB,"西安分公司");
        dbNameMap.put(DBType.XXDB,"西咸分公司");
        dbNameMap.put(DBType.ODBDB,"ODB设备");
        dbNameMap.put(DBType.CXDB,"测试车管");
    }
}
