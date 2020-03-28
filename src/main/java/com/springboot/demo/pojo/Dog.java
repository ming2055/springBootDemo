package com.springboot.demo.pojo;

import com.springboot.demo.pojo.definition.Animal;
import org.springframework.stereotype.Component;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 18:30
 * @Version 1.0
 */

@Component("dog")
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("狗【" + Dog.class.getSimpleName() + "】是看门用的。");
    }
}
