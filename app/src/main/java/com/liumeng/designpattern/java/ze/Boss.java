package com.liumeng.designpattern.java.ze;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class Boss extends Leader {
    @Override
    protected void handle(int money) {
        System.out.println("老板批复报销" + money + "元");
    }

    @Override
    protected int limit() {
        return Integer.MAX_VALUE;
    }
}
