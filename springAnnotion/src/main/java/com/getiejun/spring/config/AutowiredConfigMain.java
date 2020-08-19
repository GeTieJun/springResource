package com.getiejun.spring.config;

import com.getiejun.spring.entity.Boss;
import com.getiejun.spring.entity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan(value = {"com.getiejun.spring.entity"})
public class AutowiredConfigMain {

    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Boss boss() {
        return new Boss();
    }
}
