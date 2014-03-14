package com.example.dip.client;

import android.app.Activity;
import android.os.Bundle;

import com.example.dip.R;
import com.example.dip.client.classes.CallerA;
import com.example.dip.client.classes.CallerB;
import com.example.dip.client.classes.CallerC;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CallerA callerA = new CallerA();
        callerA.sendProductFromClosestWarehouseToLocation(callerA.getLocation());

        CallerB callerB = new CallerB();
        callerB.sendProductFromClosestWarehouseToLocation(callerB.getLocation());

        CallerC callerC = new CallerC();
        callerC.sendProductFromClosestWarehouseToLocation(callerC.getLocation());

    }

}
