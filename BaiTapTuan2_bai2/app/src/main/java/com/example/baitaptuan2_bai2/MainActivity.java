package com.example.baitaptuan2_bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText ten;
    private Button them;
    private TextView ketQua;
    private ListView lv;
    private ArrayList<String> dsnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ten = (EditText)findViewById(R.id.edtTen);
        them = (Button)findViewById(R.id.btnThem);
        ketQua = (TextView)findViewById(R.id.txtKetQua);
        lv = (ListView)findViewById(R.id.ListView);

        //Them nguoi dung vao danh sach mac dinh
        dsnd = new ArrayList<String>();
        ThemNguoiDung();
        //Tao Apdater
        final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,dsnd);
        lv.setAdapter(adapter);
        //Them khi nguoi dung muon
        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenNguoiDung = ten.getText().toString();
                dsnd.add(tenNguoiDung);
                adapter.notifyDataSetChanged();
            }
        });
        //Hien thi ten nguoi dung va vi tri trong Arraylist
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tenNguoiDung1 = dsnd.get(i);
                int viTriNguoiDung = i;
                adapterView.getChildAt(i).setBackgroundColor(Color.GREEN);
                ketQua.setText("Position:" +viTriNguoiDung +","+"Value: " +tenNguoiDung1);
            }
        });
    }

    public void ThemNguoiDung(){
        dsnd.add("Nghia");
        dsnd.add("Oanh");
        dsnd.add("Huy");
    }
}
