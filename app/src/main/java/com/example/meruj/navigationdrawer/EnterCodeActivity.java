package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class EnterCodeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_code);
        NavigationView navigationView =  findViewById(R.id.nav_view_enter_code);
        navigationView.setNavigationItemSelectedListener(this);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setBackgroundColor(getResources().getColor(R.color.buttonColor));
                btn2.setBackgroundColor(getResources().getColor(R.color.secondButtonColor));
                btn3.setBackgroundColor(getResources().getColor(R.color.secondButtonColor));

                EnterCodeFirstFragment enterCodeFirstFragment = new EnterCodeFirstFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fr_code,enterCodeFirstFragment,enterCodeFirstFragment.getTag()).commit();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setBackgroundColor(getResources().getColor(R.color.buttonColor));
                btn1.setBackgroundColor(getResources().getColor(R.color.secondButtonColor));
                btn3.setBackgroundColor(getResources().getColor(R.color.secondButtonColor));

                EnterCodeFirstFragment enterCodeFirstFragment = new EnterCodeFirstFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fr_code,enterCodeFirstFragment,enterCodeFirstFragment.getTag()).commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setBackgroundColor(getResources().getColor(R.color.buttonColor));
                btn1.setBackgroundColor(getResources().getColor(R.color.secondButtonColor));
                btn2.setBackgroundColor(getResources().getColor(R.color.secondButtonColor));

                EnterCodeFirstFragment enterCodeFirstFragment = new EnterCodeFirstFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fr_code,enterCodeFirstFragment,enterCodeFirstFragment.getTag()).commit();
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.nav_menu){
            Intent intent = new Intent(EnterCodeActivity.this,MainActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_sobitiya){
            Intent intent = new Intent(EnterCodeActivity.this,SobitiyaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_onas) {
            Intent intent = new Intent(EnterCodeActivity.this,AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_kontakti){
            Intent intent = new Intent(EnterCodeActivity.this,ContactFormActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_vxod){
            Intent intent = new Intent(EnterCodeActivity.this,EnterActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_restaurant){
            Intent intent = new Intent(EnterCodeActivity.this,RestaurantActivity.class);
            startActivity(intent);
        }
         else if (id == R.id.nav_kod){
            Intent intent = new Intent(EnterCodeActivity.this,EnterCodeActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout_enter_code);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
