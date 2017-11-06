package com.example.xin.usagestatsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button authorize;
    Button startIntent;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**初始化各个组件
     * */
    private void initView(){
        recyclerView = (RecyclerView) findViewById(R.id.appInfo_Rv);
        authorize = (Button) findViewById(R.id.authorize);
        authorize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS);
                startActivity(intent);
            }
        });

        startIntent = (Button) findViewById(R.id.startIntent);
        startIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<AppInfo> appInfoList;//新建一个集合存放getappinfo()返回的app详细信息集合
                getAppInfo get = new getAppInfo();//创建一个getAppInfo实例，里面有获取app详细信息并返回的方法
                appInfoList = get.getappinfo(MainActivity.this);//获得App使用情况
                LinearLayoutManager layoutManager =
                        new LinearLayoutManager(MainActivity.this);
                recyclerView.setLayoutManager(layoutManager);
                //为各组件设置间距，暂时用不到
                //recyclerView.addItemDecoration(new AppInfoItemDecoration(0));
                recyclerView.setAdapter(new appInfoAdapter(appInfoList));
            }
        });
    }
}
