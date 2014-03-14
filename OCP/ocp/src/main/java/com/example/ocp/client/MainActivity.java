package com.example.ocp.client;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.ocp.R;
import com.example.ocp.inteface.LoanApprovalHandler;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LoanApprovalHandler lah = new LoanApprovalHandler();
		//boolean result = lah.getValidation("personal","personal-loan-specific-requirements");
		boolean result = lah.getValidation("car", "car-loan-specific-requirements");

		if (result) {
			Log.d("DEBUG", "Validation.....COMPLETED and ACCEPTED");
		} else {
			Log.d("DEBUG", "Validation.....COMPLETED and REJECTED");
		}
	}

}
