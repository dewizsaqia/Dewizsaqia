package com.example.android.dewizsaqia_1202150265_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ReviewPesanan extends AppCompatActivity {

    TextView tvRestaurant, tvMenu, tvPortion, tvPrice;
    String restaurant, menu;
    int portion, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_pesanan);
        tvRestaurant =(TextView)findViewById(R.id.tv_restaurant);
        tvMenu = (TextView)findViewById(R.id.tv_menu);
        tvPortion = (TextView)findViewById(R.id.tv_portion);
        tvPrice = (TextView)findViewById(R.id.tv_price);

        Intent intent = getIntent();
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion",0);
        price = intent.getIntExtra("price",0);
        //untuk mengisi komponen dengan data
        tvRestaurant.setText(restaurant);
        tvMenu.setText(menu);
        tvPortion.setText(""+portion);
        tvPrice.setText("Rp." +price);

        Toast toast = null;
        if(price < 65000){
           toast= Toast.makeText(getApplicationContext(),"Makan disini aja",Toast.LENGTH_SHORT);
        }else{
            toast = Toast.makeText(getApplicationContext(),"Jangan makan disini",Toast.LENGTH_SHORT);
        }
        toast.show();


    }
}

