package com.example.android.materialtablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by everything on 4/8/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment>mFragments=new ArrayList<>();
    ArrayList<String>tabtitle=new ArrayList<>();
    public void addFragment(Fragment fragments,String tabtitle){
        this.mFragments.add(fragments);
        this.tabtitle.add(tabtitle);
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle.get(position);
    }
}
