package com.example.avramescu.codechallenges.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;

import org.w3c.dom.Text;

public class SecondActivityChat extends AppCompatActivity {

    private TextView mTextViewMessageReceived;
    private EditText mEditTextSecondActivity;
    public static final String CHEIE = "cheie2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_chat);

        initView();

    }

    private void initView() {
        mTextViewMessageReceived = findViewById(R.id.textView_message_received);
        mEditTextSecondActivity = findViewById(R.id.editText_second_activity);
    }

    public void startFirstActivityOnClick(View view) {
        Intent intent = new Intent(SecondActivityChat.this, FirstActivityChat.class);
        if(mEditTextSecondActivity!=null){
            String mesaj = mEditTextSecondActivity.getText().toString();
            if(!TextUtils.isEmpty(mesaj)){
                intent.putExtra(CHEIE,mesaj);
                startActivity(intent);
            }
        }

    }

    @Override
    protected void onResume(){
        super.onResume();

        String mesaj = null;
        Bundle dataReceived = getIntent().getExtras();
        if(dataReceived != null){
            mesaj = dataReceived.getString(FirstActivityChat.CHEIE);
        }
        if(mTextViewMessageReceived != null && !TextUtils.isEmpty(mesaj) && mesaj!= null){
            mTextViewMessageReceived.setText(mesaj);
        }

    }
}
