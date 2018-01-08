package com.edu.zucc.yj.finalwork.model;

public class Groups {
    private int group_id;
    private String group_leaderid;//小组组长
    private String group_memberid;//小组成员
    private String group_rmemberid;//小组待定成员

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getGroup_leaderid() {
        return group_leaderid;
    }

    public void setGroup_leaderid(String group_leaderid) {
        this.group_leaderid = group_leaderid;
    }

    public String getGroup_memberid() {
        return group_memberid;
    }

    public void setGroup_memberid(String group_memberid) {
        this.group_memberid = group_memberid;
    }

    public String getGroup_rmemberid() {
        return group_rmemberid;
    }

    public void setGroup_rmemberid(String group_rmemberid) {
        this.group_rmemberid = group_rmemberid;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "group_id=" + group_id +
                ", group_leaderid='" + group_leaderid + '\'' +
                ", group_memberid='" + group_memberid + '\'' +
                ", group_rmemberid='" + group_rmemberid + '\'' +
                '}';
    }
}
