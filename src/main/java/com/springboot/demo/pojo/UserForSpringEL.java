package com.springboot.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 13:36
 * @Version 1.0
 */

@Component("userForSpringEL")
public class UserForSpringEL {
    @Value("#{T(System).currentTimeMillis()}")
    private Long initTime = null;

    // 赋值字符串
    @Value("#{'使用Spring EL赋值字符串'}")
    private String str = null;
    // 科学计数法赋值
    @Value("#{9.3E3}")
    private double d;
    // 赋值浮点数
    @Value("#{3.14}")
    private float pi;

    //有时候我们还可以获取其他Spring Bean的属性来给当前的Bean属性赋值
    @Value("#{user.userName}")
    private String otherBeanProp = null;

    //再次注意这里的Spring EL。这里引用str属性后跟着是一个?，这个符号的含义是判断这个属性是否为空。
    // 如果不为空才会去执行toUpperCase方法，进而把引用到的属性转换为大写，赋予当前属性
    @Value("#{user.userName?.toUpperCase()}")
    private String otherBeanPropUpper = null;


    //数学运算
    @Value("#{1+2}")
    private int run;

    //浮点数比较运算
    @Value("#{user.id == 3.14f}")
    private boolean piFlag;
    //字符串比较运算
    @Value("#{user.userName eq 'Spring Boot'}")
    private boolean strFlag;
    //字符串连接
    @Value("#{user.userName + ' 连接字符串'}")
    private String strApp = null;
    //三元运算
    @Value("#{user.id > 1000 ? '大于' : '小于'}")
    private String resultDesc = null;
}
