package com.example.dip.client.classes;

/**
 * Created by BForte on 3/14/14.
 */
public class ResponderG  extends BaseResponder{
    private String warehouseName;

    public ResponderG() {
        this.warehouseName = "Warehouse G";
    }

    public String returnResponse(String location) {
        String warehouseName;
        boolean isClosest = false;

        ////////////////////////////////////////
        //replace phoney logic with real logic.
        if (location.equals("B Street")) {
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
