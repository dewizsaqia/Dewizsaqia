package com.example.android.dewizsaqia_1202150265_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFood, etPortion; //deklarasi objek
    Intent intent;
    String restaurant,menu;
    int portion;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //method yang pertama kali dijalankan saat aktifiti dibuat
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFood = (EditText)findViewById(R.id.et_food);
        etPortion = (EditText)findViewById(R.id.et_portion);
        intent = new Intent(this,ReviewPesanan.class);
    }

    public void onEatbus(View view) {
        //log itu digunakan untuk menampilkan data di logcat android studio di hp
        menu = etFood.getText().toString();
        restaurant = "Eatbus";
        portion = Integer.parseInt(etPortion.getText().toString());
        int total = 50000 * portion;
        Log.d("TOTAL HARGA", "Rp." +total);
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);

    }

    public void onAbnormal(View view) {
        menu = etFood.getText().toString();
        restaurant = "Abnormal";
        portion = Integer.parseInt(etPortion.getText().toString());
        int total = 30000 * portion;
        Log.d("TOTAL HARGA", "Rp." +total);
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }
}
