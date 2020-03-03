package com.example.avramescu.codechallenges.week6.tab;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avramescu.codechallenges.R;

public class TabFragment extends Fragment {

    TabPagerAdapter tabPagerAdapter;
    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        tabPagerAdapter = new TabPagerAdapter(getChildFragmentManager());
        viewPager = view.findViewById(R.id.view_pager);
        viewPager.setAdapter(tabPagerAdapter);
    }
}
