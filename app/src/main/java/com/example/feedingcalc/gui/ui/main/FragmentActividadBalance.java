package com.example.feedingcalc.gui.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.feedingcalc.databinding.FragmentActividadBalanceBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentActividadBalance extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private FragmentActividadBalanceBinding menu;



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

        menu = FragmentActividadBalanceBinding.inflate(inflater, container, false);
        View root = menu.getRoot();

        final TextView textView = menu.sectionLabel;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        menu = null;
    }
}