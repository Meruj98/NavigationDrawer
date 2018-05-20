package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DrinksActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
    private RecyclerView recyclerView;
    private List<Drinks> drinksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        recyclerView = findViewById(R.id.rv);
        drinksList  = new ArrayList<>();

        drinksList.add(new Drinks(R.drawable.cola,"Coca cola","90rub"));
        drinksList.add(new Drinks(R.drawable.cola,"Coca cola","90rub"));
        drinksList.add(new Drinks(R.drawable.cola,"Coca cola","90rub"));
        drinksList.add(new Drinks(R.drawable.cola,"Coca cola","90rub"));
        drinksList.add(new Drinks(R.drawable.cola,"Coca cola","90rub"));
        drinksList.add(new Drinks(R.drawable.cola,"Coca cola","90rub"));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(DrinksActivity.this);
        recyclerView.setAdapter(new DrinksAdapter(drinksList));
        recyclerView.setLayoutManager(linearLayoutManager);

        NavigationView navigationView =  findViewById(R.id.nav_view_drinks);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(DrinksActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(DrinksActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(DrinksActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(DrinksActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(DrinksActivity.this,EnterActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(DrinksActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(DrinksActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_drinks);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
