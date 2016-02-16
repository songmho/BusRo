package com.busro.busro;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by 은별 on 2016-01-21.
 */
public class TerminalActivity extends AppCompatActivity{
    int MAX_PAGE = 9;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminal);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("터미널안내");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);
        viewPager.setAdapter(new adapter(getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
    private class adapter extends FragmentPagerAdapter {
        public adapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Bundle bundle= new Bundle();

            if (position < 0 || MAX_PAGE <= position)
                return null;
            switch (position) {
                case 0:
                    cur_fragment = new page_1();
                    bundle.putString("location", "서울");
                    cur_fragment.setArguments(bundle);
                    return cur_fragment;
                case 1:
                    cur_fragment = new page_1();
                    break;
                case 2:
                    cur_fragment = new page_1();
                    break;
                case 3 :
                    cur_fragment = new page_1();
                    break;
                case 4 :
                    cur_fragment = new page_1();
                    break;
                case 5 :
                    cur_fragment = new page_1();
                    break;
                case 6 :
                    cur_fragment = new page_1();
                    break;
                case 7 :
                    cur_fragment = new page_1();
                    break;
                case 8 :
                    cur_fragment = new page_1();
                    break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch(position){
                case 0:
                    return "서울";
                case 1:
                    return "경기도";
                case 2:
                    return "강원도";
                case 3:
                    return "경상남도";
                case 4:
                    return "경상북도";
                case 5:
                    return "충청남도";
                case 6:
                    return "충청북도";
                case 7:
                    return "전라남도";
                case 8:
                    return "전라북도";
            }
            return super.getPageTitle(position);
        }
    }
}
