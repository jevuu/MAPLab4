package com.example.d8.maplab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView leftList;
    GridView rightList;

    String[] stringArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","Y","X","Z"};
    String[] numberArray = new String[99];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftList = findViewById(R.id.leftList);
        rightList = findViewById(R.id.rightList);

        for(int i = 0; i < 99; i++){
             numberArray[i] = String.valueOf(7 * (i + 1));
        }
        ArrayAdapter<String> leftList_Adapter =
                new ArrayAdapter<>(this, R.layout.textview_left_list, stringArray);
        leftList.setAdapter(leftList_Adapter);

        ArrayAdapter<String> rightList_Adapter =
                new ArrayAdapter<>(this, R.layout.textview_right_list, numberArray);
        rightList.setAdapter(rightList_Adapter);
    }
}
