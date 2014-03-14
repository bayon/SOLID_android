package com.example.isp.classes;

import android.util.Log;

/**
 * Created by BForte on 3/14/14.
 */
public class Worker implements Workable,Feedable{
    @Override
    public void feed() {
        Log.d("DEBUG","worker is working");
    }

    @Override
    public void work() {
        Log.d("DEBUG","worker is feeding");
    }
}
