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

public class SweetActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
private List<Sweet> sweetList ;
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet);
        recyclerView = findViewById(R.id.rv);
        sweetList = new ArrayList<>();
        sweetList.add(new Sweet(R.drawable.cheesecake,"Cheescake","270rub"));
        sweetList.add(new Sweet(R.drawable.cheesecake,"Cheescake","270rub"));
        sweetList.add(new Sweet(R.drawable.cheesecake,"Cheescake","270rub"));
        sweetList.add(new Sweet(R.drawable.cheesecake,"Cheescake","270rub"));
        sweetList.add(new Sweet(R.drawable.cheesecake,"Cheescake","270rub"));
        sweetList.add(new Sweet(R.drawable.cheesecake,"Cheescake","270rub"));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SweetActivity.this);
        recyclerView.setAdapter(new SweetAdapter(sweetList));
        recyclerView.setLayoutManager(linearLayoutManager);

        NavigationView navigationView =  findViewById(R.id.nav_view_sweet);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(SweetActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(SweetActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(SweetActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(SweetActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(SweetActivity.this,EnterActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(SweetActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(SweetActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_sweet);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
