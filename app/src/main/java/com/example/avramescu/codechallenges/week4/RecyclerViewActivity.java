package com.example.avramescu.codechallenges.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.avramescu.codechallenges.R;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewStudents;
    private ArrayList<Student> mStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initView();
        setLayoutManager();
        setStudents();
        setAdapter();
    }

    private void setAdapter() {
        StudentAdapter studentAdapter = new StudentAdapter(mStudents);
        mRecyclerViewStudents.setAdapter(studentAdapter);
    }

    private void setStudents() {
        mStudents = new ArrayList<>();
        mStudents.add(new Student("FirstName1", "LastName1"));
        mStudents.add(new Student("FirstName2", "LastName2"));
        mStudents.add(new Student("FirstName3", "LastName3"));
        mStudents.add(new Student("FirstName4", "LastName4"));
        mStudents.add(new Student("FirstName5", "LastName5"));
        mStudents.add(new Student("FirstName6", "LastName6"));
        mStudents.add(new Student("FirstName7", "LastName7"));
        mStudents.add(new Student("FirstName8", "LastName8"));
        mStudents.add(new Student("FirstName9", "LastName9"));
        mStudents.add(new Student("FirstName10", "LastName10"));

    }

    private void setLayoutManager() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewStudents.setLayoutManager(layoutManager);
    }

    private void initView() {
        mRecyclerViewStudents = findViewById(R.id.recycler_view_students);
    }
}

/*
* Pasi de efectuat:
 *   1) Data Model
 *   2) Create Layout item( cum sa arate item-ul meu atat in java cat si in xml)
 *   3) Extindem clasa ViewHolder
 *   4) Facem Adapter
 *   5) Adaugare dependinte si adaugam view in activitate
 *   6) Set LayoutManager - ii spunem cum sa se aseze.
 *   7) Set Adapter
*
* */