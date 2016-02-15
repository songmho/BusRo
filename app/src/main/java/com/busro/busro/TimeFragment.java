package com.busro.busro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
        viewPager.setCurrentItem(getCurrentHour()-6);                   //현재 시간에 맞는 페이지로 이동하게 만듬
        tabLayout.setupWithViewPager(viewPager);

        return cur_layout;
    }

    private class Adapter extends FragmentPagerAdapter {
        public Adapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment cur_fragment = new TimeResultFragment();
            Bundle bundle = new Bundle();                       //시간 전달할 Bundle
            bundle.putInt("time",(position+6));                 //현재 페이지에서 +6을 해야 시간으로 바뀜
            cur_fragment.setArguments(bundle);

            return  cur_fragment;
        }

        @Override
        public int getCount() {
            return 18;
        }                   //시간은 6시부터 23시까지 18개

        @Override
        public CharSequence getPageTitle(int position) {
            return ""+(position+6);
        }
    }

    private int getCurrentHour() {
        Date date =new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        return c.get(Calendar.HOUR_OF_DAY);
    }

}
