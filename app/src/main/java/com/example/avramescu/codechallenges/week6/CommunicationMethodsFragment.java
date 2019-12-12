package com.example.avramescu.codechallenges.week6;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;

public class CommunicationMethodsFragment extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_dinamically, container, false);
    }

    @Override
    public void onResume() {
        textView  = getView().findViewById(R.id.text_view_fragment);
        super.onResume();
    }

    public void receiveDataFromActivity(String data){
        textView.setText(data);
    }
}
