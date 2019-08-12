package com.yoda.universitas_swasta;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

//Adapter untuk Reycle view dan wadah untuk pemanggilan dari Main Activity
public class ListUnivAdapter extends  RecyclerView.Adapter<ListUnivAdapter.ListViewHolder>{
    private ArrayList<Univ_Model> listUniv;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListUnivAdapter(ArrayList<Univ_Model> list){
        this.listUniv = list;
    }


    @NonNull
    @Override
    public ListUnivAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout_uni_swas, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Univ_Model univ = listUniv.get(position);
        Glide.with(holder.itemView.getContext())
                .load(univ.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvJudul.setText(univ.getJudul());
        holder.tvDetail.setText(univ.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listUniv.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Univ_Model data);
    }

    @Override
    public int getItemCount() {
        return listUniv.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvJudul, tvDetail;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvJudul = itemView.findViewById(R.id.txt_item_judul);
            tvDetail = itemView.findViewById(R.id.txt_item_detail);
        }
    }
}
