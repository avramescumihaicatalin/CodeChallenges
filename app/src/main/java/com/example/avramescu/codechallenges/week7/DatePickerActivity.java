package com.example.avramescu.codechallenges.week7;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;

import com.example.avramescu.codechallenges.R;

public class DatePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        setDatePicker();
    }

    private void setDatePicker() {
        DialogFragment dialogFragment = new CustomDatePickerDialog();
        dialogFragment.show(getSupportFragmentManager(), "Date picker");
/*        default date is today. You can set which date you want by setting day, month, year variables
        from dialogFragment instance.
        ((CustomDatePickerDialog)dialogFragment).setDay(10);*/
    }
}