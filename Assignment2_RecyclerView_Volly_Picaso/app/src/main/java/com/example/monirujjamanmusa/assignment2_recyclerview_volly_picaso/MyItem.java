package com.example.monirujjamanmusa.assignment2_recyclerview_volly_picaso;

public class MyItem {

    private String head;
    private  String desc;
    private String imageUrl;

    public MyItem(String head, String desc, String imageUrl) {
        this.head = head;
        this.desc=desc;
        this.imageUrl=imageUrl;
    }


    public String getHead() {
        return head;
    }


    public String getDesc() {
        return desc;
    }


    public String getImageUrl() {
        return imageUrl;
    }
}
