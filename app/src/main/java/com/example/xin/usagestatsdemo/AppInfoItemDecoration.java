package com.example.xin.usagestatsdemo;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by xin on 2017/10/20.
 */

public class AppInfoItemDecoration extends RecyclerView.ItemDecoration{

    private int space;

    //构造函数，创建实例时传入需要的间距
    public AppInfoItemDecoration(int space){
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.top = 0;
        outRect.bottom = space;
    }
}
