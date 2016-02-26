package com.busro.busro;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 은별 on 2016-02-02.
 */
public class TerminalFragment extends android.support.v4.app.Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        LinearLayout linearLayout = (LinearLayout)inflater.inflate(R.layout.item_viewpager,container, false);
        final RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(R.id.recyclerview);
        final Bundle bundle = getArguments();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);


        final List<Terminal_Item> items = new ArrayList<>();

        Log.d("ddd",bundle.getString("location"));
        ParseQuery<ParseObject> query=new ParseQuery<>("terminal");
        query.whereEqualTo("location", bundle.getString("location"));
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                Log.d("dfdf",""+objects.size());
                for(ParseObject o : objects){

                    Terminal_Item item = new Terminal_Item(o.getString("terminal_name"),o.getString("map_url"),o.getString("phone"));
                    items.add(item);
                }
                recyclerView.setAdapter(new TerminalAdapter(getActivity(), items, R.layout.item_terminal));
            }
        });



        return linearLayout;
    }

}
