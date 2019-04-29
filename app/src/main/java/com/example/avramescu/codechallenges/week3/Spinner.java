package com.example.avramescu.codechallenges.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.example.avramescu.codechallenges.R;

import java.util.ArrayList;

public class Spinner extends AppCompatActivity {

    private android.widget.Spinner mSpinner;
    ArrayList<String> mCandy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        initView();//initializare view
        setData();// setare sursa de date
        setAdapter();

    }

    private void setAdapter() {
        mSpinner.setAdapter(new ArrayAdapter<String>(Spinner.this, android.R.layout.simple_list_item_1, mCandy));
    }

    private void setData() {
        mCandy = new ArrayList<>();
        mCandy.add("Cupcake");
        mCandy.add("Donut");
        mCandy.add("Eclair");
        mCandy.add("Kitkat");
        mCandy.add("Pie");
    }

    private void initView() {
        mSpinner = findViewById(R.id.spinner_candy);
    }
}
