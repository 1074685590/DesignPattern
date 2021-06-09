package com.liumeng.designpattern.java.fang;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class ReportUtil {
    public void visit(Staff staff) {
        if (staff instanceof Manager) {
            Manager leader = (Manager) staff;
            System.out.println("经理:" + leader.name + ",新产品数量:" + leader.getProducts());
        } else {
            Engineer engineer = (Engineer) staff;
            System.out.println("工程师:" + engineer.name + ",kpi:" + engineer.kpi);
        }
    }
}
