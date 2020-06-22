package com.example.androidfinally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();
        String[] shop_value=intent.getStringArrayExtra("shop");
        ImageView img=findViewById(R.id.map);
        img.setImageLevel(Integer.parseInt(shop_value[4]));
        TextView shop_name=findViewById(R.id.shop_name);
        shop_name.setText("店名："+shop_value[0]);
        TextView shop_menu=findViewById(R.id.menu);
        shop_menu.setText("菜單："+shop_value[1]);
        TextView shop_address=findViewById(R.id.address);
        shop_address.setText("地址："+shop_value[2]);
        TextView shop_tag=findViewById(R.id.tag);
        shop_tag.setText("類別："+shop_value[3]);
    }

    public void Return(View view) {
        finish();
    }
}
