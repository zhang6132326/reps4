package com.zxf.domain;

import java.util.List;
import java.util.Map;

public class Video {
    private Integer id;
    private String title;
    private List<String> chapterList;
    private Map<Integer,String>videoMap;

    public List<String> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<String> chapterList) {
        this.chapterList = chapterList;
    }

    public Map<Integer, String> getVideoMap() {
        return videoMap;
    }

    public void setVideoMap(Map<Integer, String> videoMap) {
        this.videoMap = videoMap;
    }

    public Video(){
        //System.out.println("Video()调用了");
    }
    public Video(String title){
     //   System.out.println("Video(String title)调用了");
        this.title=title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        //System.out.println("setId(Integer id)调用了");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
      //  System.out.println("setTitle(String title)调用了");
        this.title = title;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapterList=" + chapterList +
                ", videoMap=" + videoMap +
                '}';
    }
}
