package com.busro.busro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/**
 * Created by songmho on 2016-01-12.
 */
public class Dep_arr_Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView depart;
    private TextView arrive;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep_arr);


        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("노선조회");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        depart=(TextView)findViewById(R.id.depart);
        arrive=(TextView)findViewById(R.id.arrive);

        depart.setOnClickListener(this);
        arrive.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Dep_arr_Activity.this,ChooseActivity.class);
        switch (v.getId()){
            case R.id.depart:
               intent.setAction("android.action.depart");
                break;
            case R.id.arrive:
                intent.setAction("android.action.arrive");
                break;
        }
        startActivity(intent);
    }
}
