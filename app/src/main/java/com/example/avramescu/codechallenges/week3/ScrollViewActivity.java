package com.example.avramescu.codechallenges.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;

public class ScrollViewActivity extends AppCompatActivity {

    private TextView mTextViewLongText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        initView();
    }

    private void initView() {
        mTextViewLongText = findViewById(R.id.text_view_long_text);
        mTextViewLongText.setText(R.string.text_long_for_scroll);
    }
}
