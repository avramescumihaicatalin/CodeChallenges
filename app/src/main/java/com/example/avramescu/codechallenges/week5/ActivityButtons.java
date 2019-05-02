package com.example.avramescu.codechallenges.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.avramescu.codechallenges.R;

public class ActivityButtons extends AppCompatActivity {

    private Button mButtonActivity1;
    private Button mButtonActivity2;
    private Button mButtonActivity3;
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
        mButtonActivity1 = findViewById(R.id.button_activity1);
        mButtonActivity2 = findViewById(R.id.button_activity2);
        mButtonActivity3 = findViewById(R.id.button_activity3);
    }

    public void startActivity1(View view) {
        if(mButtonActivity1 != null){
            Intent intentButon1 = new Intent(ActivityButtons.this, SecondActivityButtons.class);
            intentButon1.putExtra(CHEIEBUTON1, "mesaj1");
            startActivity(intentButon1);
        }
    }

    public void startActivity2(View view) {
        if(mButtonActivity2 != null){
            Intent intentButon2 = new Intent(ActivityButtons.this, SecondActivityButtons.class);
            intentButon2.putExtra(CHEIEBUTON2, "mesaj2");
            startActivity(intentButon2);
        }
    }

    public void startActivity3(View view) {
        if(mButtonActivity3 != null){
            Intent intentButon3 = new Intent(ActivityButtons.this, SecondActivityButtons.class);
            intentButon3.putExtra(CHEIEBUTON3, "mesaj3");
            startActivity(intentButon3);
        }
    }
}
