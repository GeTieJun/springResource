package com.getiejun.spring;

import com.getiejun.spring.config.PostConstructConfigMain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostConstructTest {

    public static void main(String[] args) {
        testPostConstructAndStatic();
    }

    public static void testPostConstructAndStatic(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PostConstructConfigMain.class);
        applicationContext.close();
    }
}
