package com.example.daidaijie.bmobapplication;

/**
 * Created by daidaijie on 2016/9/16.
 */
public class BmobInfo {

    public static String appID = "869eda6dce97bf91fae9551f3bb943b6";

    private static BmobInfo ourInstance = new BmobInfo();

    public static BmobInfo getInstance() {
        return ourInstance;
    }

    private BmobInfo() {
    }
}
