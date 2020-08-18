package com.getiejun.spring;

import com.getiejun.spring.config.ConfigMain;
import com.getiejun.spring.entity.Color;
import com.getiejun.spring.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class configBeanTest {

    public static void main(String[] args) {
        //printPersonBean();
        printAllBean();
        //factoryBeanTest();
        //scopeTest();
        //lazyTest();
    }

    public static void factoryBeanTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigMain.class);
        System.out.println(applicationContext.getBean("colorFactoryBean").toString());
    }

    public static void lazyTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigMain.class);
        System.out.println("容器创建完成");
        Person person1 = (Person) applicationContext.getBean("person");
    }

    public static void scopeTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigMain.class);
        Person person = (Person) applicationContext.getBean("person");
        Person person1 = (Person) applicationContext.getBean("person");
        System.out.println(person == person1);
    }

    public static void printPersonBean() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigMain.class);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
    }

    public static void printAllBean() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigMain.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
