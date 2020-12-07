package com.liumeng.designpattern.java.ztai;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();
        tvController.powerOff();
        tvController.turnUp();
    }
}
