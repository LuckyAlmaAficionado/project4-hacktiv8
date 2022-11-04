package com.hacktiv8.travelapplicationhacktiv8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BookATripActivity extends AppCompatActivity {

    private TextView keberangkatan, kedatangan, perusahaan,
            rating, tglSekarang, tglBerangkat, platBus,
            classBus, hrgSatuan, totHarga;
    private Button booking;
    private CardView lihatFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_atrip);

        // TextView Deklarasi
        keberangkatan = (TextView) findViewById(R.id.txtKotaPertama);
        kedatangan = (TextView) findViewById(R.id.txtKotaKedua);
        perusahaan = (TextView) findViewById(R.id.txtPerusahaan);
        rating = (TextView) findViewById(R.id.txtRatings);
        tglSekarang = (TextView) findViewById(R.id.txtCurDate);
        tglBerangkat = (TextView) findViewById(R.id.txtTanggalKeberangkatan);
        platBus = (TextView) findViewById(R.id.platBus);
        classBus = (TextView) findViewById(R.id.classBus);
        hrgSatuan = (TextView) findViewById(R.id.RatePrice);
        totHarga = (TextView) findViewById(R.id.TotPrice);

        // Button
        booking = (Button) findViewById(R.id.pesanSekarang);
        // Button ConstrainLayout
        lihatFoto = (CardView) findViewById(R.id.btnLihatFoto);

        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BookATripActivity.this, "Tombol " + view.getId() + " Ditekan", Toast.LENGTH_SHORT).show();
            }
        });

        lihatFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BookATripActivity.this, "Tombol " + view.getId() + " Ditekan", Toast.LENGTH_SHORT).show();
            }
        });


    }


}