package com.example.avramescu.codechallenges.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private LinearLayout mLinearLayoutContainer;
    private TextView mTextViewFirstName;
    private TextView mTextViewLastName;

    StudentViewHolder(@NonNull View itemView) {
        super(itemView);

        mTextViewFirstName = itemView.findViewById(R.id.text_view_first_name);
        mTextViewLastName = itemView.findViewById(R.id.text_view_last_name);
        mLinearLayoutContainer = itemView.findViewById(R.id.container);

    }

    TextView getmTextViewFirstName() {
        return mTextViewFirstName;
    }

    public void setmTextViewFirstName(TextView mTextViewFirstName) {
        this.mTextViewFirstName = mTextViewFirstName;
    }

    TextView getmTextViewLastName() {
        return mTextViewLastName;
    }

    public void setmTextViewLastName(TextView mTextViewLastName) {
        this.mTextViewLastName = mTextViewLastName;
    }

    LinearLayout getmLinearLayoutContainer() {
        return mLinearLayoutContainer;
    }

    private void setmLinearLayoutContainer(LinearLayout linearLayoutContainer) {
        this.mLinearLayoutContainer = linearLayoutContainer;
    }
}
