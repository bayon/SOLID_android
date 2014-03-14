package com.example.dip.client.classes;

/**
 * Created by BForte on 3/14/14.
 */
public class ResponderE extends BaseResponder{
    private String warehouseName;

    public ResponderE() {
        this.warehouseName = "Warehouse E";
    }

    public String returnResponse(String location) {
        String warehouseName;
        boolean isClosest = false;

        ////////////////////////////////////////
        //replace phoney logic with real logic.
        if (location.equals("A Street")) {
            isClosest = true;
        }
        ////////////////////////////////////////

        if (isClosest) {

            warehouseName = this.warehouseName;

        } else {
            warehouseName = "";
        }
        return warehouseName;

    }
}
