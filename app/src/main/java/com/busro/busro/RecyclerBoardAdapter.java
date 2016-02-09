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
        holder.boardthumbsuptext.setText(""+item.getBoardthumbsuptext());
        holder.boardchattext.setText(""+item.getBoardchattext());
        holder.boardnickname.setText(""+item.getBoardnickname());
        holder.boardhitstext.setText(""+item.getBoardhitstext());
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView boardtext;
        TextView boardthumbsuptext;
        TextView boardchattext;
        TextView boardnickname;
        TextView boardhitstext;

        public ViewHolder(View itemview) {
            super(itemview);
            boardtext=(TextView)itemview.findViewById(R.id.boardtext);
            boardthumbsuptext=(TextView)itemview.findViewById(R.id.boardthumbsuptext);
            boardchattext=(TextView)itemview.findViewById(R.id.boardchattext);
            boardnickname=(TextView)itemview.findViewById(R.id.boardnickname);
            boardhitstext=(TextView)itemview.findViewById(R.id.boardhitstext);
        }
    }
}
