package com.springboot.demo.condition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 10:41
 * @Version 1.0
 */
public class DatabaseConditional implements Condition {
    /**
     * 数据库装配条件
     * matches方法首先读取其上下文环境，然后判定是否已经配置了对应的数据库信息。
     * 这样，当这些都已经配置好后则返回true。
     * 这个时候Spring会装配数据库连接池的Bean，否则是不装配的。
     * @param context  条件上下文
     * @param metadata 注释类型的元数据
     * @return true 装配Bean，否则不装配
     */
    private static Logger logger = LoggerFactory.getLogger(DatabaseConditional.class);
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 取出环境配置
        Environment env = context.getEnvironment();
        logger.info("判断是否存在对应的数据库配置，若为true，便装配到Sprng IoC");
        // 判断属性文件是否存在对应的数据库配置
        return env.containsProperty("database.driverName")
                && env.containsProperty("database.url")
                && env.containsProperty("database.username")
                && env.containsProperty("database.password");
    }
}
