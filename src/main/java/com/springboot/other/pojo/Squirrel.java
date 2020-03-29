package com.springboot.other.pojo;

import com.springboot.demo.pojo.definition.Animal;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 13:10
 * @Version 1.0
 */
public class Squirrel implements Animal {
    @Override
    public void use() {
        System.out.println("松鼠可以采集松果");
    }
}
