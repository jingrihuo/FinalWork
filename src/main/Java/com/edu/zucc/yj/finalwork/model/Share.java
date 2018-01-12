package com.edu.zucc.yj.finalwork.model;

/**
 * @ProjectName: FinalWork
 * @ClassName: Share
 * @Description: 小组分享类
 * @Author: YuJing
 * @CreateDate: 2018/1/10
 */

public class Share {
    private int share_id;
    private int share_groupid;
    private String share_tiltle;
    private String share_text;

    public int getShare_id() {
        return share_id;
    }

    public void setShare_id(int share_id) {
        this.share_id = share_id;
    }

    public int getShare_groupid() {
        return share_groupid;
    }

    public void setShare_groupid(int share_groupid) {
        this.share_groupid = share_groupid;
    }

    public String getShare_tiltle() {
        return share_tiltle;
    }

    public void setShare_tiltle(String share_tiltle) {
        this.share_tiltle = share_tiltle;
    }

    public String getShare_text() {
        return share_text;
    }

    public void setShare_text(String share_text) {
        this.share_text = share_text;
    }

    @Override
    public String toString() {
        return "Share{" +
                "share_id=" + share_id +
                ", share_groupid=" + share_groupid +
                ", share_tiltle='" + share_tiltle + '\'' +
                ", share_text='" + share_text + '\'' +
                '}';
    }
}
