package cn.aop.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class UserServiceLogger {
    private Logger logger = Logger.getLogger(UserServiceLogger.class);

    //前置增强
    public void brfore(JoinPoint joinPoint){
         logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature()
         + "参数:" + Arrays.toString(joinPoint.getArgs()));
    }

    //后置增强,result为Spring注入值
    public String afterReturnning(JoinPoint joinPoint, Object result){
        logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature()
                + "参数:" + result);
        return "hello";
    }
}
