package com.springboot.demo;

import com.springboot.demo.aspect.impl.MyAspect;
import com.springboot.demo.aspect.impl.MyAspect1;
import com.springboot.demo.aspect.impl.MyAspect2;
import com.springboot.demo.aspect.impl.MyAspect3;
import com.springboot.demo.dao.MyBatisUserDao;
import com.springboot.demo.enumeration.SexEnum;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

//SpringBootApplication相当于@configuration+@EnableAutoConfiguration+@CompoentScan
//提供的exclude和excludeName两个方法是对于其内部的自动配置类才会生效的。
// 为了能够排除其他类，还可以再加入@ComponentScan以达到我们的目的
@SpringBootApplication
//@ComponentScan(basePackages="com.springboot.demo",
//        excludeFilters = {@ComponentScan.Filter(type =FilterType.ANNOTATION, classes = {Service.class})})
//@PropertySource(value = {"classpath:jdbc.properties"}, ignoreResourceNotFound = true)
public class SpringBootDemoApplication {
    // 定义切面
    @Bean(name = "myAspect")
    public MyAspect initMyAspect() {
        return new MyAspect();
    }

    // 定义切面
    @Bean(name = "myAspect2")
    public MyAspect2 initMyAspect2() {
        return new MyAspect2();
    }

    // 定义切面
    @Bean(name = "myAspect1")
    public MyAspect1 initMyAspect1() {
        return new MyAspect1();
    }

    // 定义切面
    @Bean(name = "myAspect3")
    public MyAspect3 initMyAspect3() {
        return new MyAspect3();
    }

    @Autowired
    SqlSessionFactory sqlSessionFactory = null;
    // 定义一个MyBatis的Mapper接口
	@Bean
	public MapperFactoryBean<MyBatisUserDao> initMyBatisUserDao() {
	     MapperFactoryBean<MyBatisUserDao> bean = new MapperFactoryBean<>();
	     bean.setMapperInterface(MyBatisUserDao.class);
	     bean.setSqlSessionFactory(sqlSessionFactory);
	     TypeHandler<SexEnum> sexTypeHandler = sqlSessionFactory.getConfiguration().getTypeHandlerRegistry().getTypeHandler(SexEnum.class);
	     return bean;
	}

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
