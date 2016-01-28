package com.busro.busro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by songmho on 2016-01-12.
 */
public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if(getIntent().getAction()=="android.action.depart")
            getSupportActionBar().setTitle("출발지 선택");
        else
            getSupportActionBar().setTitle("도착지 선택");
    }
}
