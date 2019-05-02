package com.example.avramescu.codechallenges.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.avramescu.codechallenges.R;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.w("FirstActivity", "onCreate");
    }

    public void goToSecondActivity(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.w("FirstActivity", "onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.w("FirstActivity", "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.w("FirstActivity", "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.w("FirstActivity", "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.w("FirstActivity" , "onDetroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.w("FirstActvity", "onRestart");
    }
}
