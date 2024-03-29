package com.liumeng.designpattern.java.builder;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe: 具体的Builder类,MacbookBuilder
 */
public class MacbookBuilder extends Builder {
    private Computer mComputer = new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }


    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
