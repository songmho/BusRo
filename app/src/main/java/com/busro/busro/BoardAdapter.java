package com.busro.busro;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 최정환 on 2016-02-02.
 */
public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.ViewHolder> {
    Context context;
    List<BoardItem> items;
    int activity_board;
    public BoardAdapter(Context applicationContext, List<BoardItem> items, int activity_board) {
        this.context=applicationContext;
        this.items=items;
        this.activity_board=activity_board;
    }

    @Override
    public BoardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_board_rec,null);

        return new ViewHolder(v);
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(BoardAdapter.ViewHolder holder, int position) {
        final BoardItem item=items.get(position);
        holder.contents.setText(""+item.getBoardtext());
        holder.thumbsUpCount.setText(""+item.getBoardthumbsuptext());
        holder.chatCount.setText(""+item.getBoardchattext());
        holder.pub_name.setText(""+item.getBoardnickname());
        holder.hitsText.setText(""+item.getBoardhitstext());
        holder.thumbsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView contents;
        TextView thumbsUpCount;
        TextView chatCount;
        TextView pub_name;
        TextView hitsText;
        Button thumbsUp;

        public ViewHolder(View itemview) {
            super(itemview);
            contents =(TextView)itemview.findViewById(R.id.boardtext);
            thumbsUpCount =(TextView)itemview.findViewById(R.id.boardthumbsuptext);
            chatCount =(TextView)itemview.findViewById(R.id.boardchattext);
            pub_name =(TextView)itemview.findViewById(R.id.boardnickname);
            hitsText =(TextView)itemview.findViewById(R.id.boardhitstext);
            thumbsUp=(Button)itemview.findViewById(R.id.boardthumbsup);
        }
    }
}
