package com.example.usuario.elprogramiti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent r = getIntent();
        int i = r.getIntExtra("Edad",0);
        String s = r.getStringExtra("Nombrecito");
        
    }


}
