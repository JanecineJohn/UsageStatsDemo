package com.example.xin.usagestatsdemo;

import android.graphics.drawable.Drawable;

/**
 * Created by xin on 2017/10/20.
 */

public class AppInfo {
    private Drawable appIcon;
    private String appLabel;
    private String appLTS;

    public AppInfo(Drawable appIcon,String appLabel,String appLTS){
        this.appIcon = appIcon;
        this.appLabel = appLabel;
        this.appLTS = appLTS;
    }

    public String getAppLabel(){
        return appLabel;
    }
    public void setAppLabel(String appLabel){
        this.appLabel = appLabel;
    }

    public Drawable getAppIcon(){
        return appIcon;
    }
    public void setAppIcon(Drawable appIcon){
        this.appIcon = appIcon;
    }

    public String getAppLTS(){
        return appLTS;
    }
    public void setAppLTS(String appLTS){
        this.appLTS = appLTS;
    }
}
