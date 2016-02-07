package com.busro.busro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by songmyeongho on 2016. 2. 7..
 */
public class TimeFragment extends android.support.v4.app.Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View cur_layout=inflater.inflate(R.layout.fragment_time,container,false);
        ViewPager viewPager=(ViewPager)cur_layout.findViewById(R.id.viewpager);
        TabLayout tabLayout=(TabLayout)cur_layout.findViewById(R.id.tablayout);

        viewPager.setAdapter(new Adapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        return cur_layout;
    }

    private class Adapter extends FragmentPagerAdapter {
        public Adapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return new TimeResultFragment();
        }

        @Override
        public int getCount() {
            return 18;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return ""+(position+6);
        }
    }
}
