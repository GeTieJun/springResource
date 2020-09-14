package com.getiejun.spring.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationTest {

    public static void main(String[] args) throws Exception{

        Class clazz = Class.forName("com.getiejun.spring.annotation.Fruit");
        Fruit fruit = (Fruit) clazz.newInstance();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            FruitName fruitName = field.getAnnotation(FruitName.class);
            if(fruitName != null && fruitName.value().equalsIgnoreCase("Apple")) {
                System.out.println("this is apple");
            }
        }
    }
}
