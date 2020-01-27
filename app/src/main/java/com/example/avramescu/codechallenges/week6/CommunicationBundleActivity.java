package com.example.avramescu.codechallenges.week6;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.avramescu.codechallenges.R;

public class CommunicationBundleActivity extends AppCompatActivity {

    public static final String SEND_MESSAGE_TO_FRAGMENT_KEY = "SEND_MESSAGE_TO_FRAGMENT_KEY";

    CommunicationBundleFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_bundle);

//        fragment = new CommunicationBundleFragment();

        onCreateCommunication();
    }

    private void onCreateCommunication() {
        Bundle bundle = new Bundle();
        String myMessage = "Stack Overflow is cool!";
        bundle.putString("message", myMessage );
        CommunicationBundleFragment fragInfo = new CommunicationBundleFragment();
        fragInfo.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.placeholder, fragInfo);
        transaction.commit();
    }

    public void onClickCommunication(View view) {
        sendData();
        addFragmentDinamically();
    }

    private void sendData() {
        fragment = new CommunicationBundleFragment();
        EditText editText = findViewById(R.id.edit_text_activity);
        if(editText != null){
            Bundle bundle = new Bundle();
            bundle.putString(SEND_MESSAGE_TO_FRAGMENT_KEY, editText.getText().toString());
            fragment.setArguments(bundle);
        }
    }

    private void addFragmentDinamically() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.placeholder, fragment);
        fragmentTransaction.commit();
    }

}
