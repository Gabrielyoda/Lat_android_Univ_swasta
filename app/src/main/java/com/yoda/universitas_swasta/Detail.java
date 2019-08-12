package com.yoda.universitas_swasta;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {
    public static final String EXTRA_Judul = "extra_judul";
    public static final String EXTRA_Detail = "extra_detail";
    public static final String EXTRA_Foto = "extra_foto";

    TextView txt_judul,txt_detail;
    ImageView img_poster_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txt_judul = (TextView) findViewById(R.id.txt_judul);
        txt_detail = (TextView) findViewById(R.id.txt_detail);
        img_poster_detail = (ImageView) findViewById(R.id.img_poster_detail);

        String judul = getIntent().getStringExtra(EXTRA_Judul);
        String detail = getIntent().getStringExtra(EXTRA_Detail);
        String foto = getIntent().getStringExtra(EXTRA_Foto);

        txt_judul.setText(judul);
        txt_detail.setText(detail);
        Glide.with(Detail.this)
                .load(foto)
                //. LOAD GAMBAR SAAT TERJADI KESALAHAN MEMUAT GMBR UTAMA
                //.error(R.drawable.ic_foto)
                .into(img_poster_detail);
        //img_poster_detail.setImageDrawable(Drawable.createFromPath(foto));


    }
}
