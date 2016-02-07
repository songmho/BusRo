package com.busro.busro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by songmho on 16. 2. 2.
 */
public class Result_Activity extends AppCompatActivity {

    static int MAX_PAGE = 2;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager=(ViewPager)findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);

        viewPager.setAdapter(new adapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }

    private class adapter extends FragmentPagerAdapter {
        public adapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    cur_fragment=new TimeFragment();
                    break;
                case 1:
                    cur_fragment=new TimeFragment();
                    break;
                default:
                    return null;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "소요시간순";
                case 1:
                    return "버스요금순";
            }
            return super.getPageTitle(position);
        }
    }
}
