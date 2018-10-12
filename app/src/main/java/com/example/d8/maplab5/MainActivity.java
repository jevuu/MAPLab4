package com.example.d8.maplab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView leftList;
    ListView rightList;

    String[] leftListString = {"santa claus", "rain umbrella", "picket fence", "space ship",
            "foreign passport", "flower icon", "snow man" , "skull bones", "flower pot",
            "libra scale", "teddy bear", "diamond ring"};
    Integer[] leftListImg = {R.drawable.santa_claus, R.drawable.rain_umbrella, R.drawable.picket_fence,
            R.drawable.space_ship, R.drawable.foreign_passport, R.drawable.flower_icon,
            R.drawable.snow_man, R.drawable.skull_bones, R.drawable.flower_pot,
            R.drawable.libra_scale, R.drawable.teddy_bear, R.drawable.diamond_ring};

    String[] rightListString = {"cigarette lighter", "house home", "desk lamp", "magic man",
            "light bulb", "hand cuffs", "acoustic guitar", "smoking gun", "hair dryer", "snoopy dog",
            "stop watch", "floppy disk"};
    Integer[] rightListImg = {R.drawable.cigarette_lighter, R.drawable.house_home, R.drawable.desk_lamp,
            R.drawable.magic_man, R.drawable.light_bulb, R.drawable.hand_cuffs,
            R.drawable.acoustic_guitar, R.drawable.smoking_gun, R.drawable.hair_dryer,
            R.drawable.snoopy_dog, R.drawable.stop_watch, R.drawable.floppy_disk};
    String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","Y","X","Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftList = findViewById(R.id.leftList);
        rightList = findViewById(R.id.rightList);


        AdapterLeftList leftList_Adapter =
                new AdapterLeftList(this, leftListString, leftListImg);
        leftList.setAdapter(leftList_Adapter);

        ArrayAdapter<String> rightList_Adapter =
                new AdapterRightList(this, rightListString, rightListImg, alpha);
        rightList.setAdapter(rightList_Adapter);
    }
}
