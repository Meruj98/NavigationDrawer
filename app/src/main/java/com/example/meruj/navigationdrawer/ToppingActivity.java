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
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class ToppingActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
private RecyclerView recyclerView;
private List<Topping> toppingList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topping);
        recyclerView = findViewById(R.id.rv);
        toppingList = new ArrayList<>();
        toppingList.add(new Topping(R.drawable.cheesecake,"Sous Carry","90rub"));
        toppingList.add(new Topping(R.drawable.cheesecake,"Sous Carry","90rub"));
        toppingList.add(new Topping(R.drawable.cheesecake,"Sous Carry","90rub"));
        toppingList.add(new Topping(R.drawable.cheesecake,"Sous Carry","90rub"));
        toppingList.add(new Topping(R.drawable.cheesecake,"Sous Carry","90rub"));
        toppingList.add(new Topping(R.drawable.cheesecake,"Sous Carry","90rub"));
        toppingList.add(new Topping(R.drawable.cheesecake,"Sous Carry","90rub"));
        toppingList.add(new Topping(R.drawable.cheesecake,"Sous Carry","90rub"));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ToppingActivity.this);
        recyclerView.setAdapter(new ToppingAdapter(toppingList));
        recyclerView.setLayoutManager(linearLayoutManager);

        NavigationView navigationView =  findViewById(R.id.nav_view_top);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(ToppingActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(ToppingActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(ToppingActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(ToppingActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(ToppingActivity.this,EnterActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(ToppingActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(ToppingActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_topping);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
