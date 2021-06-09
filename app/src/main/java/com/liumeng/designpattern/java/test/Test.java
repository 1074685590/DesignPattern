package com.liumeng.designpattern.java.test;

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe:
 */
public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder("1");
        Coder coder1 = new Coder("2");
        Coder coder2 = new Coder("3");
        Wanzhan wanzhan = new Wanzhan();
        wanzhan.addObserver(coder);
        wanzhan.addObserver(coder1);
        wanzhan.addObserver(coder2);
        wanzhan.pushNewContent("出大事了");
    }
}
