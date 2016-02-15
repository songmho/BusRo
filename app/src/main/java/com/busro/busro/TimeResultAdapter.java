package com.busro.busro;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by songmyeongho on 2016. 2. 7..
 */
public class TimeResultAdapter extends RecyclerView.Adapter {
    Context context;
    List<TimeResultItem> items;
    int time;

    int HEADER = 0;
    int VIEW = 1;

    public TimeResultAdapter(Context context, List<TimeResultItem> items, int time) {
        this.context=context;
        this.items=items;
        this.time=time;
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0)
            return HEADER;
        else if(position>0)
            return VIEW;
        else
            return -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=null;
        if(viewType==HEADER) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_result_header, parent, false);
            return new ViewHeader(v);
        }
        else if(viewType==VIEW) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_result, parent, false);
            return new ViewHolder(v);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ViewHeader){
            ((ViewHeader) holder).text.setText(String.valueOf(time+":00"));
        }
        else if(holder instanceof ViewHolder){

        }
    }

    @Override
    public int getItemCount() {
        return items.size()+1;
    }

    public class ViewHeader extends RecyclerView.ViewHolder{
        TextView text;
        public ViewHeader(View itemView) {
            super(itemView);
            text=(TextView)itemView.findViewById(R.id.text);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
