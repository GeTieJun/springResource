package com.getiejun.spring.factory;

import com.getiejun.spring.entity.Color;
import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean {
    public Object getObject() throws Exception {
        System.out.println("Factory bean 创建bean");
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
