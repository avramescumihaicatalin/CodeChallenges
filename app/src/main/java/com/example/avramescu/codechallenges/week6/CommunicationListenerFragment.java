package com.example.avramescu.codechallenges.week6;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.avramescu.codechallenges.R;

public class CommunicationListenerFragment extends Fragment {

    FragmentListener mListener;
    Button mButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_dinamically, container, false);
    }

    @Override
    public void onResume() {
        mButton = getView().findViewById(R.id.button_send_data_to_Activity);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onFragmentMethodClicked();
            }
        });
        super.onResume();
    }

    public void setFragmentListener(FragmentListener listener){
        this.mListener = listener;
    }

    public interface FragmentListener{
        void onFragmentMethodClicked();
    }



}