package com.example.common.exception;

import com.example.common.utils.HttpServletUtils;
import com.example.common.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * zwq
 * 异常处理器
 * */
public class BDExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @ExceptionHandler({Exception.class})
    public Object handleException(Exception e, HttpServletRequest request) {
        logger.error(request.getRequestURL().toString());
        logger.error(e.toString());
        logger.error(e.getMessage(), e);
        if (HttpServletUtils.jsAjax(request)) {
            return R.error(500, "服务器错误，请联系管理员");
        }
        return new ModelAndView("error/500");
    }
}
