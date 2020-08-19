package com.getiejun.spring;

import com.getiejun.spring.config.ProfileConfigMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileBeanTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("test");
        applicationContext.register(ProfileConfigMain.class);
        applicationContext.refresh();
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : beanNames) {
            System.out.println(applicationContext.getBean(beanName));
        }
        applicationContext.close();
    }
}
