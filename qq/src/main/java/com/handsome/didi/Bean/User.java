package com.handsome.didi.Bean;

import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;

/**
 * Created by handsome on 2016/4/19.
 */
public class User extends BmobUser {
    private Boolean sex;
    private int age;
    private int rate;
    private List<String> love_oid;
    private List<String> cart_oid;

    public List<String> getCart_oid() {
        return cart_oid;
    }

    public void setCart_oid(List<String> cart_oid) {
        this.cart_oid = cart_oid;
    }

    public List<String> getLove_oid() {
        return love_oid;
    }

    public void setLove_oid(List<String> love_oid) {
        this.love_oid = love_oid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}
