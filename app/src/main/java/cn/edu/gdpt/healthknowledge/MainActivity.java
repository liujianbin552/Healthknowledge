package cn.edu.gdpt.healthknowledge;

import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdpt.healthknowledge.adapter.MyFragmentPagerAdapter;
import cn.edu.gdpt.healthknowledge.fragment.FoodFragment;
import cn.edu.gdpt.healthknowledge.fragment.KnowledgeFragment;
import cn.edu.gdpt.healthknowledge.fragment.MeFragment;

public class MainActivity extends AppCompatActivity {
    List<Fragment> fragmentList;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();



    }
    private void initView(){
        tabLayout=(TabLayout)findViewById(R.id.tab1);
        tabLayout.addTab(tabLayout.newTab().setText("健康食品").setIcon(R.drawable.menu_shiwu));
        tabLayout.addTab(tabLayout.newTab().setText("健康知识").setIcon(R.drawable.menu_knowledge));
        tabLayout.addTab(tabLayout.newTab().setText("我").setIcon(R.drawable.menu_yonghu));

        fragmentList=new ArrayList<>();
        fragmentList.add(new FoodFragment() );
        fragmentList.add(new KnowledgeFragment());
        fragmentList.add(new MeFragment());

        ViewPager viewPager=(ViewPager)findViewById(R.id.vp);
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(),fragmentList));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float v, int i1) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tab1);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        tabLayout.setupWithViewPager(viewPager);
        Drawable d=null;
        for (int i=0;i<tabLayout.getTabCount();i++){
            TabLayout.Tab tab=tabLayout.getTabAt(i);
            switch (i){
                case 0:
                    d=getResources().getDrawable(R.drawable.health);
                    break;
                case 1:
                    d=getResources().getDrawable(R.drawable.shiwu);
                    break;
                case 2:
                    d=getResources().getDrawable(R.drawable.yonghu);
                    break;
            }
            tab.setIcon(d);
        }
    }
}
