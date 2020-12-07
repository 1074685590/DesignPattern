package com.liumeng.designpattern.java.fang;

import java.util.Random;

/**
 * Created by liumeng on 2020/12/4 0004.
 * Describe:
 */
public class Manager extends Staff{
    private int products;
    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts(){
        return products;
    }
}
