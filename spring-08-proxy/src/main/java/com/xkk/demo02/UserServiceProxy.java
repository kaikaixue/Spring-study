package com.xkk.demo02;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        System.out.println("增");
    }

    @Override
    public void delete() {
        log("delete");
        System.out.println("删");
    }

    @Override
    public void update() {
        log("update");
        System.out.println("改");
    }

    @Override
    public void query() {
        log("query");
        System.out.println("查");
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
