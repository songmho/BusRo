package com.busro.busro;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 최정환 on 2016-02-02.
 */
public class RecyclerBoardAdapter extends RecyclerView.Adapter<RecyclerBoardAdapter.ViewHolder> {
    Context context;
    List<Recycler_Boarditem> items;
    int activity_board;
    public RecyclerBoardAdapter(Context applicationContext, List<Recycler_Boarditem> items, int activity_board) {
        this.context=applicationContext;
        this.items=items;
        this.activity_board=activity_board;
    }

    @Override
    public RecyclerBoardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.board_rec_item,null);

        return new ViewHolder(v);
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(RecyclerBoardAdapter.ViewHolder holder, int position) {
        final Recycler_Boarditem item=items.get(position);
        holder.boardtext.setText(""+item.getBoardtext());
        holder.boardtext1.setText(""+item.getBoardtext1());
        holder.boardtext2.setText(""+item.getBoardtext2());
        holder.boardtext3.setText(""+item.getBoardtext3());
        holder.boardtext5.setText(""+item.getBoardtext5());
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView boardtext;
        TextView boardtext1;
        TextView boardtext2;
        TextView boardtext3;
        TextView boardtext5;

        public ViewHolder(View itemview) {
            super(itemview);
            boardtext=(TextView)itemview.findViewById(R.id.boardtext);
            boardtext1=(TextView)itemview.findViewById(R.id.boardtext1);
            boardtext2=(TextView)itemview.findViewById(R.id.boardtext2);
            boardtext3=(TextView)itemview.findViewById(R.id.boardtext3);
            boardtext5=(TextView)itemview.findViewById(R.id.boardtext5);
        }
    }
}
