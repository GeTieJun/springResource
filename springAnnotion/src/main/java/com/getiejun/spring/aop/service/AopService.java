package com.getiejun.spring.aop.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AopService {

    Logger logger = Logger.getLogger("aopService");

    public int calculateDiv(int a, int b) {
        int result = a / b;
        logger.info("div result is : " + result);
        return result;
    }
}
