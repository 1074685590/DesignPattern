package com.liumeng.designpattern.java.yuan;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class Client {
    public static void main(String[] args) {
        wordDocument originDoc = new wordDocument();
        originDoc.setText("这是一篇文档");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.showDocument();

        wordDocument doc2 =  originDoc.clone();
        doc2.showDocument();
        doc2.setText("这是修改过的doc2文本");
        doc2.showDocument();
        originDoc.showDocument();
    }
}
