package com.busro.busro;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 은별 on 2016-02-02.
 */
public class page_1 extends android.support.v4.app.Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        LinearLayout linearLayout = (LinearLayout)inflater.inflate(R.layout.item_viewpager,container, false);
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(R.id.recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        List<Recycler_item> items = new ArrayList<>();
        Recycler_item item = new Recycler_item("test");
        items.add(item);
        recyclerView.setAdapter(new RecyclerAdapter(getActivity(),items,R.layout.item_recyclerview));

        return linearLayout;
    }

}
