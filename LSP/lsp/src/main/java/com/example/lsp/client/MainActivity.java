package com.example.lsp.client;

import android.app.Activity;
import android.os.Bundle;

import com.example.lsp.R;
import com.example.lsp.subclass.Crow;
import com.example.lsp.subclass.Ostrich;
import com.example.lsp.subclass.Bird;
import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Crow crow = new Crow();
        Ostrich ostrich = new Ostrich();

        ArrayList<Bird> arrayListOfBirds = new ArrayList();
        arrayListOfBirds.add(crow);
        arrayListOfBirds.add(ostrich);

        for (Bird b : arrayListOfBirds){
            b.fly();
        }
    }

}
