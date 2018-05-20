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

public class TempuraActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private RecyclerView recyclerView;
    private List<Tempura> tempuraList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempura);
        tempuraList = new ArrayList<>();
        tempuraList.add(new Tempura(R.drawable.aaa,"Gyozda s krivetkami","240rub"));
        tempuraList.add(new Tempura(R.drawable.aaa,"Gyozda s krivetkami","240rub"));
        tempuraList.add(new Tempura(R.drawable.aaa,"Gyozda s krivetkami","240rub"));
        tempuraList.add(new Tempura(R.drawable.aaa,"Gyozda s krivetkami","240rub"));
        tempuraList.add(new Tempura(R.drawable.aaa,"Gyozda s krivetkami","240rub"));

        recyclerView = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(TempuraActivity.this);
        recyclerView.setAdapter(new TempuraAdapter(tempuraList));
        recyclerView.setLayoutManager(llm);

        NavigationView navigationView =  findViewById(R.id.nav_view_temp);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(TempuraActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(TempuraActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(TempuraActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(TempuraActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(TempuraActivity.this,EnterActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(TempuraActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(TempuraActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_tempura);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
