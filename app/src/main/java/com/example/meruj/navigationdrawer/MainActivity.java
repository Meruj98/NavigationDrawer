package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
                implements NavigationView.OnNavigationItemSelectedListener{
private RecyclerView recyclerView;
List<Food> foodList;
private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        foodList = new ArrayList<>();
        foodList.add(new  Food("Напитки",R.drawable.aaa));
        foodList.add(new  Food("Дессерты",R.drawable.aaa));
        foodList.add(new  Food("Топпинги",R.drawable.aaa));
        foodList.add(new  Food("Салаты",R.drawable.aaa));
        foodList.add(new  Food("Роллы",R.drawable.aaa));
        foodList.add(new  Food("Темпура",R.drawable.aaa));
        foodList.add(new  Food("Блюда на Теппане",R.drawable.aaa));
        foodList.add(new  Food("Донбури",R.drawable.aaa));
        foodList.add(new Food("Удон",R.drawable.aaa));

        recyclerView = findViewById(R.id.rv);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setAdapter(new MainAdapter(foodList));
        recyclerView.setLayoutManager(gridLayoutManager);

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(MainActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(MainActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(MainActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(MainActivity.this,EnterActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(MainActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(MainActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
