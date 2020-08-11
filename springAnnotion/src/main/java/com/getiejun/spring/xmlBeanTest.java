package com.getiejun.spring;

import com.getiejun.spring.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlBeanTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("classpath:bean.xml");
        System.out.println(applicationContext.getBean("person").toString());
    }

}
