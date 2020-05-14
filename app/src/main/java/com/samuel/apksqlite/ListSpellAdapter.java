package com.samuel.apksqlite;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListSpellAdapter extends RecyclerView.Adapter<ListSpellAdapter.ListViewHolder> {
    Context getContext;
    ArrayList<Spell> dSpells;

    public ListSpellAdapter(Context getContext, ArrayList<Spell> dSpells) {
        this.getContext =getContext;
        this.dSpells = dSpells;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(getContext).inflate(R.layout.item_row_spell, viewGroup, false);
        ListViewHolder newHolder = new ListViewHolder(view);
        return newHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.tvNama.setText(dSpells.get(position).getNama());
        holder.tvDetail.setText(dSpells.get(position).getDetail());
        holder.imgFoto.setImageResource(dSpells.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return dSpells.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto;
        private TextView tvNama;
        private TextView tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
            tvNama = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvDetail = (TextView) itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
