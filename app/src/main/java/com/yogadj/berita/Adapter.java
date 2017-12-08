package com.yogadj.berita;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Asus on 12/8/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.NewsHolder>{

    Context context;
    List<pojo> item;

    public Adapter(Context context, List<pojo> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_item, null);
        return new NewsHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, final int position) {



        holder.imageView.setImageResource(item.get(position).getImage());
        holder.txt_judul.setText(item.get(position).getTitle());
        holder.txt_deskripsi.setText(item.get(position).getDescription());
        holder.txt_isi.setText(item.get(position).getIsi());

        holder.listnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ActivityDetail.class);

                i.putExtra("id_image", item.get(position).getImage());
                i.putExtra("id_judul", item.get(position).getTitle());
                i.putExtra("id_deskripsi", item.get(position).getDescription());
                i.putExtra("id_isi", item.get(position).getIsi());

                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class NewsHolder extends RecyclerView.ViewHolder {

        LinearLayout listnews;
        ImageView imageView;
        TextView txt_judul,txt_deskripsi, txt_isi;


        public NewsHolder(View itemView) {
            super(itemView);
            listnews = (LinearLayout) itemView.findViewById(R.id.listnews);
            imageView = (ImageView) itemView.findViewById(R.id.item_image);
            txt_judul = (TextView) itemView.findViewById(R.id.item_title);
            txt_deskripsi = (TextView) itemView.findViewById(R.id.item_description);
            txt_isi = (TextView) itemView.findViewById(R.id.item_isi);

        }
    }
}
