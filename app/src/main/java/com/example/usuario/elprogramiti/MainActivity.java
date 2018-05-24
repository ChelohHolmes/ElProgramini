package com.example.usuario.elprogramiti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.Holu);
    }


    public void decirHola (View view){
        Intent ElHamana = new Intent(MainActivity.this, Main2Activity.class);
        ElHamana.putExtra("Nombrecito", "Hola");
        ElHamana.putExtra("Edad", 34);
        startActivity(ElHamana);

    }
}
