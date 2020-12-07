package com.liumeng.designpattern.java.chou;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createtire() {
        return new NormalTire();
    }

    @Override
    public IEngin creteEngine() {
        return new DomesticEngin();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
