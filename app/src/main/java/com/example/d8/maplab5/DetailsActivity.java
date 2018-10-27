package com.example.d8.maplab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {

    private TextView detailsName;
    private ImageView detailsImage;
    private Intent intent;
    private String itemName;
    private int itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        intent = getIntent();
        itemName = intent.getStringExtra("itemName");
        itemImage = intent.getIntExtra("itemImage", 0);
        //private int position = intent.getIntExtra("position", 0);

        detailsName = (TextView) findViewById(R.id.detailsName);
        detailsName.setText(itemName);

        detailsImage = (ImageView) findViewById(R.id.detailsImage);
        detailsImage.setImageResource(itemImage);
    }
}
