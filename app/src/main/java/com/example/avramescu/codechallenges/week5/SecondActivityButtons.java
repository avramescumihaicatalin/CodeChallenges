package com.example.avramescu.codechallenges.week5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;

public class SecondActivityButtons extends AppCompatActivity {

    private TextView mTextViewScrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_buttons);

        initView();
        getMessage();
    }

    private void getMessage() {
        String message1 = null;
        String message2 = null;
        String message3 = null;
        Bundle dataReceived = getIntent().getExtras();
        if(dataReceived != null){
            message1 = dataReceived.getString(FirstActivityButtons.CHEIEBUTON1);
            message2 = dataReceived.getString(FirstActivityButtons.CHEIEBUTON2);
            message3 = dataReceived.getString(FirstActivityButtons.CHEIEBUTON3);

            if(message1 != null){
                mTextViewScrollview.setText(getResources().getString(R.string.pasaj1));
            } else if(message2 != null){
                mTextViewScrollview.setText(getResources().getString(R.string.pasaj2));
            } else if(message3 != null){
                mTextViewScrollview.setText(getResources().getString(R.string.pasaj3));
            }
        }
    }

    private void initView() {
        mTextViewScrollview = findViewById(R.id.text_view_scroll_view);
    }


}
