package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    TextView datanamawarung,datajambuka,datatelepon;
    Button btn_button;
    ImageView datagambar;
    public static String id,nama,jambuka,telp,gambar;
    public static Double longitude,latitude;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanamawarung=findViewById(R.id.tv_namawarung);
        datajambuka=findViewById(R.id.tv_namajambuka);
        datatelepon=findViewById(R.id.tv_namatelepon);
        btn_button=findViewById(R.id.btn_button);
        datagambar=findViewById(R.id.img_data);

        datanamawarung.setText(nama);
        datajambuka.setText(jambuka);
        datatelepon.setText(telp);
        Picasso.get().load(gambar).into(datagambar);
    }
}