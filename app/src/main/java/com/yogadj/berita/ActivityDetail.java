package com.yogadj.berita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetail extends AppCompatActivity {

    ImageView ivdetail;
    TextView tvdetailjudul, tvdetaildeskrpsi,tvdetailisi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Detail");


        ivdetail = (ImageView) findViewById(R.id.iv_detail);
        tvdetailjudul = (TextView) findViewById(R.id.tv_detail_judul);
        tvdetaildeskrpsi = (TextView) findViewById(R.id.tv_detail_deskripsi);
        tvdetailisi = (TextView) findViewById(R.id.tv_detail_isi);



        getData();
    }

    private void getData(){
        ivdetail.setImageResource(getIntent().getIntExtra("id_image", R.drawable.news));
        tvdetailjudul.setText(getIntent().getStringExtra("id_judul"));
        tvdetaildeskrpsi.setText(getIntent().getStringExtra("id_deskripsi"));
        tvdetailisi.setText(getIntent().getStringExtra("id_isi"));
    }
}
