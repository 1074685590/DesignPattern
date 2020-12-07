package com.liumeng.designpattern.java.chou;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
