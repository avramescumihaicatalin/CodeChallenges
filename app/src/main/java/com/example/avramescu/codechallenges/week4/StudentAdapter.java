package com.example.avramescu.codechallenges.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avramescu.codechallenges.R;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    List<Student> mStudent;

    public StudentAdapter(List<Student> mStudent) {
        this.mStudent = mStudent;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.student_item, viewGroup, false);

        return new StudentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
        Student currentStudent = mStudent.get(i);
        if(currentStudent != null){
            if(currentStudent.getmFirstName() != null){
                studentViewHolder.getmTextViewFirstName().setText(currentStudent.getmFirstName());
            }

            if(currentStudent.getmLastName() != null){
                studentViewHolder.getmTextViewLastName().setText(currentStudent.getmLastName());
            }
        }
    }

    @Override
    public int getItemCount() {
        return mStudent.size();
    }
}
