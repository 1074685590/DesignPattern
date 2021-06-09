package com.liumeng.designpattern.java.ztai;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:电视状态接口,定义了电视操作的函数
 */
public interface TvState {
    public void nextChannel();

    public void prevChannel();

    public void turnUp();

    public void turnDown();
}
