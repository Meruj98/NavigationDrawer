package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class DishesActivity extends AppCompatActivity
        implements OnNavigationItemSelectedListener{

    private RecyclerView recyclerView;
    private List<Dishes> dishesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);
        recyclerView = findViewById(R.id.rv);
        dishesList = new ArrayList<>();

        dishesList.add(new Dishes(R.drawable.cola,"Chaxan s lososom","280 rub"));
        dishesList.add(new Dishes(R.drawable.cola,"Chaxan s lososom","280 rub"));
        dishesList.add(new Dishes(R.drawable.cola,"Chaxan s lososom","280 rub"));
        dishesList.add(new Dishes(R.drawable.cola,"Chaxan s lososom","280 rub"));
        dishesList.add(new Dishes(R.drawable.cola,"Chaxan s lososom","280 rub"));
        dishesList.add(new Dishes(R.drawable.cola,"Chaxan s lososom","280 rub"));

        LinearLayoutManager llm = new LinearLayoutManager(DishesActivity.this);
        recyclerView.setAdapter(new DishesAdapter(dishesList));
        recyclerView.setLayoutManager(llm);

        NavigationView navigationView =  findViewById(R.id.nav_view_dish);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(DishesActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(DishesActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(DishesActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(DishesActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(DishesActivity.this,EnterActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(DishesActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(DishesActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_dish);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
