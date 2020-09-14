package com.getiejun.spring.reflect;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectTest {

    public static void main(String[] args) throws Exception{
        printConstructs();
    }

    public static void printConstructs() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.getiejun.spring.reflect.Person");
        // 创建有参构造器
        Constructor constructor = clazz.getConstructor(Integer.class, String.class);
        Person person1 = (Person) constructor.newInstance(28, "小丽");
        System.out.println(person1.toString());

        // 创建无参构造器
        Person person2 = (Person)clazz.newInstance();
        System.out.println(person2);
    }

    public static void printMethods() throws ClassNotFoundException {
        Class clazz = Class.forName("com.getiejun.spring.reflect.Person");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
        }
    }

    public static void printFields() throws IllegalAccessException, InstantiationException {
        // 获取class
        Class clazz = Person.class;
        // 获取Person对象
        Person person = (Person) clazz.newInstance();
        // 获取对象字段
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            // 设置字段可访问
            field.setAccessible(true);
            if("age".equalsIgnoreCase(field.getName())) {
                // 字段设置值
                field.set(person, 27);
            }
            if("name".equalsIgnoreCase(field.getName())) {
                // 字段设置值
                field.set(person, "xiaoming");
            }
        }
        System.out.println(person.toString());
    }

    public static void getClassTest() {
        Class clazz1 = Person.class;
        System.out.println("method 1: " + clazz1.toString());

        Person person = new Person();
        Class clazz2 = person.getClass();
        System.out.println("method 2: " + clazz2.toString());

        Class clazz3 = null;
        try{
            clazz3 = Class.forName("com.getiejun.spring.reflect.Person");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("method 3: " + clazz3.toString());
    }
}
