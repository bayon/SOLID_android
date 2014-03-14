package com.example.dip.client.classes;

/**
 * Created by BForte on 3/14/14.
 */
public class CallerC extends BaseCaller {
    private String location;

    public CallerC(){
        this.location = "C Street";
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
