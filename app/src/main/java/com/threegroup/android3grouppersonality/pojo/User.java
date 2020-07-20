package com.threegroup.android3grouppersonality.pojo;

import java.io.Serializable;

public class User implements Serializable {
    //Alt+insert，getter and setter,toString
    private String userid; //用户Id string,和数据库类型一致，不是整形
    private String name;  //姓名
    private String sex;   //性别
    private String phone;  /**电话，和id一致用电话号码登录**/
    private String password; //密码
    private String photo;  //头像
    private String introduction;//简介

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", introduction='" + introduction + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
