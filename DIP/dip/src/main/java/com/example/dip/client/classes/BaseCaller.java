package com.example.dip.client.classes;

/**
 * Created by BForte on 3/14/14.
 */
public class BaseCaller implements DependencyDelegate{

    private String location;

    public BaseCaller(){
        this.location = "Base Caller";
    }

    @Override
    public void sendProductFromClosestWarehouseToLocation(String location) {
        DependencyConcrete dc = new DependencyConcrete();
        dc.sendProductFromClosestWarehouseToLocation(location);
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


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
