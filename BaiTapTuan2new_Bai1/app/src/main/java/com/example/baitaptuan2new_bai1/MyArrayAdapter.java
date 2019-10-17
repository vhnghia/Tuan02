package com.example.baitaptuan2new_bai1;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<NhanVien> {

    Activity context = null;
    ArrayList<NhanVien> myArray = null;
    int layoutId;


    public MyArrayAdapter(Activity context, int resouces, ArrayList<NhanVien> objects) {
        super(context, resouces, objects);
        this.context = context;
        this.layoutId = resouces;
        this.myArray = objects;
    }

    public View getView(int i, View view, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        view = inflater.inflate(layoutId,null);

        if(myArray.size() > 0 && i >= 0){
            final TextView txtdisplay = (TextView)view.findViewById(R.id.tv_item);
            final NhanVien nv = myArray.get(i);
            txtdisplay.setText(nv.toString());
            final ImageView img = (ImageView)view.findViewById(R.id.img_item);
            if(nv.isGioiTinh()){
                img.setImageResource(R.drawable.nu);
            }else {
                img.setImageResource(R.drawable.nam);
            }
        }

        return view;
    }

}
