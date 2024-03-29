package com.liumeng.designpattern.java.fang;

import java.util.Random;

/**
 * Created by liumeng on 2020/12/4 0004.
 * Describe:
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
