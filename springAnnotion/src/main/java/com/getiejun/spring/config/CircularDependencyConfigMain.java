package com.getiejun.spring.config;

import com.getiejun.spring.entity.InstanceA;
import com.getiejun.spring.entity.InstanceB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CircularDependencyConfigMain {

    @Bean
    public InstanceA instanceA() {
        return new InstanceA();
    }

    @Bean
    public InstanceB instanceB() {
        return new InstanceB();
    }
}
