package com.example.avramescu.codechallenges.week6;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;

public class CommunicationBundleFragment extends Fragment {

    public static final String FRAGMENTACTIVITYKEY = "FRAGMENTACTIVITYKEY";

    TextView mTextView;
    Button mButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dinamically, container, false );

        return view;

    }

    @Override
    public void onResume() {
        mTextView = getView().findViewById(R.id.text_view_fragment);
        mButton = getView().findViewById(R.id.button_send_data_to_Activity);

        Bundle bundle = this.getArguments();
        if(mTextView != null && bundle != null){
            mTextView.setText(bundle.getString(CommunicationBundleActivity.SENDMESSAGETOFRAGMENTKEY));
        }

        //////////////TODO Don't know if it works to send data from fragment to activity with bundle.
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(FRAGMENTACTIVITYKEY,"text from Fragment");
                setArguments(bundle);
            }
        });

        super.onResume();
    }
}
