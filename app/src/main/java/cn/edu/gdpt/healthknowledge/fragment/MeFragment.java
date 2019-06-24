package cn.edu.gdpt.healthknowledge.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import cn.edu.gdpt.healthknowledge.LoginActivity;
import cn.edu.gdpt.healthknowledge.R;
import cn.edu.gdpt.healthknowledge.RegisterActivity;
import cn.edu.gdpt.healthknowledge.activity.PhotoActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {
    private View view;
    private ImageButton yonghu;
    private Button btn_xiangce;
    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_me, container, false);
        yonghu=(ImageButton)view.findViewById(R.id.yonghu);
        yonghu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(getActivity(),LoginActivity.class);
                startActivity(intent);
            }
        });
        btn_xiangce=(Button)view.findViewById(R.id.btn_xiangce);
        btn_xiangce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(getActivity(), PhotoActivity.class);
                startActivity(intent);
            }
        });
       return view;


    }
}