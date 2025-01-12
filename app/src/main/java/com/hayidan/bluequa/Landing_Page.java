package com.hayidan.bluequa;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class Landing_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        // Menambahkan delay sebelum pindah ke activity berikutnya
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // Mengarahkan ke introduce1 activity
                Intent intent = new Intent(Landing_Page.this, intoduce1.class);
                startActivity(intent);
                finish(); // Menutup Landing_Page agar tidak bisa kembali
            }
        }, 2000L); // 2000L = 2 detik
    }
}
