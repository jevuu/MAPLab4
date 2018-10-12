package com.example.d8.maplab5;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterRightList extends ArrayAdapter<String> {
    private Activity context;
    private String[] text;
    private Integer[] imgID;
    private String[] alpha;

    private TextView text1;
    private ImageView img1;
    private TextView text2;


    public AdapterRightList(@NonNull Activity context, String[] text, Integer[] imgID, String[] alpha) {
        super(context, R.layout.textview_right_list, text);
        this.context = context;
        this.text = text;
        this.imgID = imgID;
        this.alpha = alpha;
    }

    public @NonNull
    View getView(int position, View view, @NonNull ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.textview_right_list, null, true);
        text1 = rowView.findViewById(R.id.text1);
        img1 = rowView.findViewById(R.id.img1);
        text2 = rowView.findViewById(R.id.text2);

        text1.setText(text[position]);
        img1.setImageResource(imgID[position]);
        text2.setText(alpha[position]);
        return rowView;
    }
}
