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

public class UdonActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private RecyclerView recyclerView;
    private List<Udon> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udon);
        recyclerView = findViewById(R.id.rv);
        list = new ArrayList<>();
        list.add(new Udon(R.drawable.cola,"Udon ontama s govyadinoy","310rub"));
        list.add(new Udon(R.drawable.cola,"Udon ontama s govyadinoy","310rub"));
        list.add(new Udon(R.drawable.cola,"Udon ontama s govyadinoy","310rub"));
        list.add(new Udon(R.drawable.cola,"Udon ontama s govyadinoy","310rub"));
        list.add(new Udon(R.drawable.cola,"Udon ontama s govyadinoy","310rub"));

        LinearLayoutManager llm  = new LinearLayoutManager(UdonActivity.this);
        recyclerView.setAdapter(new UdonAdapter(list));
        recyclerView.setLayoutManager(llm);

        NavigationView navigationView =  findViewById(R.id.nav_view_udon);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(UdonActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(UdonActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(UdonActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(UdonActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(UdonActivity.this,EnterActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(UdonActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(UdonActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_udon);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
