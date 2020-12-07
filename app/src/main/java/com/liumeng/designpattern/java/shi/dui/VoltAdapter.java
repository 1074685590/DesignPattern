package com.liumeng.designpattern.java.shi.dui;

/**
 * Created by liumeng on 2020/12/4 0004.
 * Describe:
 */
public class VoltAdapter implements FiveVolt {

    Volt220 mVolt220;

    public VoltAdapter(Volt220 volt220) {
        mVolt220 = volt220;
    }

    public int getVolt220(){
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
