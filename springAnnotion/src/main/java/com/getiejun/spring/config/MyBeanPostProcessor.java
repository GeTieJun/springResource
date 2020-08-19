package com.getiejun.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        System.out.println("beanProcessor before 执行........" + bean.toString());
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        System.out.println("beanProcessor after 执行........" + bean.toString());
        return bean;
    }
}
