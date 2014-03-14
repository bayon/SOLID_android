package com.example.dip.client.classes;

import android.util.Log;

/**
 * Created by BForte on 3/14/14.
 */
public class DependencyConcrete implements DependencyDelegate{


    @Override
    public void sendProductFromClosestWarehouseToLocation(String location) {
        String closestWarehouseName;
        closestWarehouseName = returnResponse(location);
        if(closestWarehouseName != null){
            Log.d("DEBUG",closestWarehouseName +" is the closest to "+ location);
        }
    }

    @Override
    public String returnResponse(String location) {

        String closestWarehouse;

        ResponderE re = new ResponderE();
        closestWarehouse = re.returnResponse(location);
        if(!closestWarehouse.equals("")){
            return closestWarehouse;
        }
        ResponderF rf = new ResponderF();
        closestWarehouse = rf.returnResponse(location);
        if(!closestWarehouse.equals("")){
            return closestWarehouse;
        }
        ResponderG rg = new ResponderG();
        closestWarehouse = rg.returnResponse(location);
        if(!closestWarehouse.equals("")){
            return closestWarehouse;
        }
        ResponderH rh = new ResponderH();
        closestWarehouse = rh.returnResponse(location);
        if(!closestWarehouse.equals("")){
            return closestWarehouse;
        }
        ResponderI ri = new ResponderI();
        closestWarehouse = ri.returnResponse(location);
        if(!closestWarehouse.equals("")){
            return closestWarehouse;
        }

        return closestWarehouse;
    }
}
