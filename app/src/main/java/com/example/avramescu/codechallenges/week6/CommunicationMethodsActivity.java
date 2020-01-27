package com.example.avramescu.codechallenges.week6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.avramescu.codechallenges.R;

public class CommunicationMethodsActivity extends AppCompatActivity {

    CommunicationMethodsFragment fragment;
    EditText mEditTextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_methods);

        mEditTextActivity = findViewById(R.id.edit_text_activity);

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
        fragment.receiveDataFromActivity("data");
//        or this if you need to get the fragment instance.
        FragmentManager fragmentManager = getSupportFragmentManager();
        CommunicationMethodsFragment fragment = (CommunicationMethodsFragment) fragmentManager.findFragmentById(R.id.placeholder);
        fragment.receiveDataFromActivity("Data from activity");

    }

    public void receiveDataFromFragment (String receivedDataFromFragment) {
        mEditTextActivity.setText(receivedDataFromFragment);
    }
}
