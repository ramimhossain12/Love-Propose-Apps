package com.example.loveproposeapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private EditText male,female;
    TextView tv;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }



    public void showResult(View view) {


        male = findViewById(R.id.editText1ID);
        female = findViewById(R.id.editText2ID);
        tv= findViewById(R.id.calculateetextI);


        String f = female.getText().toString();
        String m = male.getText().toString();
        String sum = m+f;
        sum = sum.toLowerCase();

        int value = sum.hashCode();
        Random random = new Random(value);
        result = (random.nextInt(100)+1)+"%";

        if (f.equals("") || m.equals("")){

            Toast.makeText(MainActivity2.this,"Enter Names",Toast.LENGTH_SHORT).show();
        }
        tv.setText(result);
    }
}