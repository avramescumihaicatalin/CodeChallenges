package com.example.avramescu.codechallenges.week6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;

public class CommunicationBundleActivity extends AppCompatActivity {

    public static final String SENDMESSAGETOFRAGMENT = "SENDMESSAGETOFRAGMENT";

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_bundle);

//        sendData();
//        addFragmentDinamically();
        lastTry();
    }

    private void lastTry() {
        Bundle bundle = new Bundle();
        String myMessage = "Stack Overflow is cool!";
        bundle.putString("message", myMessage );
        CommunicationBundleFragment fragInfo = new CommunicationBundleFragment();
        fragInfo.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.placeholder, fragInfo);
        transaction.commit();
    }

    private void sendData() {
        fragment = new CommunicationBundleFragment();
        TextView textView = findViewById(R.id.text_view_activity);
        if(textView != null){
            Bundle bundle = new Bundle();
            bundle.putString(SENDMESSAGETOFRAGMENT, textView.getText().toString());
            fragment.setArguments(bundle);
        }
    }

    private void addFragmentDinamically() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.placeholder, fragment);
        fragmentTransaction.commit();

    }

    public void sendMessageToFragment(View view) {
//        TextView textView = findViewById(R.id.text_view_activity);
//        if(textView != null){
//            Bundle bundle = new Bundle();
//            bundle.putString(SENDMESSAGETOFRAGMENT, textView.getText().toString());
//            fragment.setArguments(bundle);
//        }
    }
}
