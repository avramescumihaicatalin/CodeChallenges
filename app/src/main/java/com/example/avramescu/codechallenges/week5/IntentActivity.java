package com.example.avramescu.codechallenges.week5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.avramescu.codechallenges.R;

public class IntentActivity extends AppCompatActivity {

    private EditText mEditTextBrowser;
    private EditText mEditTextLocation;
    private EditText mEditTextText;
    private EditText mEditTextCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        initView();
    }

    private void initView() {
        mEditTextBrowser = findViewById(R.id.edit_text_browser);
        mEditTextLocation = findViewById(R.id.edit_text_locatiom);
        mEditTextText = findViewById(R.id.edit_text_share_text);
        mEditTextCall = findViewById(R.id.edit_text_call);
    }

    public void oepnWebSiteOnClick(View view) {
        String site = null;
        if(mEditTextBrowser!=null){
            site = mEditTextBrowser.getText().toString();
        }
        if(site!=null && !TextUtils.isEmpty(site)){
            Intent intentBrowser = new Intent();
            intentBrowser.setAction(Intent.ACTION_VIEW);
            intentBrowser.setData(Uri.parse("https://" + site));
            if(intentBrowser.resolveActivity(getPackageManager()) != null){
                startActivity(intentBrowser);
            }
        }
    }

    public void openLocationOnClick(View view) {
        String location = null;
        if(mEditTextLocation!=null){
            location = mEditTextLocation.getText().toString();
        }
        if(location!=null && !TextUtils.isEmpty(location)){
            Intent intentLocation = new Intent();
            intentLocation.setAction(Intent.ACTION_VIEW);
            intentLocation.setData(Uri.parse("geo:0,0?q=Bucharest"));
            if(intentLocation.resolveActivity(getPackageManager()) != null){
                startActivity(intentLocation);
            }
        }
    }

    public void shareTextOnClick(View view) {
        String text = null;
        if(mEditTextText!=null){
            text = mEditTextText.getText().toString();
        }
        if(text!=null && !TextUtils.isEmpty(text)){
            Intent intentShareText = new Intent();
            intentShareText.setAction(Intent.ACTION_SEND);
            intentShareText.setType("text/plain");
            intentShareText.putExtra(Intent.EXTRA_TEXT, text);
            if(intentShareText.resolveActivity(getPackageManager()) != null){
                startActivity(intentShareText);
            }
        }

    }

    public void callNumberOnClick(View view) {
        String number = null;
        if(mEditTextCall!=null){
            number = mEditTextBrowser.getText().toString();
        }
        if(number!=null && !TextUtils.isEmpty(number)){
            Intent intentCall = new Intent();
            intentCall.setAction(Intent.ACTION_DIAL);
            intentCall.setData(Uri.parse("tel:" + number));
            if(intentCall.resolveActivity(getPackageManager()) != null){
                startActivity(intentCall);
            }
        }
    }
}
