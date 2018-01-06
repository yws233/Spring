package cn.aop.aop;

/*
* 异常增强处理类
* */

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class ErrorLogger {

    private static Logger logger = Logger.getLogger(ErrorLogger.class);
    public void error(JoinPoint joinPoint, RuntimeException e){
        logger.error(joinPoint.getSignature().getName() + "方法发生异常" + e);
    }

}
