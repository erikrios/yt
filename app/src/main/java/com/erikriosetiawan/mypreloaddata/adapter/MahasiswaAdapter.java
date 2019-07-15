package com.erikriosetiawan.mypreloaddata.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.erikriosetiawan.mypreloaddata.R;
import com.erikriosetiawan.mypreloaddata.model.MahasiswaModel;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaHolder> {

    private ArrayList<MahasiswaModel> listMahasiswa = new ArrayList<>();

    public MahasiswaAdapter() {

    }

    public void setData(ArrayList<MahasiswaModel> listMahasiswa) {
        if (listMahasiswa.size() > 0) {
            this.listMahasiswa.clear();
        }
        this.listMahasiswa.addAll(listMahasiswa);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MahasiswaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mahasiswa_row, viewGroup, false);
        return new MahasiswaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaHolder mahasiswaHolder, int i) {
        mahasiswaHolder.textViewNim.setText(listMahasiswa.get(i).getNim());
        mahasiswaHolder.textViewNama.setText(listMahasiswa.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return listMahasiswa.size();
    }

    class MahasiswaHolder extends RecyclerView.ViewHolder {

        private TextView textViewNim;
        private TextView textViewNama;

        MahasiswaHolder(@NonNull View itemView) {

            super(itemView);
            textViewNim = itemView.findViewById(R.id.tv_nim);
            textViewNama = itemView.findViewById(R.id.tv_nama);
        }
    }
}
