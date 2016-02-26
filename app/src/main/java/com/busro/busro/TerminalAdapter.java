package com.busro.busro;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 은별 on 2016-02-02.
 */
public class TerminalAdapter extends RecyclerView.Adapter<TerminalAdapter.ViewHolder>{
    Context context;
    List<Terminal_Item> items;
    int item_layout;
    public TerminalAdapter(Context context, List<Terminal_Item> items, int item_layout) {
        this.context = context;
        this.items = items;
        this.item_layout = item_layout;
    }
    @Override
    public TerminalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_terminal, parent,false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(TerminalAdapter.ViewHolder holder, int position) {
        final Terminal_Item item = items.get(position);

        holder.terminal.setText(item.getTerminal());
        holder.map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(item.getUrl()));
                context.startActivity(intent);
            }
        });
        holder.phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+item.getPhone()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView terminal;
        Button phone;
        Button map;

        public ViewHolder(View itemView) {
            super(itemView);
            terminal = (TextView)itemView.findViewById(R.id.terminal);
            phone = (Button)itemView.findViewById(R.id.phone);
            map = (Button)itemView.findViewById(R.id.map);
        }
    }
}
