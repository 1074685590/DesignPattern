package com.liumeng.designpattern.java.yuan;

import java.util.ArrayList;

/**
 * Created by liumeng on 2020/12/7 0007.
 * Describe:
 */
public class wordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public wordDocument() {
        System.out.println("-------------WordDocument构造函数---------------");
    }

    @Override
    protected wordDocument clone()  {
        try {
            wordDocument doc = (wordDocument) super.clone();
            doc.mText = this.mText;
            doc.mImages = this.mImages;
            return doc;
        } catch (CloneNotSupportedException e) {

        }

        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void addImage(String img) {
        this.mImages.add(img);
    }

    public void showDocument(){
        System.out.println("----------------word content start----------------------");
        System.out.println("Text: "+mText);
        for (String image : mImages) {
            System.out.println("image name:"+ image);
        }
        System.out.println("-----------------word content end---------------------");
    }
}
