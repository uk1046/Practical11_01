package com.example.checkbox01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox cb1,cb2,cb3,cb4,cb5;
Button btn;
String str= "Selected Subject:";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (CheckBox) findViewById(R.id.chk01);
        cb2 = (CheckBox) findViewById(R.id.chk02);
        cb3 = (CheckBox) findViewById(R.id.chk03);
        cb4 = (CheckBox) findViewById(R.id.chk04);
        cb5 = (CheckBox) findViewById(R.id.chk05);
        btn = (Button) findViewById(R.id.btn01);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(cb1.isChecked()) {
                   Toast.makeText(getApplicationContext(), str+" MAD ", Toast.LENGTH_LONG).show();

               }

                if(cb2.isChecked()) {
                    Toast.makeText(getApplicationContext(), str+" PWP ", Toast.LENGTH_LONG).show();

                }
                if(cb3.isChecked()) {
                    Toast.makeText(getApplicationContext(), str+" WBP ", Toast.LENGTH_LONG).show();

                }
                if(cb4.isChecked()) {
                    Toast.makeText(getApplicationContext(), str+" MAN ", Toast.LENGTH_LONG).show();

                }
                if(cb5.isChecked()) {
                    Toast.makeText(getApplicationContext(), str+" ETI", Toast.LENGTH_LONG).show();

                }
                if(cb1.isChecked() == false && cb2.isChecked() == false && cb3.isChecked() == false
                        && cb4.isChecked() == false && cb5.isChecked() == false )
                {
                    Toast.makeText(getApplicationContext(), " Please Select Subject", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}