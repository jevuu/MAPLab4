package com.example.d8.maplab5;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterLeftList extends ArrayAdapter<String> {
    private Activity context;
    private String[] text;
    private int[] imgID;

    private TextView text1;
    private ImageView img1;


    public AdapterLeftList(@NonNull Activity context, String[] text, int[] imgID) {
        super(context, R.layout.textview_left_list, text);
        this.context = context;
        this.text = text;
        this.imgID = imgID;
    }

    public @NonNull
    View getView(int position, View view, @NonNull ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.textview_left_list, null, true);
        text1 = rowView.findViewById(R.id.text1);
        img1 = rowView.findViewById(R.id.img1);
        text1.setText(text[position]);
        img1.setImageResource(imgID[position]);
        return rowView;
    }
}
