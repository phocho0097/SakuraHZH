package com.example.sakurahzh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView tvUserNameLable,tvUserAddressLable,tvUserPhoneLable,
             tvUserTotalItemLable,tvUserTotalPrice,tvUserOrderItem;

    Button btnConfirmOrder;
    Toolbar tbConfirmOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConfirmOrder=findViewById(R.id.btnConfirmOrder);



        btnConfirmOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,OrderSuccess.class);
                startActivity(i);
            }
        });

    }
}
