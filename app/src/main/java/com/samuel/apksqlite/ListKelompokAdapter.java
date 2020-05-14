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

public class ListKelompokAdapter extends RecyclerView.Adapter<ListKelompokAdapter.ListViewHolder> {
    Context getContext;
    ArrayList<Kelompok> kelompoks;

    public ListKelompokAdapter(Context getContext, ArrayList<Kelompok> kelompoks) {
        this.getContext =getContext;
        this.kelompoks = kelompoks;
    }

    @NonNull
    @Override
    public ListKelompokAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(getContext).inflate(R.layout.about_grup_list, viewGroup, false);
        ListKelompokAdapter.ListViewHolder newHolder = new ListKelompokAdapter.ListViewHolder(view);
        return newHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListKelompokAdapter.ListViewHolder holder, int position) {
        holder.tvNama.setText(kelompoks.get(position).getNama());
        holder.tvStambuk.setText(kelompoks.get(position).getStambuk());
        holder.tvEmail.setText(kelompoks.get(position).getEmail());
        holder.imgFoto.setImageResource(kelompoks.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return kelompoks.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto;
        private TextView tvNama;
        private TextView tvEmail;
        private TextView tvStambuk;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
            tvNama = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvStambuk = (TextView) itemView.findViewById(R.id.tv_item_Stambuk);
            tvEmail = (TextView) itemView.findViewById(R.id.tv_item_Email);
        }
    }
}
