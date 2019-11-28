package com.example.avramescu.codechallenges.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.avramescu.codechallenges.R;

public class FirstActivityButtons extends AppCompatActivity {

    private Button mButtonTextOne;
    private Button mButtonTextTwo;
    private Button mButtonTextThree;
    public static final String CHEIEBUTON1 = "Buton1";
    public static final String CHEIEBUTON2 = "Buton2";
    public static final String CHEIEBUTON3 = "Buton3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        initView();
    }

    private void initView() {
        mButtonTextOne = findViewById(R.id.button_text_one);
        mButtonTextTwo = findViewById(R.id.button_text_two);
        mButtonTextThree = findViewById(R.id.button_text_three);
    }

    public void startSecondActivityButtons(View view) {
        if(view != null){
            Intent intent = new Intent(FirstActivityButtons.this, SecondActivityButtons.class);
            switch (view.getId()){
                case R.id.button_text_one:{
                    intent.putExtra(CHEIEBUTON1, getResources().getString(R.string.message1));
                    break;
                }
                case R.id.button_text_two:{
                    intent.putExtra(CHEIEBUTON2, getResources().getString(R.string.message2));
                    break;
                }
                case R.id.button_text_three:{
                    intent.putExtra(CHEIEBUTON3, getResources().getString(R.string.message3));
                    break;
                }
            }
            startActivity(intent);
        }
    }

}
