package com.busro.busro;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by songmyeongho on 2016. 2. 7..
 */
public class TimeResultAdapter extends RecyclerView.Adapter<TimeResultAdapter.ViewHolder> {
    Context context;
    List<TimeResultItem> items;
    public TimeResultAdapter(Context context, List<TimeResultItem> items) {
        this.context=context;
        this.items=items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_result,null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
