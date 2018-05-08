package com.tong.logic.chapterThree.file;

import java.util.Date;

public class MyFolder {

    private String name;
    private Date createtime;
    private MyFolder parent;
    private MyFile[] files;
    private MyFolder[] subFolder;

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

    public MyFolder getParent() {
        return parent;
    }

    public void setParent(MyFolder parent) {
        this.parent = parent;
    }

    public MyFile[] getFiles() {
        return files;
    }

    public void setFiles(MyFile[] files) {
        this.files = files;
    }

    public MyFolder[] getSubFolder() {
        return subFolder;
    }

    public void setSubFolder(MyFolder[] subFolder) {
        this.subFolder = subFolder;
    }

    public int totalSize(){

        int totalSize = 0;

        if(files != null){
            for(MyFile file:files){
                totalSize+=file.getSize();
            }
        }

        if(subFolder != null){
            for(MyFolder folder:subFolder){
                totalSize += folder.totalSize();
            }
        }

        return totalSize;
    }
}
