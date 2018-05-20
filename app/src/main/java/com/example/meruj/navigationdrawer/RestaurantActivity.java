package com.example.meruj.navigationdrawer;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class RestaurantActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private Button btn1,btn2;
    private RecyclerView recyclerView;
    private List<Restaurant> restaurantList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        btn1 = findViewById(R.id.btnSpisok);
        btn2 = findViewById(R.id.btnKarta);

        btn1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn1.setBackgroundColor(getResources().getColor(R.color.buttonColor));
                btn2.setBackgroundColor(getResources().getColor(R.color.secondButtonColor));

                FirstFragment firstFragment  = new FirstFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fr_place,firstFragment,firstFragment.getTag()).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

               btn1.setBackgroundColor(getResources().getColor(R.color.secondButtonColor));
                btn2.setBackgroundColor(getResources().getColor(R.color.buttonColor));
                SecondFragment secondFragment = new SecondFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fr_place,secondFragment,secondFragment.getTag())
                        .commit();
            }
        });
        NavigationView navigationView =  findViewById(R.id.nav_view_restaurant);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(RestaurantActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(RestaurantActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(RestaurantActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(RestaurantActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(RestaurantActivity.this,EnterActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(RestaurantActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(RestaurantActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_restaurant);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
