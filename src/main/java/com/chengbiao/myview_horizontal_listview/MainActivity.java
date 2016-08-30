package com.chengbiao.myview_horizontal_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chengbiao.myview_horizontal_listview.view.HorizontalListAdapter;
import com.chengbiao.myview_horizontal_listview.view.HorizontalListView;

public class MainActivity extends AppCompatActivity {

    private HorizontalListView hlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hlv = (HorizontalListView) findViewById(R.id.hlv);
        hlv.setAdapter(new HorizontalListAdapter(this));
    }
}
