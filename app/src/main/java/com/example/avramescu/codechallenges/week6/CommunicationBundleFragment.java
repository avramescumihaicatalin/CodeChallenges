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
import android.widget.Toast;

import com.example.avramescu.codechallenges.R;

public class CommunicationBundleFragment extends Fragment {

    public static final String FRAGMENTACTIVITYKEY = "FRAGMENTACTIVITYKEY";

    TextView mTextView;
    Button mButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_dinamically, container, false );
    }

    @Override
    public void onResume() {
        Toast.makeText(getActivity(), "onResumeFragment", Toast.LENGTH_SHORT).show();
        mTextView = getView().findViewById(R.id.text_view_fragment);
        mButton = getView().findViewById(R.id.button_send_data_to_Activity);

        Bundle bundle = this.getArguments();
        if(mTextView != null && bundle != null){
            mTextView.setText(bundle.getString(CommunicationBundleActivity.SEND_MESSAGE_TO_FRAGMENT_KEY));
        }

        super.onResume();
    }
}
