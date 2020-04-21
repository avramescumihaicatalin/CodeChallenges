package com.example.avramescu.codechallenges.week7;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class CustomDatePickerDialog extends DialogFragment {

    private int day = -1, year = -1, month = -1;

    private Calendar calendar = Calendar.getInstance();

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        if (day != -1 && year != -1 && month != -1) {
            return new DatePickerDialog(getContext(), dateSetListener, year, month, day);
        } else {
            day = calendar.get(Calendar.DAY_OF_MONTH);
            month = calendar.get(Calendar.MONTH);
            year = calendar.get(Calendar.YEAR);
            return new DatePickerDialog(getContext(), dateSetListener, year, month, day);
        }
    }

    private DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            Toast.makeText(getActivity(), "The selected date is " + view.getYear() +
                    " / " + (view.getMonth() + 1) +
                    " / " + view.getDayOfMonth(), Toast.LENGTH_SHORT).show();
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
