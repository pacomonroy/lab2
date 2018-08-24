package com.example.paco.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private Button btn1;
    private Button btn2;
    private Button btn3;
    private EditText editTxt;
    private TextView txtView;
    private String str;
    private int n;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        editTxt = findViewById(R.id.editText);
        txtView = findViewById(R.id.textView);




        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {


                Intent intentC1 = new Intent(packageContent:MainActivity);


                startActivity(intentC1);
                str = editTxt.getText().toString();
            }};


        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                str = editTxt.getText().toString();
                Intent intentC2 = new Intent(packageContent:MainActivity);
                intentC2.putExtra(name "The String".str);
                startActivity(intentC2);


            } };

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                intent myIntent = getIntent();
                Str str = myIntent.getString();
            }

        };
    }
}
