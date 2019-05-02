package com.example.avramescu.codechallenges.week5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.avramescu.codechallenges.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.w("SecondActivity", "onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.w("SecondActivity", "onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.w("SecondActivity", "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.w("SecondActivity", "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.w("SecondActivity", "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.w("SecondActivity", "onDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.w("SecondActivity", "onRestart()");
    }
}
