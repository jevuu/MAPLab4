package com.example.d8.maplab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView leftList;
    ListView rightList;

    String[] stringArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","Y","X","Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView leftList = findViewById(R.id.leftList);
        ArrayAdapter<String> arrayAdapterLeftList =
                new ArrayAdapter<>(this, R.layout.textview_left_list, stringArray);
        leftList.setAdapter(arrayAdapterLeftList);
    }
}
