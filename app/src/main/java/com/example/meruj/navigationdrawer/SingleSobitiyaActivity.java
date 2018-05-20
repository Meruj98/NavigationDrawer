package com.example.meruj.navigationdrawer;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleSobitiyaActivity extends AppCompatActivity {

    ImageView imageViewSobitiya;
    TextView textViewSobHeader,textViewSob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_sobitiya);
        imageViewSobitiya = findViewById(R.id.imageSingleSobitiya);
        textViewSobHeader = findViewById(R.id.textViewSobHeader);
        textViewSob = findViewById(R.id.textViewSob);
        textViewSob.setMovementMethod(new ScrollingMovementMethod());
        Bundle extras = getIntent().getExtras();
        Bitmap bmp =  extras.getParcelable("imagebitmap2");
        String name = getIntent().getStringExtra("10");
        String price =  getIntent().getStringExtra("11");
        imageViewSobitiya.setImageBitmap(bmp);
        textViewSobHeader.setText(name);
        textViewSob.setText(price);
    }
}
