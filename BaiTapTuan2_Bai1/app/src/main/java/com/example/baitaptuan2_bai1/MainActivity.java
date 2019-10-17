package com.example.baitaptuan2_bai1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button dangNhap,thoat;
    private CheckBox luu;
    private EditText taiKhoan,matKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        taiKhoan = (EditText)findViewById(R.id.edtTaiKhoan);
        matKhau = (EditText)findViewById(R.id.editText3);
        luu = (CheckBox)findViewById(R.id.chkThongTin);
        dangNhap = (Button)findViewById(R.id.btnDangNhap);
        thoat = (Button)findViewById(R.id.btnThoat);

        dangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(luu.isChecked()){
                    Toast.makeText(MainActivity.this,"Thông Tin Của Bạn Đã Được ",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"Thông Tin Của Bạn Chưa Được Lưu ",Toast.LENGTH_LONG).show();
                }

            }
        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Warning");
                alert.setMessage("Ban có muốn thoát chương trình không?");
                alert.setPositiveButton("Đồng Ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alert.show();
            }
        });
    }
}
