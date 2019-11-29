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

public class SecondActivityChat extends AppCompatActivity {

    private TextView mTextViewMessageReceived;
    private TextView mTextViewMessageType;
    private EditText mEditTextSecondActivity;
    public static final String CHEIE = "cheie2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_chat);

        initView();
        setTitle("Second Activity");
    }

    private void initView() {
        mTextViewMessageReceived = findViewById(R.id.text_view_received_message);
        mTextViewMessageType = findViewById(R.id.text_view_message_type);
        mEditTextSecondActivity = findViewById(R.id.edit_text_second_activity);
    }

    @Override
    protected void onResume(){
        super.onResume();

        String mesaj = null;
        boolean reply = false;
        Bundle dataReceived = getIntent().getExtras();
        if(dataReceived != null){
            mesaj = dataReceived.getString(FirstActivityChat.CHEIE);
            reply = dataReceived.getBoolean(FirstActivityChat.REPLY);
        }
        if(mTextViewMessageReceived != null && !TextUtils.isEmpty(mesaj) && mesaj!= null){
            mTextViewMessageReceived.setText(mesaj);
            if(reply){
                mTextViewMessageType.setText(getResources().getString(R.string.label_message_type_reply));
            } else {
                mTextViewMessageType.setText(getResources().getString(R.string.label_message_type_received));
            }
        }

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(SecondActivityChat.this, FirstActivityChat.class);
        if(mEditTextSecondActivity!=null){
            String message = mEditTextSecondActivity.getText().toString();
            if(!TextUtils.isEmpty(message)){
                intent.putExtra(CHEIE,message);
                intent.putExtra(FirstActivityChat.REPLY, true);
                FirstActivityChat.replyState = true;
                startActivity(intent);
            } else {
                Toast.makeText(this, getResources().
                        getString(R.string.label_please_introduce_a_message), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
