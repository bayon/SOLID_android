package com.example.dip.client.classes;

/**
 * Created by BForte on 3/14/14.
 */
public class CallerB extends BaseCaller  {

    private String location;

    public CallerB(){
        this.location = "B Street";
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
