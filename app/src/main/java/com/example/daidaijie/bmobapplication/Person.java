package com.example.daidaijie.bmobapplication;

import cn.bmob.v3.BmobObject;

/**
 * Created by daidaijie on 2016/9/16.
 */
public class Person extends BmobObject {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}