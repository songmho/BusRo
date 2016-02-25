package com.busro.busro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by 최정환 on 2016-02-16.
 */
public class BoardwriteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstancestate){
        super.onCreate(saveInstancestate);
        setContentView(R.layout.board_write);
        Intent intent=new Intent(this.getIntent());

        final EditText editText=(EditText)findViewById(R.id.edittext);
        editText.getText().toString();

    }

}
