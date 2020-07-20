package com.threegroup.android3grouppersonality.pojo;

import java.io.Serializable;

public class Comment implements Serializable {
    private int id;  //id
    private String content; //内容
    private String time; //发送时间
    private Blog blog; //博客实体
    private User user; //用户实体

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                ", blog=" + blog +
                ", user=" + user +
                '}';
    }
}
