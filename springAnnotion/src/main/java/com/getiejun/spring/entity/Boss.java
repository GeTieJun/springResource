package com.getiejun.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {

    private Car car;

//    @Autowired //@Autowired 构造器注入
//    public Boss(Car car) {
//        this.car = car;
//    }

    public Car getCar() {
        return car;
    }

    @Autowired //@Autowired 方法注入
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
