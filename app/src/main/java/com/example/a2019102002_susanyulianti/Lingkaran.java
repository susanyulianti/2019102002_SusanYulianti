package com.example.a2019102002_susanyulianti;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lingkaran extends AppCompatActivity {
    private EditText E_Jari2;
    private Button B_Luas;
    private TextView H_Luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        E_Jari2 = findViewById(R.id.jari2);
        B_Luas = findViewById(R.id.hitung);
        H_Luas = findViewById(R.id.hasil);

        //listener luas
        B_Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hitungluas();
            }

            private void hitungluas() {
                String Jari2 = E_Jari2.getText().toString();
                // aritmatik
                double luas = 3.14 * Integer.parseInt(Jari2) * Integer.parseInt(Jari2);
                H_Luas.setText("Nilai Luasnya Adalah : " + luas);
            }
        });
    }
}
