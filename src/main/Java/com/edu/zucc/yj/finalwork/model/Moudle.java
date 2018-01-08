package com.edu.zucc.yj.finalwork.model;

public class Moudle {
    private int moudle_id;
    private String moudle_name;
    private int moudle_groupid;

    public int getMoudle_id() {
        return moudle_id;
    }

    public void setMoudle_id(int moudle_id) {
        this.moudle_id = moudle_id;
    }

    public String getMoudle_name() {
        return moudle_name;
    }

    public void setMoudle_name(String moudle_name) {
        this.moudle_name = moudle_name;
    }

    public int getMoudle_groupid() {
        return moudle_groupid;
    }

    public void setMoudle_groupid(int moudle_groupid) {
        this.moudle_groupid = moudle_groupid;
    }

    @Override
    public String toString() {
        return "Moudle{" +
                "moudle_id=" + moudle_id +
                ", moudle_name='" + moudle_name + '\'' +
                ", moudle_groupid=" + moudle_groupid +
                '}';
    }
}
