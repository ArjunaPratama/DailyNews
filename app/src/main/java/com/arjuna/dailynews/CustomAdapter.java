package com.arjuna.dailynews;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arjuna.dailynews.ResponseServer.DataItem;

import java.util.List;

/**
 * Created by arjuna on 24/08/18.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{
    Context context;
    List<DataItem> data;
    public static final String WebUrl = "http://192.168.20.63/portalberita";
    public CustomAdapter(MainActivity mainActivity, List<DataItem> dataItems) {
        this.context = context;
        this.data = dataItems;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.listku , parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.judul.setText(data.get(position).getJudul());
        holder.tanggal.setText(data.get(position).getTanggal());
//        holder.isiberita.setText(data.get(position).getIsiberita());
        holder.penulis.setText(data.get(position).getPenulis());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name", data.get(position).getJudul());
                intent.putExtra("writer", data.get(position).getPenulis());
                intent.putExtra("news", data.get(position).getIsiberita());
                intent.putExtra("date", data.get(position).getTanggal());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView judul, tanggal, penulis, isiberita;
        public MyViewHolder(View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judulnya);
            tanggal = itemView.findViewById(R.id.tanggalnya);
            penulis = itemView.findViewById(R.id.penulisnya);
        }
    }
}
