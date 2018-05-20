package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        textView = findViewById(R.id.textView2);
        textView.setMovementMethod(new ScrollingMovementMethod());
        NavigationView navigationView =  findViewById(R.id.nav_view_about);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu_about){
            Intent intent = new Intent(AboutUsActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya_about){
            Intent intent = new Intent(AboutUsActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas_about) {
            Intent intent = new Intent(AboutUsActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti_about){
            Intent intent = new Intent(AboutUsActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod_about){
            Intent intent = new Intent(AboutUsActivity.this,EnterActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(AboutUsActivity.this,RestaurantActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kod){
            Intent intent = new Intent(AboutUsActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_about);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
