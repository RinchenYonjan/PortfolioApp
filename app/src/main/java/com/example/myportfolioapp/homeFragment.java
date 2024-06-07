package com.example.myportfolioapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

//class and inheritance
public class homeFragment extends Fragment implements View.OnClickListener {


//computer generated override method
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        ((Button) v.findViewById(R.id.contactButton)).setOnClickListener(this);
        return v;
    }

    //creating method onclick to go to contact screen
    public void onClick(View view){
        contactFragment contact = new contactFragment(); //creating contactFragment object
        FragmentManager fragmentManager = getParentFragmentManager(); //creating fragmentManager object
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); //to take from one screen to another
        fragmentTransaction.replace(R.id.container, contact); //replacing homeFragment to contactFragment using activity file(id)
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit(); //transaction of screen successful
    }

}