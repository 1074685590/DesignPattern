package com.liumeng.designpattern.java.shi.lei;

/**
 * Created by liumeng on 2020/12/4 0004.
 * Describe:
 */
public class Test {
    public static void main(String[] args) {
        VoltAdapter voltAdapter = new VoltAdapter();
        System.out.println("输出电压:" + voltAdapter.getVolt5());
    }
}
