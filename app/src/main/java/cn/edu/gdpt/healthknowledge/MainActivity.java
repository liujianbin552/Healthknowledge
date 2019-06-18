package cn.edu.gdpt.healthknowledge;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> fragmentList;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout)findViewById(R.id.tab1);
        tabLayout.addTab(tabLayout.newTab().setText("健康食品").setIcon(R.drawable.menu_shiwu));
        tabLayout.addTab(tabLayout.newTab().setText("健康知识").setIcon(R.drawable.menu_knowledge));
        tabLayout.addTab(tabLayout.newTab().setText("我").setIcon(R.drawable.menu_yonghu));
    }
}
