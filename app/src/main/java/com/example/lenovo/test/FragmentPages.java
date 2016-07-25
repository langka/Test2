package com.example.lenovo.test;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lenovo on 2016/7/25.
 */
public class FragmentPages extends android.support.v4.app.Fragment{
    String content;
    public FragmentPages(){
        content = "first";
    }
    public void setContent(String content){
        this.content = content;
    }
    public static FragmentPages newInstance(String content){
        FragmentPages f = new FragmentPages();
        f.setContent(content);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentcontent,null);
        TextView textView = (TextView)v.findViewById(R.id.fragtv);
        textView.setText(this.content);
        return v;
    }
}
