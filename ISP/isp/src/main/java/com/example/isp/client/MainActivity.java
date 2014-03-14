package com.example.isp.client;

import android.app.Activity;
import android.os.Bundle;

import com.example.isp.R;
import com.example.isp.classes.Manager;
import com.example.isp.classes.Robot;
import com.example.isp.classes.Worker;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Worker worker = new Worker();
        Manager mgr1 = new Manager(worker);
        mgr1.manageWorker();

		Robot robot = new Robot();
        Manager mgr2 = new Manager(robot);
        mgr2.manageRobot();


	}

}
