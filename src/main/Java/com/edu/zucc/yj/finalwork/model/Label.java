package com.edu.zucc.yj.finalwork.model;

/**
 * @ProjectName: FinalWork
 * @ClassName: Label
 * @Description: 标签类
 * @Author: YuJing
 * @CreateDate: 2018/1/10
 */

public class Label {
    private int label_id;
    private String label_name;

    public int getLabel_id() {
        return label_id;
    }

    public void setLabel_id(int label_id) {
        this.label_id = label_id;
    }

    public String getLabel_name() {
        return label_name;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
    }

    @Override
    public String toString() {
        return "Label{" +
                "label_id=" + label_id +
                ", label_name='" + label_name + '\'' +
                '}';
    }
}
