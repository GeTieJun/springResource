package com.getiejun.spring.aop.service;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LogAspectService {

    Logger logger = Logger.getLogger("logAspectService");

    @Pointcut(value = "execution(public * com.getiejun.spring.aop.service.AopService.calculateDiv(..))")
    public void cutPoint() {
    }

    @Before("cutPoint()")
    public void aspectBefore() {
        logger.info(">> cutPoint before execute");
    }

    @After("cutPoint()")
    public void aspectAfter() {
        logger.info(">> cutPoint after execute");
    }

    @AfterReturning(pointcut = "cutPoint()", returning = "args")
    public void aspectAfterReturn(int args) {
        logger.info(">> cutPoint after returning execute. The result is: " + args);
    }

//    @AfterThrowing()
//    public void aspectAfterThrowing() {
//        logger.info(">> cutPoint after returning execute. The result is: " + args);
//    }
//
//    @Around()
}
