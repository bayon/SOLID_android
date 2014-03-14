package com.example.lsp.subclass;

import android.util.Log;

/**
 * Created by BForte on 3/14/14.
 */
public class Ostrich extends Bird {
    private String name;

    public Ostrich(){
        this.name = "Ostrich";
    }

    public void fly(){
        Log.d("DEBUG", this.name + " never went for that flying business.!");
    }
}
