package com.example.common.aspect;

import com.example.extraction.entity.DtvActionlog;
import com.example.extraction.service.DtvActionlogService;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class ExtractionLogAspect {
    private static Logger logger = LoggerFactory.getLogger(ExtractionLogAspect.class);

    @Autowired
    private DtvActionlogService dtvActionlogService;
    //两个..代表所有子目录，最后括号里的两个..代表所有参数
    @Pointcut("@annotation(com.example.common.annotation.InsertBigDataLog)")
    public void extractionLog(){
    }
  /*  @Before("extractionLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("请求地址 : " + request.getRequestURL().toString());
        logger.info("HTTP METHOD : " + request.getMethod());
        // 获取真实的ip地址
        //logger.info("IP : " + IPAddressUtil.getClientIpAddress(request));
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName());
        logger.info("参数 : " + Arrays.toString(joinPoint.getArgs()));
//        loggger.info("参数 : " + joinPoint.getArgs());

    }*/

    @AfterReturning(returning = "ret", pointcut = "extractionLog()")// returning的值和doAfterReturning的参数名一致
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容(返回值太复杂时，打印的是物理存储空间的地址)
        Map<String,Object>map = (HashMap<String, Object>) ret;
        DtvActionlog dtvActionlog =new DtvActionlog();
        dtvActionlog.setCorpname(map.get("corpname")+"");
        dtvActionlog.setCreatetime(new Date());
        dtvActionlog.setExtractobject(map.get("selectobject")+"");

        dtvActionlog.setExtractnumber(!map.containsKey("selectnumber") ? 0 : (Integer) map.get("selectnumber"));
        dtvActionlog.setExtracttime(!map.containsKey("selecttime") ? 0 : ((Long) map.get("selecttime")).doubleValue());

        dtvActionlog.setInsertnumber(!map.containsKey("insertnumber") ? 0 : (Integer) map.get("insertnumber"));
        dtvActionlog.setInserttime(!map.containsKey("inserttime") ? 0 : ((Long) map.get("inserttime")).doubleValue());

        dtvActionlog.setUpdateobject(map.get("updateobject")+"");
        dtvActionlog.setUpdatenumber(!map.containsKey("updatenumber") ? 0 : (Integer) map.get("updatenumber"));
        dtvActionlog.setUpdatetime(!map.containsKey("updatetime") ? 0 : ((Long) map.get("updatetime")).doubleValue());

        dtvActionlog.setState(!map.containsKey("state") ? 0 :(Integer) map.get("state"));
        dtvActionlog.setRemark(!map.containsKey("inserttime") ? null : map.get("remark")+"");

        if(dtvActionlogService.insert(dtvActionlog)>0){
            logger.debug("DtvActionlog Insert Success");
        }else{
            logger.debug("DtvActionlog Insert Fail");
        }
       /* map= JSONObject.parseObject(JSONObject.toJSON(dtvActionlog).toString());
        JSONObject.toJSON(dtvActionlog);*/

    }
    /*@Around("extractionLog()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object ob = pjp.proceed();// ob 为方法的返回值
        logger.info("耗时 : " + (System.currentTimeMillis() - startTime));
        return ob;
    }*/

}
