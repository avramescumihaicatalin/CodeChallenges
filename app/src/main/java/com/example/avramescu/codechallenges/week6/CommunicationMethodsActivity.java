package com.example.avramescu.codechallenges.week6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.avramescu.codechallenges.R;

public class CommunicationMethodsActivity extends AppCompatActivity {

    CommunicationMethodsFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_methods);

        fragment = new CommunicationMethodsFragment();
        addFragmentDynamically();
    }

    private void addFragmentDynamically() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.placeholder, fragment);
        fragmentTransaction.commit();
    }


    public void onClickCommunication(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        CommunicationMethodsFragment fragment = (CommunicationMethodsFragment) fragmentManager.findFragmentById(R.id.placeholder);
        fragment.receiveDataFromActivity("Data from activity");
    }
}
