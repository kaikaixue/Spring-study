package com.xkk.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// 单例模式，默认，关闭工厂，所有对象都会被销毁
@Scope("singleton")
// 多例模式（原型模式），关闭工厂，所有对象不会销毁。内部的垃圾回收机制会回收
//@Scope("prototype")
@Component("user")
// 相当于 <bean id = "user" class = "----"/>
public class User {
    @Value("xkk")
    // 相当于配置文件中 <property name="name" value="***"/>
    public String name;
}
