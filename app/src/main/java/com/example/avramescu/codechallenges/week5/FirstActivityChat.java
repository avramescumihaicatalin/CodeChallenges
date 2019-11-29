package com.example.avramescu.codechallenges.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.avramescu.codechallenges.R;

public class FirstActivityChat extends AppCompatActivity {

    private EditText mEditTextFirstActivity;
    private TextView mTextViewMessageType;
    private TextView mTextViewMessageReceived;

    public static final String CHEIE = "cheie1";
    public static final String REPLY = "reply";
    public static boolean replyState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_chat);

        initView();
        setTitle("First Activity");
    }

    private void initView() {
        mEditTextFirstActivity = findViewById(R.id.edit_text_first_activity);
        mTextViewMessageType = findViewById(R.id.text_view_message_type);
        mTextViewMessageReceived = findViewById(R.id.text_view_received_message);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent( FirstActivityChat.this, SecondActivityChat.class);
        String mesage = mEditTextFirstActivity.getText().toString();
        if(!TextUtils.isEmpty(mesage)){
            intent.putExtra(CHEIE, mesage);
            intent.putExtra(REPLY, replyState);
            startActivity(intent);
        } else {
            Toast.makeText(this, getResources().
                    getString(R.string.label_please_introduce_a_message), Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onResume(){
        super.onResume();

        String message = null;
        boolean reply = false;
        Bundle dataReceived= getIntent().getExtras();
        if(dataReceived != null){
            message = dataReceived.getString(SecondActivityChat.CHEIE);
            reply = dataReceived.getBoolean(FirstActivityChat.REPLY);
            if(mTextViewMessageReceived != null && !TextUtils.isEmpty(message) && message!= null){
                mTextViewMessageReceived.setText(message);
                if(reply){
                    mTextViewMessageType.setText(getResources().getString(R.string.label_message_type_reply));
                } else {
                    mTextViewMessageType.setText(getResources().getString(R.string.label_message_type_received));
                }
            }
        }
    }
}
