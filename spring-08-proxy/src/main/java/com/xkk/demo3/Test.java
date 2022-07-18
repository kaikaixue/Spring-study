package com.xkk.demo3;

import com.xkk.demo02.UserService;
import com.xkk.demo02.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        // 真实对象
        UserServiceImpl userService = new UserServiceImpl();
        // 代理对象的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置需要代理的对象
        pih.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }
}
