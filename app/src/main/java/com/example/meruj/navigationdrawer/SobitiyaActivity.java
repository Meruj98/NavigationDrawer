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

import java.util.ArrayList;
import java.util.List;

public class SobitiyaActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    List<Sobitiya> list;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobitiya);
        recyclerView = findViewById(R.id.rv);
        String text = "  \"Рис с жареной курицей в соусе терияки.\n" +
                "Продается на выбор с жареным яйцом или с яйцом всмятку.\n";
        list = new ArrayList<>();

        list.add(new Sobitiya(R.drawable.cola,"MOSddgdsd","adfgrsdasfgfdsfg"));
        list.add(new Sobitiya(R.drawable.aaa,"MOSddgdsd","adfgrsdasfgfdsfg"));
        list.add(new Sobitiya(R.drawable.aaa,"MOSddgdsd","adfgrsdasfgfdsfg"));
        list.add(new Sobitiya(R.drawable.aaa,"MOSddgdsd","adfgrsdasfgfdsfg"));
        list.add(new Sobitiya(R.drawable.aaa,"MOSddgdsd","adfgrsdasfgfdsfg"));
        list.add(new Sobitiya(R.drawable.about_us,"efrgd",text.toString()));

        recyclerView.setAdapter(new SobitiyaAdapter(list));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SobitiyaActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        NavigationView navigationView =  findViewById(R.id.nav_view_sob);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(SobitiyaActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(SobitiyaActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(SobitiyaActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(SobitiyaActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(SobitiyaActivity.this,EnterActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(SobitiyaActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(SobitiyaActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_sobitiya);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
