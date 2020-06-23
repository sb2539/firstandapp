/* ***********************************
 * 프로그램 명 : MainActivity.java
 * 작성자 : 2016039025 허신범
 * 작성일 : 2020.04.11
 * 프로그램 설명 : beomapp
 * ***********************************/

package com.example.user.beomapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edText;
    Button button1, button2;
    RadioButton radio1, radio2;
    ImageView imageView;
    Intent uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edText=(EditText) findViewById(R.id.edText);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        radio1=(RadioButton)findViewById(R.id.radio1);
        radio2=(RadioButton)findViewById(R.id.radio2);
        imageView=(ImageView)findViewById(R.id.imageView);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),edText.getText().toString(), 0).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=new Intent(Intent.ACTION_VIEW,Uri.parse(edText.getText().toString()));
                startActivity(uri);

            }
        });
        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.pie);
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.oreo);
            }
        });
    }
}
