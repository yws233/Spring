package cn.aop.aop;

/*
* 环绕增强处理类
* */

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect //定义切面
public class AroundLogger {

    private Logger logger = Logger.getLogger(AroundLogger.class);


    @Around("execution(public void addNewUser(..))") //加入切入点
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature()
                + "参数:" + Arrays.toString(joinPoint.getArgs()));
        Object result = null; //获取的返回值，利用环绕增强修改
        try {
            result = joinPoint.proceed();
            //后置增强
            logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature()
                    + "参数:" + result);
            return result;
        } catch (Throwable throwable) {
            logger.error(joinPoint.getSignature().getName() + "发生异常！" + throwable);
            throw throwable;
        }finally {
            logger.error(joinPoint.getSignature().getName() + "执行结束！");
        }
    }

}
