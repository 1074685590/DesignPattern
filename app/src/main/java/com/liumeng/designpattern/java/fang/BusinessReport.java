package com.liumeng.designpattern.java.fang;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe: 员工业务报表1类
 */
public class BusinessReport {
    List<Staff> mStaff = new LinkedList<>();

    public BusinessReport() {
        mStaff.add(new Manager("王经理"));
        mStaff.add(new Engineer("工程师-Shawn.Xiong"));
        mStaff.add(new Engineer("工程师-Kael"));
        mStaff.add(new Engineer("工程师-Chaossss"));
        mStaff.add(new Engineer("工程师-Tiiime"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff : mStaff) {
            staff.accept(visitor);
        }
    }
}
