package com.getiejun.spring.config;

import com.getiejun.spring.condition.LinuxCondition;
import com.getiejun.spring.condition.WindowsCondition;
import com.getiejun.spring.entity.Color;
import com.getiejun.spring.entity.Person;
import com.getiejun.spring.factory.ColorFactoryBean;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.getiejun.spring") //spring 扫描包
//@Import({com.getiejun.spring.entity.Color.class})
//@Import({Color.class})
//@ImportResource
public class ConfigMain {

    /**
     * 1、singleton:一个Spring容器中只有一个Bean的实例，此为Spring的默认配置，全容器共享一个实例
     * 2、prototype:每次调用新建一个Bean的实例
     * 3、Request:Web项目中，给每一个http request新建一个Bean实例
     * 4、Session:Web项目中，给每一个http session新建一个Bean实例。
     * @return
     */
    @Scope(value = "singleton")
    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加person实例");
        return new Person("lisi", 29);
    }

    @Bean(value = "bill")
    @Conditional({WindowsCondition.class})
    public Person person01() {
        return new Person("bill", 65);
    }

    @Bean(value = "linus")
    @Conditional({LinuxCondition.class})
    public Person person02() {
        return new Person("linus",  50);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
