package com.example.baitaptuan2new_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<NhanVien> arrNhanVien = null;
    MyArrayAdapter adapter = null;
    ListView lv = null;
    Button NhapNV;
    RadioButton nam,nu;
    RadioGroup radioGroup;
    EditText ma,ten;
    ImageButton xoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NhapNV = (Button)findViewById(R.id.btnNhap);
        ma = (EditText) findViewById(R.id.edtMa);
        ten = (EditText) findViewById(R.id.edtTen);
        radioGroup = (RadioGroup)findViewById(R.id.gen);
        nam = (RadioButton)findViewById(R.id.rdNam);
        nu = (RadioButton)findViewById(R.id.rdNu);
        lv = (ListView)findViewById(R.id.lv);
        xoa = (ImageButton)findViewById(R.id.imgbt_xoa);
        arrNhanVien = new ArrayList<NhanVien>();
        adapter = new MyArrayAdapter(this,R.layout.dong_item,arrNhanVien);
        lv.setAdapter(adapter);

        NhapNV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyNhap();
            }
        });
        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyXoa();
            }
        });
    }

    public void XuLyNhap(){
        String ma1 = ma.getText().toString();
        String ten1 = ten.getText().toString();
        boolean gioitinh = false;
        if(nu.isChecked()){
            gioitinh = true;
        }
        else {
            gioitinh = false;
        }
        NhanVien nv = new NhanVien();
        nv.setId(ma1);
        nv.setTen(ten1);
        nv.setGioiTinh(gioitinh);
        arrNhanVien.add(nv);
        adapter.notifyDataSetChanged();
    }
    public void XuLyXoa(){
        for(int i = lv.getChildCount()-1;i>=0;i--){
            System.out.println(i);
            View v = lv.getChildAt(i);
            System.out.println(v);
            CheckBox chk = (CheckBox)v.findViewById(R.id.chk_item);
            if(chk.isChecked()){
                arrNhanVien.remove(i);
            }
        }
        adapter.notifyDataSetChanged();
    }
}
