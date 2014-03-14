package com.example.lsp.subclass;

import android.util.Log;

/**
 * Created by BForte on 3/14/14.
 */
public class Crow extends Bird
{
    private String name;

    public Crow(){
        this.name = "Crow";
    }

    public void fly(){
        Log.d("DEBUG", this.name + " is flying....!");
    }
}
