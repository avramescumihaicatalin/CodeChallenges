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

public class CommunicationBundleFragment extends Fragment {

    TextView textView;
    String value;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dinamically, container, false );

        value = this.getArguments().getString("message");

        return view;

    }

    @Override
    public void onResume() {
        textView = getView().findViewById(R.id.text_view_fragment);

        Bundle bundle = this.getArguments();
        if(textView != null && bundle != null){
            textView.setText(bundle.getString("message"));
        }

        super.onResume();
    }
}
