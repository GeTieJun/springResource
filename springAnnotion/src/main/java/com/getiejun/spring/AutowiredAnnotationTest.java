package com.getiejun.spring;

import com.getiejun.spring.config.AutowiredConfigMain;
import com.getiejun.spring.entity.Boss;
import com.getiejun.spring.entity.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;

public class AutowiredAnnotationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredConfigMain.class);
        //System.out.println(applicationContext.getBean(Car.class));
        //System.out.println(applicationContext.getBean(Boss.class));
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String bean : beanNames) {
            System.out.println(applicationContext.getBean(bean));
        }
        applicationContext.close();
    }

}
