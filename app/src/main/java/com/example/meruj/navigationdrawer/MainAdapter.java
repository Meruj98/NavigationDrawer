package com.example.meruj.navigationdrawer;

import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    List<Food> foodList;
    @NonNull
    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        //findViewById...
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(foodList.get(position).getId());
        holder.textView.setText(foodList.get(position).getName());
    }

    public MainAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public MyViewHolder(final View itemView) {
            super(itemView);

             imageView = itemView.findViewById(R.id.food_img);
             textView = itemView.findViewById(R.id.food_text);
             itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     if(textView.getText().equals("Напитки")) {
                        Intent intent = new Intent(itemView.getContext(),DrinksActivity.class);
                        itemView.getContext().startActivity(intent);
                     }else  if (textView.getText().equals("Дессерты")){
                         Intent intent = new Intent(itemView.getContext(),SweetActivity.class);
                         itemView.getContext().startActivity(intent);
                     }else if (textView.getText().equals("Топпинги")) {
                         Intent intent = new Intent(itemView.getContext(), ToppingActivity.class);
                         itemView.getContext().startActivity(intent);
                     }else if(textView.getText().equals("Салаты")){
                         Intent intent = new Intent(textView.getContext(),SaladActivity.class);
                         itemView.getContext().startActivity(intent);
                     }else if(textView.getText().equals("Роллы")){
                         Intent intent = new Intent(textView.getContext(),RollActivity.class);
                         itemView.getContext().startActivity(intent);
                     }else if(textView.getText().equals("Темпура")){
                         Intent intent  = new Intent(textView.getContext(),TempuraActivity.class);
                         itemView.getContext().startActivity(intent);
                     }else if (textView.getText().equals("Блюда на Теппане")){
                         Intent intent = new Intent(textView.getContext(),DishesActivity.class);
                         itemView.getContext().startActivity(intent);
                     }else if(textView.getText().equals("Донбури")){
                         Intent intent = new Intent(textView.getContext(),DonburiActivity.class);
                         itemView.getContext().startActivity(intent);
                     }else  if (textView.getText().equals("Удон")){
                         Intent intent = new Intent(textView.getContext(),UdonActivity.class);
                         itemView.getContext().startActivity(intent);
                     }
                 }
             });

        }
    }
}
