package com.getiejun.spring.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PostConstructTest {

    @PostConstruct
    public void init() {
        System.out.println("postConstruct method execute.....");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy method execute.....");
    }

    public PostConstructTest() {
        System.out.println("construct method execute....");
    }
}
