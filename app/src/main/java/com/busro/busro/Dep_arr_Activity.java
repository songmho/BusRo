package com.busro.busro;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by songmho on 2016-01-12.
 */
public class Dep_arr_Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView depart, arrive, date;
    private Button change,today, tomorrow,search;

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
        change=(Button)findViewById(R.id.change);
        date=(TextView)findViewById(R.id.date);
        today=(Button)findViewById(R.id.today);
        tomorrow=(Button)findViewById(R.id.tomorrow);
        search=(Button)findViewById(R.id.search);

        depart.setOnClickListener(this);
        arrive.setOnClickListener(this);
        change.setOnClickListener(this);
        date.setOnClickListener(this);
        today.setOnClickListener(this);
        tomorrow.setOnClickListener(this);
        search.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Dep_arr_Activity.this,ChooseActivity.class);
        switch (v.getId()){
            case R.id.depart:
               intent.setAction("android.action.depart");
                startActivity(intent);
                break;
            case R.id.arrive:
                intent.setAction("android.action.arrive");
                startActivity(intent);
                break;
            case R.id.change:
                break;
            case R.id.date:

                Dialog dialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        int mon=monthOfYear+1;
                        String mon_s;
                        if(0<mon && mon<10)
                            mon_s="0"+mon;
                        else
                            mon_s=""+mon;
                        date.setText(""+year+"년 "+mon_s+"월 "+dayOfMonth+"일");
                    }
                },Calendar.getInstance().get(Calendar.YEAR),Calendar.getInstance().get(Calendar.MONTH),Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
                dialog.show();
                break;
            case R.id.today:
                Date d=new Date();
                SimpleDateFormat format=new SimpleDateFormat("yyyy년 MM월 dd일");
                date.setText(""+format.format(d));
                break;
            case R.id.tomorrow:
                break;
            case R.id.search:
                Intent intent_result=new Intent(Dep_arr_Activity.this,Result_Activity.class);
                intent_result.putExtra("depart","서울");
                intent_result.putExtra("arrive","원주");
                startActivity(intent_result);
                break;
        }
    }
}
