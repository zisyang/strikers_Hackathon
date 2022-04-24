package com.example.strikers_hackathon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class Viewer extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragList = new ArrayList<>();
    private final ArrayList<String> fragTitle = new ArrayList<>();

    public Viewer(@NonNull FragmentManager fm, int action) {
        super(fm, action);
    }

    @NonNull
    @Override
    public Fragment getItem(int pos) {
        return fragList.get(pos);
    }

    @Override
    public int getCount() {
        return fragList.size();
    }

    public void addFragment(Fragment frag, String title){
        fragList.add(frag);
        fragTitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int pos) {
        return fragTitle.get(pos);
    }
}
