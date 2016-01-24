package com.busro.busro;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private LinearLayout[] box=new LinearLayout[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0x00ffffff));
        getSupportActionBar().setTitle("");


        box[0]=(LinearLayout)findViewById(R.id.box1);
        box[1]=(LinearLayout)findViewById(R.id.box2);
        box[2]=(LinearLayout)findViewById(R.id.box3);
        box[3]=(LinearLayout)findViewById(R.id.box4);

        for(LinearLayout ll: box)
            ll.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.box1:
                startActivity(new Intent(MainActivity.this,Dep_arr_Activity.class));
                break;
            case R.id.box2:
                startActivity(new Intent(MainActivity.this,BoardActivity.class));
                break;
            case R.id.box3:
                Toast.makeText(MainActivity.this, "진행중", Toast.LENGTH_SHORT).show();
                break;
            case R.id.box4:
                Toast.makeText(MainActivity.this, "진행중", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
