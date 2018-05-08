package com.tong.logic.chapterThree.file;

import java.util.Date;

public class MyFile {
    private String name;
    private Date createtime;
    private int size;
    private MyFolder parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyFolder getParent() {
        return parent;
    }

    public void setParent(MyFolder parent) {
        this.parent = parent;
    }
}
