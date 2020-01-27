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

public class CommunicationListenerFragment extends Fragment implements ActivityListener{

    FragmentListener mListener;
    Button mButton;
    TextView mTextViewFragment;

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
        mTextViewFragment = getView().findViewById(R.id.text_view_fragment);
        super.onResume();
    }

    public void setFragmentListener(FragmentListener listener){
        this.mListener = listener;
    }

    @Override
    public void onActivityMethodClicked(String data) {
        mTextViewFragment.setText("received from activity:" + data);
    }

    public interface FragmentListener{
        void onFragmentMethodClicked();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        CommunicationListenerActivity activity = (CommunicationListenerActivity) getActivity();
        activity.setActivityListener(this);
    }
}