package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class EnterActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    TextView enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        enter = findViewById(R.id.textEnter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(EnterActivity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });

        NavigationView navigationView =  findViewById(R.id.nav_view_enter);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(EnterActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(EnterActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(EnterActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(EnterActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(EnterActivity.this,EnterActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(EnterActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(EnterActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_enter);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
