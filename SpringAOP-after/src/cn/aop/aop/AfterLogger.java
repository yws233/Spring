package cn.aop.aop;

/*
* 最终增强处理类
* */

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {

    private static Logger logger = Logger.getLogger(AfterLogger.class);
    public void after(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature() + "方法执行完毕！");
    }

}
