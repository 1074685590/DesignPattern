package com.liumeng.designpattern.java.zhongjiezhe;

public class CDDevice extends Colleague {
    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read() {
        return data;
    }

    public void load() {
        data = "视频数据,音频数据";
        mediator.change(this);
    }
}