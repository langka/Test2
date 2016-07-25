package com.example.lenovo.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        // 设置触摸屏幕的模式
        menu.setFadeDegree(0.35f);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        menu.setMenu(R.layout.leftmenu);
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        ImageView view = (ImageView) menu.findViewById(R.id.img);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
