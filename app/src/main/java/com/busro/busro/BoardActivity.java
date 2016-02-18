package com.busro.busro;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 최정환 on 2016-01-24.
 */
public class BoardActivity extends AppCompatActivity {

    FloatingActionButton fab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("게시판");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BoardActivity.this,BoardwriteActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.boardrecyclerview);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<Recycler_Boarditem> items=new ArrayList<>();
        Recycler_Boarditem[] item=new Recycler_Boarditem[12];
        for(int i=0;i<12;i++) {
            item[i] = new Recycler_Boarditem("0", R.drawable.thumbsup, 0, R.drawable.chat, 0, "0", "ㅣ 조회 ", 0);
            items.add(item[i]);
        }

        recyclerView.setAdapter(new RecyclerBoardAdapter(getApplicationContext(),items,R.layout.activity_board));
    }
}
