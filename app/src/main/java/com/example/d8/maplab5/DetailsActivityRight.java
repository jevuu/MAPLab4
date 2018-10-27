package com.example.d8.maplab5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivityRight extends AppCompatActivity {

    private TextView detailsName;
    private TextView detailsAlpha;
    private ImageView detailsImage;
    private Intent intent;
    private String itemName;
    private String itemAlpha;
    private int itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_right);

        intent = getIntent();
        itemName = intent.getStringExtra("itemName");
        itemImage = intent.getIntExtra("itemImage", 0);
        itemAlpha = intent.getStringExtra("itemAlpha");

        detailsName = (TextView) findViewById(R.id.detailsName);
        detailsName.setText(itemName);

        detailsImage = (ImageView) findViewById(R.id.detailsImage);
        detailsImage.setImageResource(itemImage);

        detailsAlpha = (TextView) findViewById(R.id.detailsAlpha);
        detailsAlpha.setText(itemAlpha);
    }
}
