package com.edu.zucc.yj.finalwork.model;

import java.util.Date;

public class Work {
    private int work_id;
    private String work_name;
    private String work_user;
    private Date work_start;
    private Date work_end;
    private String work_msg;
    private String work_level;
    private int work_beforid;
    private String work_state;
    private String work_createid;//任务发布者
    private int work_moduleid;

    public int getWork_id() {
        return work_id;
    }

    public void setWork_id(int work_id) {
        this.work_id = work_id;
    }

    public String getWork_name() {
        return work_name;
    }

    public void setWork_name(String work_name) {
        this.work_name = work_name;
    }

    public String getWork_user() {
        return work_user;
    }

    public void setWork_user(String work_user) {
        this.work_user = work_user;
    }

    public Date getWork_start() {
        return work_start;
    }

    public void setWork_start(Date work_start) {
        this.work_start = work_start;
    }

    public Date getWork_end() {
        return work_end;
    }

    public void setWork_end(Date work_end) {
        this.work_end = work_end;
    }

    public String getWork_msg() {
        return work_msg;
    }

    public void setWork_msg(String work_msg) {
        this.work_msg = work_msg;
    }

    public String getWork_level() {
        return work_level;
    }

    public void setWork_level(String work_level) {
        this.work_level = work_level;
    }

    public int getWork_beforid() {
        return work_beforid;
    }

    public void setWork_beforid(int work_beforid) {
        this.work_beforid = work_beforid;
    }

    public String getWork_state() {
        return work_state;
    }

    public void setWork_state(String work_state) {
        this.work_state = work_state;
    }

    public String getWork_createid() {
        return work_createid;
    }

    public void setWork_createid(String work_createid) {
        this.work_createid = work_createid;
    }

    public int getWork_moduleid() {
        return work_moduleid;
    }

    public void setWork_moduleid(int work_moduleid) {
        this.work_moduleid = work_moduleid;
    }

    @Override
    public String toString() {
        return "Work{" +
                "work_id=" + work_id +
                ", work_name='" + work_name + '\'' +
                ", work_user='" + work_user + '\'' +
                ", work_start=" + work_start +
                ", work_end=" + work_end +
                ", work_msg='" + work_msg + '\'' +
                ", work_level='" + work_level + '\'' +
                ", work_beforid=" + work_beforid +
                ", work_state='" + work_state + '\'' +
                ", work_createid='" + work_createid + '\'' +
                ", work_moduleid=" + work_moduleid +
                '}';
    }
}
