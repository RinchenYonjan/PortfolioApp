package com.example.myportfolioapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class mainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {


//    ImageButton camera_button = (ImageButton)findViewById(R.id.camera_button);
    BottomNavigationView bottomNavigationView;

    homeFragment home = new homeFragment();

    profileFragment profile = new profileFragment();

    skillFragment skill = new skillFragment();

    hobbiesFragment hobbies = new hobbiesFragment();

    contactFragment contact = new contactFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.home)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
            return true;
        } else if(item.getItemId() == R.id.profile){

            getSupportFragmentManager().beginTransaction().replace(R.id.container, profile).commit();
            return true;

        } else if (item.getItemId() == R.id.skill) {

            getSupportFragmentManager().beginTransaction().replace(R.id.container, skill).commit();
            return true;

        } else if (item.getItemId() == R.id.hobbies) {

            getSupportFragmentManager().beginTransaction().replace(R.id.container, hobbies).commit();
            return true;

        }

        return false;

    }
}


