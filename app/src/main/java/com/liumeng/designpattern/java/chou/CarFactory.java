package com.liumeng.designpattern.java.chou;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public abstract class CarFactory {
    public abstract ITire createtire();

    public abstract IEngin creteEngine();

    public abstract IBrake createBrake();
}
