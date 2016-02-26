package com.busro.busro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songmyeongho on 2016. 2. 7..
 */
public class TimeResultFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View cur_layout=inflater.inflate(R.layout.item_viewpager,container,false);
        RecyclerView recyclerView=(RecyclerView)cur_layout.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        Bundle bundle = getArguments();

        List<TimeResultItem> items=new ArrayList<>();
        for(int i=0;i<4;i++){
        TimeResultItem item=new TimeResultItem();
        items.add(item);}

        Log.d("ddd",""+bundle.getInt("time",-1));
        recyclerView.setAdapter(new TimeResultAdapter(getActivity(),items,bundle.getInt("time",0)));

        return cur_layout;
    }
}
