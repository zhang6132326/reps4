package com.zxf.domain;

public class VideoOrder {
    private Integer id;
    private String outTradeNo;

    private Video video;
    public VideoOrder(){
        System.out.println("VideoOrder()调用了");
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
       // System.out.println("videoOrder setVideo方法被调用");
        this.video = video;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }
}
