package com.springboot.demo.pojo;

import com.springboot.demo.pojo.definition.Animal;
import com.springboot.demo.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 18:28
 * @Version 1.0
 */

@Component("businessPerson")
public class BusinessPerson implements Person {

    //@Autowired，这也是我们在Spring中最常用的注解之一，十分重要，它会根据属性的类型（by type）找到对应的Bean进行注入。
    // 这里的Dog类是动物的一种，所以Spring IoC容器会把Dog的实例注入BussinessPerson中。
    // 这样通过Spring IoC容器获取BussinessPerson实例的时候就能够使用Dog实例来提供服务了
//    @Autowired
//    @Qualifier("dog")
    private Animal animal = null;

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired
    @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("延迟依赖注入");
        this.animal = animal;
    }
}
