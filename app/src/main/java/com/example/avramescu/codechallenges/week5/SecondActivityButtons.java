package com.example.avramescu.codechallenges.week5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;
import com.example.avramescu.codechallenges.week3.ScrollViewActivity;

public class SecondActivityButtons extends AppCompatActivity {

    private ScrollViewActivity mScrollView;
    private TextView mTextViewScrollview;

    public static String textActivitate1;
    public static String textActivitate2;
    public static String textActivitate3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_buttons);

        initView();
    }

    private void initView() {
        mTextViewScrollview = findViewById(R.id.text_view_scroll_view);
    }

    @Override
    protected void onResume(){
        super.onResume();

        String message1 = null;
        String message2 = null;
        String message3 = null;
        Bundle dataReceived = getIntent().getExtras();
        if(dataReceived != null){
            message1 = dataReceived.getString(FirstActivityButtons.CHEIEBUTON1);
            message2 = dataReceived.getString(FirstActivityButtons.CHEIEBUTON2);
            message3 = dataReceived.getString(FirstActivityButtons.CHEIEBUTON3);

            if(message1 != null && message1.equals("mesaj1")){
                mTextViewScrollview.setText(textActivitate1);
            }
            if(message2 != null && message2.equals("mesaj2")){
                mTextViewScrollview.setText(textActivitate2);
            }
            if(message3 != null && message3.equals("mesaj3")){
                mTextViewScrollview.setText(textActivitate3);
            }
        }

    }
}
