package com.example.avramescu.codechallenges.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;

public class FirstActivityChat extends AppCompatActivity {

    private EditText mEditTextFirstActivity;
    private TextView mTextViewReplyReceived;
    public static final String CHEIE = "cheie1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_chat);

        initView();
    }

    private void initView() {
        mEditTextFirstActivity = findViewById(R.id.editText_first_activity);
        mTextViewReplyReceived = findViewById(R.id.textView_reply_received);
    }

    public void startSecondActivityOnClick(View view) {
        Intent intent = new Intent( FirstActivityChat.this, SecondActivityChat.class);
        String mesaj = mEditTextFirstActivity.getText().toString();
        intent.putExtra(CHEIE, mesaj);
        startActivity(intent);
    }

    @Override
    protected void onResume(){
        super.onResume();

        String mesaj = null;
        Bundle dataReceived= getIntent().getExtras();
        if(dataReceived != null){
            mesaj = dataReceived.getString(SecondActivityChat.CHEIE);
        }
        if(mTextViewReplyReceived != null){

        }
    }
}
