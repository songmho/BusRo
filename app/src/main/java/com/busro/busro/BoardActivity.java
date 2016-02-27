package com.busro.busro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 최정환 on 2016-01-24.
 */
public class BoardActivity extends AppCompatActivity {

    FloatingActionButton fab;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("게시판");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BoardActivity.this,BoardwriteActivity.class);
                startActivity(intent);
            }
        });

        recyclerView=(RecyclerView)findViewById(R.id.boardrecyclerview);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        final List<Boarditem> items=new ArrayList<>();
        ParseQuery<ParseObject> query=new ParseQuery<>("Posting");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                for(ParseObject o:objects){

                    Boarditem i=new Boarditem(o.getString("contents"),0,0,o.getString("pub_username"),0);
                    items.add(i);
                }

                recyclerView.setAdapter(new BoardAdapter(getApplicationContext(),items,R.layout.activity_board));
            }
        });

    }
}
