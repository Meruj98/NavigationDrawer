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

public class SaladActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
private List<Salad> saladList;
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);
        recyclerView = findViewById(R.id.rv);
        saladList = new ArrayList<>();
        saladList.add(new Salad(R.drawable.aaa,"Salad Cesar " +
                "sfdvdcsdfrgfrdes","140rub"));
        saladList.add(new Salad(R.drawable.aaa,"Salad Cesar","140rub"));
        saladList.add(new Salad(R.drawable.aaa,"Salad Cesar","140rub"));
        saladList.add(new Salad(R.drawable.aaa,"Salad Cesar","140rub"));
        saladList.add(new Salad(R.drawable.aaa,"Salad Cesar","140rub"));
        saladList.add(new Salad(R.drawable.aaa,"Salad Cesar","140rub"));
        saladList.add(new Salad(R.drawable.aaa,"Salad Cesar","140rub"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SaladActivity.this);
        recyclerView.setAdapter(new SaladAdapter(saladList));
        recyclerView.setLayoutManager(linearLayoutManager);

        NavigationView navigationView =  findViewById(R.id.nav_view_salad);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(SaladActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(SaladActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(SaladActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(SaladActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(SaladActivity.this,EnterActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(SaladActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(SaladActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_salad);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
