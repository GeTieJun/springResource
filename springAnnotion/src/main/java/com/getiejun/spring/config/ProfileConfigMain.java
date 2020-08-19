package com.getiejun.spring.config;

import com.getiejun.spring.entity.ProfileDev;
import com.getiejun.spring.entity.ProfileTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfigMain {

    @Bean
    @Profile(value="test")
    public ProfileTest profileTest() {
        return new ProfileTest();
    }

    @Profile(value="dev")
    @Bean
    public ProfileDev profileDev() {
        return new ProfileDev();
    }

}
