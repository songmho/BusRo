package com.busro.busro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 최정환 on 2016-02-16.
 */
public class BoardwriteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstancestate){
        super.onCreate(saveInstancestate);
        setContentView(R.layout.board_write);
        Intent intent=new Intent(this.getIntent());
    }
}
