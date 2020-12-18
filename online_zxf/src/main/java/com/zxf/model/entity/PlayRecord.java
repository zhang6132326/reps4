package com.zxf.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/*
    播放记录
 */
public class PlayRecord {
    private Integer id;
    private Integer user_id;
    private Integer video_id;
    private Integer current_num;
    private Integer episode_id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Integer video_id) {
        this.video_id = video_id;
    }

    public Integer getCurrent_num() {
        return current_num;
    }

    public void setCurrent_num(Integer current_num) {
        this.current_num = current_num;
    }

    public Integer getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(Integer episode_id) {
        this.episode_id = episode_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
