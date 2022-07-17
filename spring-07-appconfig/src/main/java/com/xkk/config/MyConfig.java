package com.xkk.config;

import com.xkk.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyConfig2.class)
// 代表这是一个配置类
public class MyConfig {
    @Bean  // 通过方法注册一个Bean，返回值就是Bean的类型，方法名就是Bean的id
    public Dog dog() {
        return new Dog();
    }
}
