package com.example.androidfinally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button breakfast_btn;
    private Button lunch_btn;
    private Button dinner_btn;
    private Button drink_btn;
    private Button ltd_btn;
    private int break_amount;
    private int lunch_amount;
    private int dinner_amount;
    private int ltd_amount;
    private int drink_amount;
    private ArrayList<String[]> breakfast=new ArrayList<String[]>();
    private ArrayList<String[]> lunch=new ArrayList<String[]>();
    private ArrayList<String[]> dinner=new ArrayList<String[]>();
    private ArrayList<String[]> drink=new ArrayList<String[]>();
    private ArrayList<String[]> ltd=new ArrayList<String[]>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        breakfast_btn=findViewById(R.id.breakfast);
        lunch_btn=findViewById(R.id.lunch);
        dinner_btn=findViewById(R.id.dinner);
        drink_btn=findViewById(R.id.drink);
        ltd_btn=findViewById(R.id.later_than_dinner);
        setBreakfast(breakfast);
        setLunch(lunch);
        setDinner(dinner);
        setLtd(ltd);
        setDrink(drink);
    }

    private void setDrink(ArrayList<String[]> drink) {
        String[] shop1={"清心福全","珍珠奶茶","106台北市大安區市民大道三段136號","飲料","30"};
        String[] shop2={"搖立得","黑糖波霸撞奶","106台北市大安區建國南路一段40號","飲料","31"};
        String[] shop3={"Moonleaf月葉紅茶","紅茶","100台北市中正區忠孝東路二段134巷1號","飲料","32"};
        String[] shop4={"肯德基","蛋塔、炸雞與漢堡","100台北市中正區八德路一段64號","早餐、午餐、晚餐、飲料、消夜","4"};
        String[] shop5={"茶湯會","飲料","100台北市中正區八德路一段82巷9弄19號","飲料","33"};
        String[] shop6={"一芳水果茶","綠茶","100台北市中正區新生南路一段16-1號","飲料","34"};
        drink_amount=6;
        this.drink = drink;
        drink.add(shop1);
        drink.add(shop2);
        drink.add(shop3);
        drink.add(shop4);
        drink.add(shop5);
        drink.add(shop6);
    }

    private void setLtd(ArrayList<String[]> ltd) {
        String[] shop1={"喫上飲","雞排與炸物","106台北市大安區忠孝東路三段217巷2號號","消夜","40"};
        String[] shop2={"開始燒肉吧START YAKINIKU","燒肉","10653台北市大安區忠孝東路三段217巷3弄2號","消夜","41"};
        String[] shop3={"排行榜","炸物","106台北市大安區忠孝東路三段217巷2弄2-5號","消夜","42"};
        String[] shop4={"肯德基","蛋塔、炸雞與漢堡","100台北市中正區八德路一段64號","早餐、午餐、晚餐、飲料、消夜","4"};
        ltd_amount=4;
        this.ltd = ltd;
        ltd.add(shop1);
        ltd.add(shop2);
        ltd.add(shop3);
        ltd.add(shop4);
    }

    private void setDinner(ArrayList<String[]> dinner) {
        String[] shop1={"嵐迪義大利麵館","義大利麵與燉飯","100台北市中正區八德路一段82巷9弄1號","晚餐","20"};
        String[] shop2={"咖食堂","咖哩與丼飯","100台北市中正區八德路一段82巷9弄13號","午餐、晚餐","11"};
        String[] shop3={"銀記手擀刀切牛肉麵","炒飯與牛肉麵","100台北市中正區八德路一段82巷9弄15號","晚餐","22"};
        String[] shop4={"肯德基","蛋塔、炸雞與漢堡","100台北市中正區八德路一段64號","早餐、午餐、晚餐、飲料、消夜","4"};
        String[] shop5={"I'M PASTA","義大利麵","100台北市中正區八德路一段82巷9弄7號","晚餐","23"};
        String[] shop6={"垃圾(喇舌)麵","拉麵","100台北市中正區八德路一段82巷9弄","晚餐","21"};
        dinner_amount=6;
        this.dinner = dinner;
        dinner.add(shop1);
        dinner.add(shop2);
        dinner.add(shop3);
        dinner.add(shop4);
        dinner.add(shop5);
        dinner.add(shop6);
    }

    private void setLunch(ArrayList<String[]> lunch) {
        String[] shop1={"就是愛煎餅果子","飯糰與煎餅果子","100台北市中正區忠孝東路二段121巷26號","午餐","10"};
        String[] shop2={"咖食堂","咖哩與丼飯","100台北市中正區八德路一段82巷9弄13號","午餐、晚餐","11"};
        String[] shop3={"阿姐的碳烤三明治","碳烤三明治","100台北市中正區八德路一段82巷9弄10號","午餐","12"};
        String[] shop4={"肯德基","蛋塔、炸雞與漢堡","100台北市中正區八德路一段64號","早餐、午餐、晚餐、飲料、消夜","4"};
        String[] shop5={"獎老爹","牛肉麵與水餃","100台北市中正區臨沂街3巷","午餐","13"};
        lunch_amount=5;
        this.lunch = lunch;
        lunch.add(shop1);
        lunch.add(shop2);
        lunch.add(shop3);
        lunch.add(shop4);
        lunch.add(shop5);
    }

    public void setBreakfast(ArrayList<String[]> breakfast) {
        break_amount=5;
        String[] shop1={"美而美","蛋餅、漢堡與三明治","106台北市大安區忠孝東路三段217巷4弄2號","早餐","0"};
        String[] shop2={"兩片吐司","蛋吐司系列","106台北市大安區建國南路一段65巷5號號","早餐","1"};
        String[] shop3={"永和豆漿大王","燒餅油條與豆漿","10491台北市中山區渭水路2號","早餐","2"};
        String[] shop4={"早安美芝城","蛋餅、漢堡與三明治","106台北市大安區忠孝東路三段217巷8弄2號","早餐","3"};
        String[] shop5={"肯德基","蛋塔、炸雞與漢堡","100台北市中正區八德路一段64號","早餐、午餐、晚餐、飲料、消夜","4"};
        this.breakfast = breakfast;
        breakfast.add(shop1);
        breakfast.add(shop2);
        breakfast.add(shop3);
        breakfast.add(shop4);
        breakfast.add(shop5);
    }

    public void breakfast(View view) {
        int x=(int)(Math.random()*break_amount);
        Intent intent=new Intent(this,result.class);
        intent.putExtra("shop",breakfast.get(x));
        startActivity(intent);
    }

    public void lunch(View view) {
        int x=(int)(Math.random()*lunch_amount);
        Intent intent=new Intent(this,result.class);
        intent.putExtra("shop",lunch.get(x));
        startActivity(intent);
    }

    public void dinner(View view) {
        int x=(int)(Math.random()*dinner_amount);
        Intent intent=new Intent(this,result.class);
        intent.putExtra("shop",dinner.get(x));
        startActivity(intent);
    }

    public void later_than_dinner(View view) {
        int x=(int)(Math.random()*ltd_amount);
        Intent intent=new Intent(this,result.class);
        intent.putExtra("shop",ltd.get(x));
        startActivity(intent);
    }

    public void drink(View view) {
        int x=(int)(Math.random()*drink_amount);
        Intent intent=new Intent(this,result.class);
        intent.putExtra("shop",drink.get(x));
        startActivity(intent);
    }

    public void insert(View view) {

    }
}
