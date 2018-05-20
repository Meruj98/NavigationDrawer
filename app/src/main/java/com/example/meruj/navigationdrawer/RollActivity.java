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

public class RollActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private List<Rolls> rollList;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll);
        recyclerView = findViewById(R.id.rv);
        rollList = new ArrayList<>();
        rollList.add(new Rolls(R.drawable.aaa,"Krivetki","120rub"));
        rollList.add(new Rolls(R.drawable.aaa,"Krivetki","120rub"));
        rollList.add(new Rolls(R.drawable.aaa,"Krivetki","120rub"));
        rollList.add(new Rolls(R.drawable.aaa,"Krivetki","120rub"));
        rollList.add(new Rolls(R.drawable.aaa,"Krivetki","120rub"));
        rollList.add(new Rolls(R.drawable.aaa,"Krivetki","120rub"));

        LinearLayoutManager llm = new LinearLayoutManager(RollActivity.this);
        recyclerView.setAdapter(new RollAdapter(rollList));
        recyclerView.setLayoutManager(llm);

        NavigationView navigationView =  findViewById(R.id.nav_view_roll);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(RollActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(RollActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(RollActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(RollActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(RollActivity.this,EnterActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(RollActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(RollActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
