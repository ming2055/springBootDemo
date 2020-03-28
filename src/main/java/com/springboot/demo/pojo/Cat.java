package com.springboot.demo.pojo;

import com.springboot.demo.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 18:43
 * @Version 1.0
 */
@Primary
@Component("cat")
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫【" + Cat.class.getSimpleName()+"】是抓老鼠。");
    }
}
