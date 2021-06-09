package com.liumeng.designpattern.java.test;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe:
 */
public class Coder implements Observer {
    private String name;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hi"+this.toString()+"网站内容更新了"+arg);
    }

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "程序员"+name;
    }
}
