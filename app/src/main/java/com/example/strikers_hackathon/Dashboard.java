package com.example.strikers_hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.CheckBox;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Dashboard extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        Viewer Viewer = new Viewer(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        Viewer.addFragment(new MacroEconomicFragment(), "Macroeconomic");
        Viewer.addFragment(new AgricultureFragment(), "Agriculture");
        Viewer.addFragment(new DebtFragment(), "Debt");
        viewPager.setAdapter(Viewer);
    }

    public void graphrender(View view) {
        Intent intent = new Intent(getApplicationContext(), GraphRender.class);
        startActivity(intent);

    }

    public void onCheckboxClicked(View view) {
        boolean validated = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkbox_1:
                if (validated)
                    break;
            case R.id.checkbox_2:
                if (validated)
                    break;
            case R.id.checkbox_3:
                if (validated)
                    break;
            case R.id.checkbox_4:
                if (validated)
                    break;
        }
    }
}
