package com.example.avramescu.codechallenges.week6.navigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.avramescu.codechallenges.R;

public class NavigationActivity extends AppCompatActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        initView();
        this.setSupportActionBar(mToolbar);
    }

    private void initView() {
        mToolbar = findViewById(R.id.toolbar);
    }
}
