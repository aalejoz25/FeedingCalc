package com.example.feedingcalc.gui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.feedingcalc.databinding.ActivityActividadMenuBinding;
import com.example.feedingcalc.gui.ui.main.SectionsPagerAdapter;

public class ActividadMenu extends AppCompatActivity {

    private ActivityActividadMenuBinding menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        menu = ActivityActividadMenuBinding.inflate(getLayoutInflater());
        setContentView(menu.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = menu.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = menu.tabs;
        tabs.setupWithViewPager(viewPager);

    }


}