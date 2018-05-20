package com.example.meruj.navigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SingleRestaurantItemActivity extends AppCompatActivity {

    private TextView singleRestaurantName;
    private TextView singleRestaurantNumber;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_restaurant_item);
        singleRestaurantName = findViewById(R.id.singleRestaurantName);
        singleRestaurantNumber = findViewById(R.id.singleRestaurantNumber);
        String name = getIntent().getStringExtra("2");
        final String number = getIntent().getStringExtra("4");
        button = findViewById(R.id.buttonCallRestaurant);
        singleRestaurantName.setText(name);
        singleRestaurantNumber.setText(number);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContacPhone(number);
            }
        });
    }
    private void dialContacPhone(String phoneNumber){
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phoneNumber,null)));
    }
}
