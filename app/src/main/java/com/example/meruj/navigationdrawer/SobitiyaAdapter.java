package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SobitiyaAdapter extends RecyclerView.Adapter<SobitiyaAdapter.SobViewHolder> {
    List<Sobitiya> list;

    public SobitiyaAdapter(List<Sobitiya> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public SobViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sobitiya,parent,false);
        SobViewHolder vh = new SobViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull SobViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getId());
        holder.textViewHead.setText(list.get(position).getHeader());
        holder.textSob.setText(list.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class SobViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewHead;
        TextView textSob;
        public SobViewHolder(final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageSob);
            textViewHead = itemView.findViewById(R.id.headSob);
            textSob = itemView.findViewById(R.id.textSob);
            textSob.setMovementMethod(new ScrollingMovementMethod());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView.buildDrawingCache();
                    Bitmap image  = imageView.getDrawingCache();
                    Intent intent = new Intent(itemView.getContext(),SingleSobitiyaActivity.class);
                    intent.putExtra("9",imageView.getId());
                    intent.putExtra("10",textViewHead.getText().toString());
                    intent.putExtra("11",textSob.getText().toString());
                    Bundle extras = new Bundle();
                    extras.putParcelable("imagebitmap2", image);
                    intent.putExtras(extras);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
