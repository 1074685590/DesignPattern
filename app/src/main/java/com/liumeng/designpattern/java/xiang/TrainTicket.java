package com.liumeng.designpattern.java.xiang;

import java.util.Random;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class TrainTicket implements Ticket {
    public String from, to, bunk;
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("购买 从" + from + "到" + to + "的" + bunk + "火车票 , 价格" + price);
    }
}
