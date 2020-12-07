package com.liumeng.designpattern.java.fang;

import java.util.Random;

/**
 * Created by liumeng on 2020/12/4 0004.
 * Describe:
 */
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
