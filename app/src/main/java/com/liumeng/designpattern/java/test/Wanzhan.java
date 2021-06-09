package com.liumeng.designpattern.java.test;

import java.util.Observable;

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe:
 */
public class Wanzhan extends Observable {
    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    public void pushNewContent(String content) {
        setChanged();
        notifyObservers(content);
    }
}
