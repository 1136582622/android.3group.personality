package com.threegroup.android3grouppersonality.pojo;

import java.io.Serializable;

public class ImageName implements Serializable {
    private int imageid;
    private String imgName;
    private Blog blog;

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "ImageName{" +
                "imageid=" + imageid +
                ", imgName='" + imgName + '\'' +
                ", blog=" + blog +
                '}';
    }
}
