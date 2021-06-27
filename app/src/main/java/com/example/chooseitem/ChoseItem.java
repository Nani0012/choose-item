package com.example.chooseitem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ChoseItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_item);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        WarnaKursiFragment mWarnaKursiFragment = new WarnaKursiFragment();
        mFragmentTransaction.add(R.id.frame_container, mWarnaKursiFragment, WarnaKursiFragment.class.getSimpleName());

        mFragmentTransaction.commit();
    }
}