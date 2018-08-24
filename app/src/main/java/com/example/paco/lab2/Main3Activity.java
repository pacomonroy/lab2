package com.example.paco.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;



public class Main3Activity extends AppCompatActivity {

    TextView txtView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtView = findViewById(R.id.TextView3);
        Intent myOtherintent = getIntent();
        String str = myOtherintent.getStringExtra( name "TheString");



    }
}
