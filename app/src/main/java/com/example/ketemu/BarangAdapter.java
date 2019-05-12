package com.example.ketemu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.BarangViewHolder> {

    private Context mCtx;
    private List<Barang> barangList;

    public BarangAdapter(Context mCtx, List<Barang> barangList) {
        this.mCtx = mCtx;
        this.barangList = barangList;
    }

    @NonNull
    @Override
    public BarangViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(R.layout.barang_layout,null);
        return new BarangViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BarangViewHolder barangViewHolder, int i) {
        Barang barang = barangList.get(i);
        barangViewHolder.judulBarang.setText(barang.getJudul());
        barangViewHolder.namaPenemu.setText(barang.getNamaPenemu());
        barangViewHolder.lokasi.setText(barang.getLokasi());
        barangViewHolder.gambarBarang.setImageDrawable(mCtx.getResources().getDrawable(barang.getGambarBarang()));

    }

    @Override
    public int getItemCount() {

        return barangList.size();
    }

    class BarangViewHolder extends RecyclerView.ViewHolder{

        ImageView gambarBarang;
        TextView namaPenemu, lokasi, judulBarang;

        public BarangViewHolder(@NonNull View itemView) {

            super(itemView);

            gambarBarang = itemView.findViewById(R.id.gambar_barang);
            namaPenemu = itemView.findViewById(R.id.penemu_barang);
            lokasi = itemView.findViewById(R.id.lokasi_barang);
            judulBarang = itemView.findViewById(R.id.judul_barang);

        }
    }
}
