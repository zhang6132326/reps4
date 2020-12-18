package com.zxf.domain;

import java.util.Date;

public class VideoOrder {
    private Integer id;
    private String out_trade_no;
    private Integer state;
    private Date create_time;
    private Integer total_fee;
    private Integer video_id;
    private String video_title;
    private String video_img;
    private Integer user_id;
    ///////////////////////////////////
    private User user;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Integer total_fee) {
        this.total_fee = total_fee;
    }

    public Integer getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Integer video_id) {
        this.video_id = video_id;
    }

    public String getVideo_title() {
        return video_title;
    }

    public void setVideo_title(String video_title) {
        this.video_title = video_title;
    }

    public String getVideo_img() {
        return video_img;
    }

    public void setVideo_img(String video_img) {
        this.video_img = video_img;
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "id=" + id +
                ", out_trade_no='" + out_trade_no + '\'' +
                ", state=" + state +
                ", create_time=" + create_time +
                ", total_fee=" + total_fee +
                ", video_id=" + video_id +
                ", video_title='" + video_title + '\'' +
                ", video_img='" + video_img + '\'' +
                ", user_id=" + user_id +
                ", user=" + user +
                '}';
    }
}
