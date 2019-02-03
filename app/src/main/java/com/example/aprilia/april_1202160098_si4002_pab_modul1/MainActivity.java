package com.example.aprilia.april_1202160098_si4002_pab_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText alas,tinggi;
    private Button cek; //nama button cek
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        cek = findViewById(R.id.button_cek);
        hasil = findViewById(R.id.hasilLuas);
    }

    public void cek (View view){
        String inputAlas = alas.getText().toString(); //di convert ke string >> alas
        String inputTinggi = tinggi.getText().toString(); //memasukan nilai tinggi
        Integer hasilAlas = Integer.parseInt(inputAlas);    //convert nilai alas yang diinput
        Integer hasilTinggi = Integer.parseInt(inputTinggi);    //convert nilai tinggi yang diinput

        Integer count = hasilAlas * hasilTinggi;    //rumus hitung luas
        hasil.setText(Integer.toString(count));     //menyimpan hasil hitung pada hasil
    }

}
