package com.liumeng.designpattern.java.ce;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class TranficCalculator {
    CalculateStrategy mStrategy;

    public static void main(String[] args) {
        TranficCalculator tranficCalculator = new TranficCalculator();
        tranficCalculator.setSrategy(new BusStrategy());
        System.out.println("公交车乘坐16公里的价格:" + tranficCalculator.caculatePrice(16));
    }

    public void setSrategy(CalculateStrategy calculateStrategy) {
        mStrategy = calculateStrategy;
    }

    public int caculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}
