package com.example.androidfinally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button breakfast_btn;
    private int break_amount;
    private ArrayList<String[]> breakfast=new ArrayList<String[]>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        breakfast_btn=findViewById(R.id.breakfast);
        setBreakfast(breakfast);
    }

    public void setBreakfast(ArrayList<String[]> breakfast) {
        String[] shop1={"美而美","蛋餅、漢堡與三明治","","早餐","0"};
        String[] shop2={"兩片吐司","蛋吐司系列","","早餐","1"};
        String[] shop3={"永和豆漿大王","燒餅油條與豆漿","","早餐","2"};
        String[] shop4={"早安美芝城","蛋餅、漢堡與三明治","","早餐","3"};
        break_amount=4;
        this.breakfast = breakfast;
        breakfast.add(shop1);
        breakfast.add(shop2);
        breakfast.add(shop3);
        breakfast.add(shop4);
    }

    public void breakfast(View view) {
        int x=(int)(Math.random()*break_amount);
        Intent intent=new Intent(this,result.class);
        intent.putExtra("shop",breakfast.get(x));
        startActivity(intent);
    }

    public void lunch(View view) {
    }
}
