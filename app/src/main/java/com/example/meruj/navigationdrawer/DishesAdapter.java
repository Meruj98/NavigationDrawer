package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DishesAdapter extends RecyclerView.Adapter<DishesAdapter.DishViewHolder> {
    List<Dishes> dishesList;

    public DishesAdapter(List<Dishes> dishesList) {
        this.dishesList = dishesList;
    }

    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dish,parent,false);
        DishViewHolder vh = new DishViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        holder.imageView.setImageResource(dishesList.get(position).getId());
        holder.textViewName.setText(dishesList.get(position).getName());
        holder.textViewPrice.setText(dishesList.get(position).getPrice());
    }


    @Override
    public int getItemCount() {
        return dishesList.size();
    }
    public class DishViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewName;
        TextView textViewPrice;
        public DishViewHolder(final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageDish);
            textViewName = itemView.findViewById(R.id.dishName);
            textViewPrice = itemView.findViewById(R.id.dishPrice);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView.buildDrawingCache();
                    Bitmap image  = imageView.getDrawingCache();
                    Intent intent = new Intent(itemView.getContext(),SingleItemActivity.class);
                    intent.putExtra("1",imageView.getId());
                    intent.putExtra("2",textViewName.getText().toString());
                    intent.putExtra("3",textViewPrice.getText().toString());
                    Bundle extras = new Bundle();
                    extras.putParcelable("imagebitmap", image);
                    intent.putExtras(extras);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
