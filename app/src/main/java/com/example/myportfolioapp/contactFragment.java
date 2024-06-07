package com.example.myportfolioapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


//class contactFragment extend fragment
public class contactFragment extends Fragment {

    Button back_button;
    Button toast_button;

    homeFragment home = new homeFragment();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_contact, container, false);

        //back button method
        back_button = v.findViewById(R.id.contact_back_btn);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, home);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        //toast button method
        toast_button = v.findViewById(R.id.contact_send_btn);
        toast_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext().getApplicationContext(), "Your message is Sent!", Toast.LENGTH_LONG).show();
            }
        });

        return v;
    }
}
