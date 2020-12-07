package com.liumeng.designpattern.java.chou;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class Q7Factory extends CarFactory {
    @Override
    public ITire createtire() {
        return new SUVTire();
    }

    @Override
    public IEngin creteEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
