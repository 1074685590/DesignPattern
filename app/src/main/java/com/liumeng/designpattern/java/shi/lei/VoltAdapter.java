package com.liumeng.designpattern.java.shi.lei;

/**
 * Created by liumeng on 2020/12/4 0004.
 * Describe:
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}
