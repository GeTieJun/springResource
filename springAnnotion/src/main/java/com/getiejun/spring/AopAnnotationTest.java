package com.getiejun.spring;

import com.getiejun.spring.aop.service.AopService;
import com.getiejun.spring.config.AopConfigMain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopAnnotationTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfigMain.class);
        AopService aopService = applicationContext.getBean(AopService.class);
        aopService.calculateDiv(4, 2);
    }
}
