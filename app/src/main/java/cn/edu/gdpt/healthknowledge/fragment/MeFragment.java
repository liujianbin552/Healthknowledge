package cn.edu.gdpt.healthknowledge.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import cn.edu.gdpt.healthknowledge.LoginActivity;
import cn.edu.gdpt.healthknowledge.R;
import cn.edu.gdpt.healthknowledge.RegisterActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {
    private View view;

    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_me, container, false);

       return view;

    }
}