package com.example.isp.classes;

import android.util.Log;

/**
 * Created by BForte on 3/14/14.
 */
public class Robot implements Workable{
    @Override
    public void work() {
        Log.d("DEBUG", "robot is working");
    }
}
