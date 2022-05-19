package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1,btn2;
    private EditText nameeditText,massegeEditText   ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.yesbtnID);
        btn2 = findViewById(R.id.nobtnID);

        nameeditText = findViewById(R.id.nameEditTextID);
        massegeEditText = findViewById(R.id.massegeEditTextID);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        nameeditText.setOnClickListener(this);
        massegeEditText.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        try {
            String name = nameeditText.getText().toString();

            String massege = massegeEditText.getText().toString();
            if (view.getId()==R.id.yesbtnID){

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");


                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{" "});

                intent.putExtra(Intent.EXTRA_SUBJECT,"Propose Email");
                intent.putExtra(Intent.EXTRA_TEXT,"Name :"+name +"\n Message :"+massege);




                startActivity(Intent.createChooser(intent,"Feedback with"));


            }else if(view.getId()==R.id.nobtnID){
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"ramimhossain6242@gmail.com"});

                intent.putExtra(Intent.EXTRA_SUBJECT,"Partner Propose Email");
                intent.putExtra(Intent.EXTRA_TEXT,"Name :"+name +"\n Message :"+massege);
                startActivity(Intent.createChooser(intent,"Feedback with"));

            }

        }catch (Exception e){

            Toast.makeText(getApplicationContext(),"Exception :"+e,Toast.LENGTH_SHORT).show();

        }


    }
}