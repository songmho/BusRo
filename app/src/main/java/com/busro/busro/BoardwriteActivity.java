package com.busro.busro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;

/**
 * Created by 최정환 on 2016-02-16.
 */
public class BoardwriteActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle saveInstancestate){
        super.onCreate(saveInstancestate);
        setContentView(R.layout.activity_board_write);
        Intent intent=new Intent(this.getIntent());

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("글쓰기");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editText=(EditText)findViewById(R.id.edittext);

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_boardwrite,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.write:
                ParseObject object = new ParseObject("Posting");
                object.put("pub_user", ParseUser.getCurrentUser());
                object.put("pub_username",ParseUser.getCurrentUser().getUsername());
                object.put("contents",editText.getText().toString());
                object.saveInBackground(new SaveCallback() {
                    @Override
                    public void done(ParseException e) {
                        if(e!=null){
                            Toast.makeText(BoardwriteActivity.this, "입력되었습니다.", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                        else{
                            Toast.makeText(BoardwriteActivity.this, "Error : "+e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
