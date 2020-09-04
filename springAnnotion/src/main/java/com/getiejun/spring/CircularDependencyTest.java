package com.getiejun.spring;

import com.getiejun.spring.config.CircularDependencyConfigMain;
import com.getiejun.spring.entity.InstanceA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependencyTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CircularDependencyConfigMain.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : beanNames) {
            System.out.println(beanName);
        }
        InstanceA instanceA = (InstanceA) applicationContext.getBean("instanceA");
        System.out.println(instanceA.toString());
    }
}
