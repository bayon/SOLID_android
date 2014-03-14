package com.example.dip.client.classes;

/**
 * Created by BForte on 3/14/14.
 */
public interface DependencyDelegate {
    public void sendProductFromClosestWarehouseToLocation(String location);
    public String returnResponse(String location);

}
