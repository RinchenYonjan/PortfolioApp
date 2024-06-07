package com.example.myportfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_introActivity extends AppCompatActivity {

    Button skip_Btn;

    Button next_Btn;

    intro1Fragment intro1 = new intro1Fragment();

    intro2Fragment intro2 = new intro2Fragment();

    intro3Fragment intro3 = new intro3Fragment();

    int first = 1;
    int second = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intro);
        skip_Btn = findViewById(R.id.skip_btn);
        next_Btn = findViewById(R.id.next_btn);
        getSupportFragmentManager().beginTransaction().replace(R.id.container2,intro1).commit();

        next_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(first == 1){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container2,intro2).commit();
                    first = 2;
                } else if (second == 2) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container2,intro3).commit();
                    second = 3;
                } else {
                    Intent intent = new Intent(main_introActivity.this,mainActivity.class);
                    startActivity(intent);
                }
            }
        });

        skip_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_introActivity.this,mainActivity.class);
                startActivity(intent);
            }
        });
    }
}