package com.example.dip.client.classes;

/**
 * Created by BForte on 3/14/14.
 */
public class ResponderF  extends BaseResponder {
    private String warehouseName;

    public ResponderF() {
        this.warehouseName = "Warehouse F";
    }

    public String returnResponse(String location) {
        String warehouseName;
        boolean isClosest = false;

        ////////////////////////////////////////
        //replace phoney logic with real logic.
        if (location.equals("NO Street")) {
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
