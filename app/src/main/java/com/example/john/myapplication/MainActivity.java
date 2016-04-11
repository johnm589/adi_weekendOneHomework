package com.example.john.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button gradeButton = (Button) findViewById(R.id.Button1);
        Button fiveButton = (Button) findViewById(R.id.Button2);



        View.OnClickListener buttonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 = (EditText) findViewById(R.id.editText);
                String sTextFromET = et1.getText().toString();
                ImageView imageView = (ImageView) findViewById(R.id.pic);
                TextView textView = (TextView) findViewById(R.id.textView);
                int inputValue = new Integer(sTextFromET).intValue();


                if (inputValue > 100) {
                    Toast.makeText(MainActivity.this, "Number must be 0 - 100!", Toast.LENGTH_LONG).show();
                    textView.setText("ERROR 404");
                    imageView.setImageResource(R.drawable.austin);
                    Log.e("cool", "404");
                    textView.setTextColor(Color.RED);
                } else if (inputValue > 90) {
                    textView.setTextColor(Color.GREEN);
                    textView.setText("A for AMERICA");
                    Log.d("cool", "Got an A");
                    Toast.makeText(MainActivity.this, "You Passed!", Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.murica1);
                } else if (inputValue > 80) {
                    textView.setTextColor(Color.GREEN);
                    textView.setText("B");
                    Log.d("cool", "Got a B");
                    Toast.makeText(MainActivity.this, "You Passed!", Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.murica);
                } else if (inputValue > 70) {
                    textView.setTextColor(Color.MAGENTA);
                    textView.setText("C");
                    Toast.makeText(MainActivity.this, "You Did OK", Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(0);
                    Log.d("cool", "Got a C");
                } else if (inputValue > 60) {
                    textView.setTextColor(Color.RED);
                    textView.setText("D");
                    Toast.makeText(MainActivity.this, "FAIL", Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.queen);
                    Log.d("cool", "Got a D");
                } else if (inputValue > 0) {
                    textView.setTextColor(Color.RED);
                    textView.setText("F");
                    Toast.makeText(MainActivity.this, "SUPER FAIL", Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.queen);
                    Log.d("cool", "Got an F");
                } else {
                    Toast.makeText(MainActivity.this, "Number must be 0 - 100!", Toast.LENGTH_LONG).show();
                    textView.setText("ERROR 404");
                    imageView.setImageResource(R.drawable.austin);
                    textView.setTextColor(Color.RED);
                    Log.e("cool", "404");
                }
            }
            };

        View.OnClickListener buttonOnClickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 = (EditText) findViewById(R.id.editText);
                String sTextFromET = et1.getText().toString();
                TextView textView = (TextView) findViewById(R.id.textView);
                int inputValue = new Integer(sTextFromET).intValue();
                ImageView imageView = (ImageView) findViewById(R.id.pic);

                if (inputValue > 100){
                    Toast.makeText(MainActivity.this, "Number must be 0 - 100!", Toast.LENGTH_LONG).show();
                    textView.setText("ERROR 404");
                    imageView.setImageResource(R.drawable.austin);
                    textView.setTextColor(Color.RED);
                    Log.e("cool", "404");
                }else if (inputValue > 70) {
                    textView.setText(sTextFromET + " " + sTextFromET + " " + sTextFromET + " " + sTextFromET + " " + sTextFromET);
                    textView.setTextColor(Color.GREEN);
                    imageView.setImageResource(0);
                    Log.d("cool", "5 Times Green");
                }else if (inputValue > 0) {
                    textView.setText(sTextFromET + " " + sTextFromET + " " + sTextFromET + " " + sTextFromET + " " + sTextFromET);
                    textView.setTextColor(Color.RED);
                    imageView.setImageResource(0);
                    Log.d("cool", "5 Times Red");
                }else{
                    Toast.makeText(MainActivity.this, "Number must be 0 - 100!", Toast.LENGTH_LONG).show();
                    textView.setText("ERROR 404");
                    textView.setTextColor(Color.RED);
                    imageView.setImageResource(R.drawable.austin);
                    Log.e("cool", "404");
                }
            }
        };

        gradeButton.setOnClickListener(buttonOnClickListener);
        fiveButton.setOnClickListener(buttonOnClickListener2);


    }
}
