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

public class RollAdapter extends RecyclerView.Adapter<RollAdapter.RollViewHolder> {
    List<Rolls> rollsList;

    public RollAdapter(List<Rolls> rollsList) {
        this.rollsList = rollsList;
    }

    @NonNull
    @Override
    public RollViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_roll,parent,false);
        RollViewHolder vh = new RollViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RollViewHolder holder, int position) {
        holder.imageView.setImageResource(rollsList.get(position).getId());
        holder.textViewName.setText(rollsList.get(position).getName());
        holder.textViewPrice.setText(rollsList.get(position).getPrice());
    }


    @Override
    public int getItemCount() {
        return rollsList.size();
    }

    public  class RollViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewName;
        TextView textViewPrice;
        public RollViewHolder(final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageRoll);
            textViewName = itemView.findViewById(R.id.rollName);
            textViewPrice = itemView.findViewById(R.id.rollPrice);
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
