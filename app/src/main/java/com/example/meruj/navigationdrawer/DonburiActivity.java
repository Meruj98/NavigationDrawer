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

public class DonburiActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private RecyclerView recyclerView;
    private List<Donburi> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donburi);
        list = new ArrayList<>();
        list.add(new Donburi(R.drawable.cheesecake,"Unagi Don","330rub"));
        list.add(new Donburi(R.drawable.cheesecake,"Unagi Don","330rub"));
        list.add(new Donburi(R.drawable.cheesecake,"Unagi Don","330rub"));
        list.add(new Donburi(R.drawable.cheesecake,"Unagi Don","330rub"));
        list.add(new Donburi(R.drawable.cheesecake,"Unagi Don","330rub"));
        list.add(new Donburi(R.drawable.cheesecake,"Unagi Don","330rub"));

        recyclerView = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(DonburiActivity.this);
        recyclerView.setAdapter(new DonburiAdapter(list));
        recyclerView.setLayoutManager(llm);

        NavigationView navigationView =  findViewById(R.id.nav_view_donburi);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(DonburiActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(DonburiActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(DonburiActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(DonburiActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(DonburiActivity.this,EnterActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(DonburiActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(DonburiActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_donburi);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
