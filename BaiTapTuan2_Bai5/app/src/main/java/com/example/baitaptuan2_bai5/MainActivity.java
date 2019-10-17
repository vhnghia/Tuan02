package com.example.baitaptuan2_bai5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.baitaptuan2_bai5.NhanVien.Employee;
import com.example.baitaptuan2_bai5.NhanVien.EmployeeFullTime;
import com.example.baitaptuan2_bai5.NhanVien.EmployeePartTime;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private EditText id,ten;
    private Button add;
    private ArrayList<Employee> dsnv;
    private RadioButton chinhthuc,thoivu;
    private ArrayAdapter<Employee> arrayAdapter;
    private RadioGroup group;
    private Employee employee = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nhap();
            }
        });
    }

    public void AnhXa(){
        lv = (ListView)findViewById(R.id.lv);
        id = (EditText)findViewById(R.id.edtID);
        ten = (EditText)findViewById(R.id.edtName);
        add = (Button)findViewById(R.id.btnAdd);
        chinhthuc = (RadioButton)findViewById(R.id.rdChinhThuc);
        thoivu = (RadioButton)findViewById(R.id.rdPartime);
        dsnv = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<Employee>(MainActivity.this,android.R.layout.simple_list_item_1,dsnv);
        lv.setAdapter(arrayAdapter);
    }

    public void nhap(){
        String id1 = id.getText().toString();
        String ten1 = ten.getText().toString();
        if(thoivu.isChecked()){
            String chucvu1 = thoivu.getText().toString();
            employee = new EmployeePartTime(ten1,id1,chucvu1);
            dsnv.add(employee);
            arrayAdapter.notifyDataSetChanged();
        }else {
            String chucvu1 = chinhthuc.getText().toString();
            employee = new EmployeeFullTime(ten1,id1,chucvu1);
            dsnv.add(employee);
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
