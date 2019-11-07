package com.example.avramescu.codechallenges.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.avramescu.codechallenges.R;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private android.widget.Spinner mSpinner;
    ArrayList<String> mCandy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        initView();//initializare view
        setData();// setare sursa de date
        setAdapter();

        mSpinner.setOnItemSelectedListener(this);

    }

    private void setAdapter() {
        mSpinner.setAdapter(new ArrayAdapter<>(SpinnerActivity.this, android.R.layout.simple_list_item_1, mCandy));
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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Selected: " + mSpinner.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
