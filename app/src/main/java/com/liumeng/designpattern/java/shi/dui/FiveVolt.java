package com.liumeng.designpattern.java.shi.dui;

/**
 * Created by liumeng on 2020/12/4 0004.
 * Describe:
 * 背景: 用电源接口做例子,笔记本电脑电源一般都是5v电压
 * 5v就是target接口
 * 220v就是adaptee类
 * 将电压从220v转换到5v就是Adapter
 */
public interface FiveVolt {
    public int getVolt5();
}
