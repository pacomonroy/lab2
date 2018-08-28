package com.example.paco.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.support.annotation.Nullable;


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



        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);





        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {



                Intent intentC1 = new Intent(MainActivity.this, MainActivity.class);

                startActivity(intentC1);
                str = editTxt.getText().toString();
            }});


        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                str = editTxt.getText().toString();
                Intent intentC2 = new Intent(MainActivity.this, Main2Activity.class);
                intentC2.putExtra("holaa2", "hola2");
                startActivity(intentC2);


            } });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intentC3 = new Intent(MainActivity.this, Main3Activity.class);
                str = intentC3.getStringExtra("hola3");
            }

        });
    }
}
