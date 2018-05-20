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
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    List<Restaurant> list;

    public RestaurantAdapter(List<Restaurant> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant,parent,false);
        RestaurantViewHolder vh = new RestaurantViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).id);
        holder.textAdress.setText(list.get(position).adress);
        holder.textKm.setText(list.get(position).km);
        holder.textNum.setText(list.get(position).num);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
    public class RestaurantViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView ;
        TextView textAdress;
        TextView textKm;
        TextView textNum;
        public RestaurantViewHolder(final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageRestaurant);
            textAdress = itemView.findViewById(R.id.textAdress);
            textKm = itemView.findViewById(R.id.textKm);
            textNum = itemView.findViewById(R.id.restaurantNumber);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView.buildDrawingCache();
                    Intent intent = new Intent(itemView.getContext(),SingleRestaurantItemActivity.class);
                    intent.putExtra("2",textAdress.getText().toString());
                    intent.putExtra("4",textNum.getText().toString());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
