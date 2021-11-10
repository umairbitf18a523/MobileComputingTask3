package com.example.mobilecomputingtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button move2,move3,move4,move5,move6;
    TextView text,text2;
    String [] ArabicLetters={"ا","ب","ت","ث","ج","ح","خ","د","ذ","ر","ز","س","ش","ص","ض","ط","ظ","ع","غ","ف","ق","ك","ل","م","ن","ه","و","ي"};
    Random dice=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //random number generated
        int number= dice.nextInt(28);
        text=findViewById(R.id.textView);

        //random alphabet show in text field
        text.setText(ArabicLetters[number]);

        //Throat section
        move2=findViewById(R.id.button2);
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ArabicLetters[number].equals("ا") || ArabicLetters[number].equals("ه") || ArabicLetters[number].equals("ع") || ArabicLetters[number].equals("ح") || ArabicLetters[number].equals("غ") || ArabicLetters[number].equals("خ") )
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("keyname",ArabicLetters[number]);
                    startActivity(intent);

                }
            }
        });




        /*int e=GlobalVariable.glob;
        String s=String.valueOf(e);
        text2=findViewById(R.id.textView2);
        text2.setText(s);*/

        //tongue section
        move3=findViewById(R.id.button3);
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ArabicLetters[number].equals("ض") || ArabicLetters[number].equals("ل") || ArabicLetters[number].equals("ن") || ArabicLetters[number].equals("ر") || ArabicLetters[number].equals("ت") || ArabicLetters[number].equals("د") || ArabicLetters[number].equals("ط") || ArabicLetters[number].equals("ظ") || ArabicLetters[number].equals("ذ") || ArabicLetters[number].equals("ث") || ArabicLetters[number].equals("ص") || ArabicLetters[number].equals("ز") || ArabicLetters[number].equals("س") )
                {
                    Intent intent2=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent2);

                }
            }
        });



    }
}