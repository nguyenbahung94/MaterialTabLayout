package com.example.android.materialtablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    Toolbar mToolBar;
    TabLayout mTabLayout;
    ViewPager mViewPager;
    ViewPagerAdapter mViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolBar=(Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(mToolBar);
        mTabLayout= (TabLayout) findViewById(R.id.tablayout);
        mViewPager=(ViewPager)findViewById(R.id.viewpager);
        mViewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        mViewPagerAdapter.addFragment(new HomeFragment(),"Home");
        mViewPagerAdapter.addFragment(new TopFree(),"TopFree");
        mViewPagerAdapter.addFragment(new TopPaid(),"Toppad");
        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
