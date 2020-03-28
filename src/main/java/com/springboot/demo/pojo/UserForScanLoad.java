package com.springboot.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 11:30
 * @Version 1.0
 */

//@Component是标明哪个类被扫描进入Spring IoC容器
//其中配置的“user”则是作为Bean的名称，当然你也可以不配置这个字符串，
// 那么IoC容器就会把类名第一个字母作为小写，其他不变作为Bean名称放入到IoC容器中
@Service
@Component("userForScanLoad")
public class UserForScanLoad {
    //注解@Value则是指定具体的值，使得Spring IoC给予对应的属性注入对应的值
    @Value("2")
    private Long id;

    @Value("user_name_2")
    private String userName;

    @Value("note_2")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
