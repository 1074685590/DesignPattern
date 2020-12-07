package com.liumeng.designpattern.java.chou;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class Client {
    public static void main(String[] args) {
        Q3Factory q3Factory = new Q3Factory();
        q3Factory.createtire().tire();
        q3Factory.creteEngine().engine();
        q3Factory.createBrake().brake();

        System.out.println("---------------------------");

        Q7Factory q7Factory = new Q7Factory();
        q7Factory.createtire().tire();
        q7Factory.creteEngine().engine();
        q7Factory.createBrake().brake();
    }
}
