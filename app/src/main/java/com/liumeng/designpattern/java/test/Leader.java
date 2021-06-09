package com.liumeng.designpattern.java.test;

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe: 有多个对象可以处理同一个事件,动态决定具体有哪一个来处理,
 * 比如触摸事件,
 * 如果构建这个框架:
 * 定义一个抽象类,持有下一个处理者的引用,定义限制条件,决定具体由谁来处理,定义抽象的处理方法
 * 定义事件分发的方法,根据限制条件看具体走那个子类的处理逻辑
 */
public abstract class Leader {
    protected Leader nextHandler;

    public final void handleRequest(int money) {
        if (limit() >= money) {
            handle(money);
        } else {
            nextHandler.handleRequest(money);
        }
    }

    protected abstract int limit();

    protected abstract void handle(int moeny);
}
