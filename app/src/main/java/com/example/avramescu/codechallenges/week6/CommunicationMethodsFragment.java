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

public class CommunicationMethodsFragment extends Fragment {

    TextView mTextView;
    Button mButtonSendDataToActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_dinamically, container, false);
    }

    @Override
    public void onResume() {
        mTextView = getView().findViewById(R.id.text_view_fragment);
        mButtonSendDataToActivity = getView().findViewById(R.id.button_send_data_to_Activity);
        mButtonSendDataToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToActivity();
            }
        });
        super.onResume();
    }

    private void sendDataToActivity() {
        String data = "data from fragment";
        CommunicationMethodsActivity activity = (CommunicationMethodsActivity)getActivity();
        activity.receiveDataFromFragment(data);
    }

    public void receiveDataFromActivity(String data){
        mTextView.setText(data);
    }
}
