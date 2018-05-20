package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksAdapter.DrinkViewHolder> {

    List<Drinks> list;

    public DrinksAdapter(List<Drinks> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public DrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_drinks,parent,false);
        DrinkViewHolder vh = new DrinkViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getId());
        holder.textViewName.setText(list.get(position).getName());
        holder.textViewPrice.setText(list.get(position).getPrice());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
    public class DrinkViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView ;
        TextView textViewName;
        TextView textViewPrice;
        public DrinkViewHolder(final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageDrink);
            textViewName = itemView.findViewById(R.id.drinkName);
            textViewPrice = itemView.findViewById(R.id.drinkPrice);
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
