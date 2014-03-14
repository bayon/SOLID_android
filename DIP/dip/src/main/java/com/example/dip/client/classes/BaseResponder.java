package com.example.dip.client.classes;

/**
 * Created by BForte on 3/14/14.
 */
public class BaseResponder {
	private String warehouseName;

	public BaseResponder() {
		this.warehouseName = "Warehouse Base";
	}

	public String returnResponse(String location) {
		String warehouseName;
		boolean isClosest = false;

        ////////////////////////////////////////
		//replace phoney logic with real logic.
		if (location.equals("Base Location")) {
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
