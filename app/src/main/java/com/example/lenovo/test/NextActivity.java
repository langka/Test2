package com.example.lenovo.test;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/7/25.
 */
public class NextActivity extends AppCompatActivity {
    List<Fragment> fragments;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()){
           case R.id.a:
               Toast.makeText(this,"A clicked",Toast.LENGTH_SHORT).show();
               break;
           case R.id.b:
               Toast.makeText(this,"B CLICKED",Toast.LENGTH_SHORT).show();
               break;
           default:
               Toast.makeText(this,"I DONT KNOW",Toast.LENGTH_SHORT).show();
       }
        return true;
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("appTest","ready");
        setContentView(R.layout.next_activity);
        Log.d("appTest","prepare");
        fragments = new ArrayList<Fragment>();
        fragments.add(FragmentPages.newInstance("first"));
        fragments.add(FragmentPages.newInstance("second"));
        fragments.add(FragmentPages.newInstance("third"));
        fragments.add(FragmentPages.newInstance("fourth"));
        Log.d("appTest","initialize success");
        ViewPager pager =(ViewPager) findViewById(R.id.viewpager);
        Log.d("appTest","found view");
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        };
        Log.d("appTest","Ready to set adapter");
        pager.setAdapter(adapter);
        Log.d("appTest","Set successfully");
    }
}
