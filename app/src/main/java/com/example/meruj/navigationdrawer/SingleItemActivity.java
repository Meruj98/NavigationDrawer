package com.example.meruj.navigationdrawer;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItemActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private ImageView imageView;
    private TextView textViewName,textViewPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_item);
        imageView = findViewById(R.id.singleImage);
        textViewName = findViewById(R.id.singleName);
        textViewPrice = findViewById(R.id.singlePrice);
//          Bundle bundle = new Bundle();
//        if(bundle != null){
//            int resid = bundle.getInt("1");
//            imageView.setImageResource(resid);
//        }
        Bundle extras = getIntent().getExtras();
        Bitmap bmp =  extras.getParcelable("imagebitmap");
        String name = getIntent().getStringExtra("2");
        String price =  getIntent().getStringExtra("3");
        imageView.setImageBitmap(bmp);
        textViewName.setText(name);
        textViewPrice.setText(price);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
