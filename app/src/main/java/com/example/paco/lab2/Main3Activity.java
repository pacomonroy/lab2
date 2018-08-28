package com.example.paco.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Button;



public class Main3Activity extends AppCompatActivity {

    TextView txtView;
    private String str;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent myOtherintent = getIntent();
        str = myOtherintent.getStringExtra("hola");
        startActivity(myOtherintent);




    }
}
