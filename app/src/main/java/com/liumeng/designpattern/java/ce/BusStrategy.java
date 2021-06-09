package com.liumeng.designpattern.java.ce;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class BusStrategy implements CalculateStrategy {
    /**
     * 十公里以内1元钱,超过十公里之后没加一元钱可以乘坐5公里
     *
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        //超过的距离对5公里取余数
        int fraction = extraTotal % 5;
        //价格计算
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
