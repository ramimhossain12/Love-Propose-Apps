package com.example.loveproposeapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SpalshActivity extends AppCompatActivity {


    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        imageView= findViewById(R.id.imageView22ID);
        button= findViewById(R.id.Letsgo22ID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(SpalshActivity.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}