package com.example.dip.client.classes;

/**
 * Created by BForte on 3/14/14.
 */
public class CallerA extends BaseCaller {

    private String location;

    public CallerA(){
        this.location = "A Street";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
