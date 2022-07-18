package com.xkk.demo01;

// 房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
