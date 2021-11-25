package com.example.a2019102002_susanyulianti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button viewsegtiga;
    private  Button viewrb;
    private Button viewweb;
    private  Button viewscroll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //deklarasi ID
        viewsegtiga = (Button) findViewById(R.id.segitiga);
        viewweb = (Button) findViewById(R.id.webview);
        viewrb  = (Button) findViewById(R.id.rb);
        viewscroll = (Button)findViewById(R.id.scroll);


        //aksi listener atau intent
        viewsegtiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //memanggil class segitiga
                startActivity(new Intent(getApplicationContext(),Segetiga.class));
            }
        });
        viewweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ViewWeb.class));
            }
        });
        viewrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RadioButton.class));
            }
        });
        viewscroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Scroll.class));
            }
        });
    }
}