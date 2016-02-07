package com.busro.busro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by songmho on 2016-01-12.
 */
public class ChooseActivity extends AppCompatActivity implements View.OnClickListener {

    public Button province, city;
    Fragment fragment;
    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if("android.action.depart".equals(getIntent().getAction()))
            getSupportActionBar().setTitle("출발지 선택");
        else
            getSupportActionBar().setTitle("도착지 선택");

        fragment=new ProvinceFragment();
        //번들 추가 필요
        //
        fragmentTransaction.replace(R.id.container,fragment);
        fragmentTransaction.commit();

        province=(Button)findViewById(R.id.province);
        city=(Button)findViewById(R.id.city);

        province.setOnClickListener(this);
        city.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.province:
                city.setVisibility(View.GONE);
                fragment=new ProvinceFragment();
                fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,fragment);
                fragmentTransaction.commit();
                break;
            case R.id.city:
                break;
        }
    }
}
