package com.liumeng.designpattern.java.fang;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class Client {
    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();
        System.out.println("=======给CEO看的报表=======");
        businessReport.showReport(new CEOVisitor());
        System.out.println("\n======给CTO看的报表=======");
        businessReport.showReport(new CTOVisitor());
    }
}
