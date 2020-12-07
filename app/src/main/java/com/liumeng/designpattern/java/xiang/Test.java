package com.liumeng.designpattern.java.xiang;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class Test {
    public static void main(String[] args) {
        Ticket ticket1 = TicketFactory.getTicket("北京", "青岛");
        ticket1.showTicketInfo("上铺");
        Ticket ticket2 = TicketFactory.getTicket("北京", "青岛");
        ticket1.showTicketInfo("下铺");
        Ticket ticket3 = TicketFactory.getTicket("北京", "青岛");
        ticket1.showTicketInfo("坐票");
    }
}
