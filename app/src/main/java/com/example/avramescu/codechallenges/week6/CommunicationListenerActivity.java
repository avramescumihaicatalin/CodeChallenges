package com.example.avramescu.codechallenges.week6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.avramescu.codechallenges.R;

public class CommunicationListenerActivity extends AppCompatActivity implements CommunicationListenerFragment.FragmentListener {

    CommunicationListenerFragment mFragment;
    Button mActivityButton;
    ActivityListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_listener);

        mActivityButton = findViewById(R.id.button_activity);
        mActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onActivityMethodClicked("dataaaa");
            }
        });

        mFragment = new CommunicationListenerFragment();
        addFragmentDinamically();
    }

    private void addFragmentDinamically() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.placeholder, mFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        if(fragment instanceof CommunicationListenerFragment){
            ((CommunicationListenerFragment) fragment).setFragmentListener(this);
        }
        super.onAttachFragment(fragment);
    }

    public void setActivityListener (ActivityListener listener) {
        this.listener = listener;
    }

    @Override
    public void onFragmentMethodClicked() {
        Toast.makeText(this, "Fragment button clicked", Toast.LENGTH_SHORT).show();
    }
}

interface ActivityListener {
    void onActivityMethodClicked(String data);
}
