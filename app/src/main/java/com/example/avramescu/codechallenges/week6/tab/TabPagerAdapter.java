package com.example.avramescu.codechallenges.week6.tab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    TabPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putInt(ObjectFragment.ARG_OBJECT, i+1);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public int getCount() {
        return 100;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Object" + (position + 1);
    }
}
