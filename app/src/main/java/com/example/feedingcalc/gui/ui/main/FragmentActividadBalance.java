package com.example.feedingcalc.gui.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.feedingcalc.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentActividadBalance extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";





    public static FragmentActividadBalance newInstance(int index) {
        FragmentActividadBalance fragment = new FragmentActividadBalance();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_actividad_balance, container, false);
    }


}