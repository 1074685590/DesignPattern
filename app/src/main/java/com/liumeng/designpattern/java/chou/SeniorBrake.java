package com.liumeng.designpattern.java.chou;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
