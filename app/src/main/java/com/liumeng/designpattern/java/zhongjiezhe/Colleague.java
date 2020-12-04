package com.liumeng.designpattern.java.zhongjiezhe;

public abstract class Colleague {
    public Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}