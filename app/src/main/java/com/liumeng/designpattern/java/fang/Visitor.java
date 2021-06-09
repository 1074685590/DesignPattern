package com.liumeng.designpattern.java.fang;

public interface Visitor {
    public void visit(Engineer engineer);

    public void visit(Manager leader);
}

