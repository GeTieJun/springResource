package com.getiejun.spring.config;

import com.getiejun.spring.entity.PostConstructTest;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import({PostConstructTest.class})
public class PostConstructConfigMain {

}
