package com.example.a2019102002_susanyulianti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {
    private Button viewpilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        viewpilih = (Button)findViewById(R.id.pilih);

        //aksi radio
        final RadioGroup rgbjenis = (RadioGroup) findViewById(R.id.rgjenis);
        viewpilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rgbjenis.getCheckedRadioButtonId();
                switch (id){
                    case R.id.rbj:
                        Toast.makeText(getApplication(), "saya Suka Java", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbk:
                        Toast.makeText(getApplication(), "saya Suka Kotlin", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbf:
                        Toast.makeText(getApplication(), "saya Suka Flutter", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}