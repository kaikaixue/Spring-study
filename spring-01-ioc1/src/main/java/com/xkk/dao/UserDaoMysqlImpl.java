package com.xkk.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql获取User");
    }
}