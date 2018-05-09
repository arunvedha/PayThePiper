package com.example.android.paythepiper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActivityBackgroundColor(Color.parseColor("#7FE817"));
    }
    int n=0;int randoms;
    Random rand = new Random();
    // Generate random integers in range 0 to 999
    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
    public void random(View view) {
         randoms = rand.nextInt(100);
        generate(randoms);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.amount_paid_view);
        quantityTextView.setText("\u20B9" + number);
    }
    private void generate(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.random_price_view);
        quantityTextView.setText("\u20B9" + number);
    }
    public void one(View view) {
        n = n + 1;
        if(n==randoms)setActivityBackgroundColor(Color.parseColor("#43C6DB"));
        else setActivityBackgroundColor(Color.parseColor("#7FE817"));
        display(n);
    }
    public void two(View view) {
        n = n + 2;
        if(n==randoms)setActivityBackgroundColor(Color.parseColor("#43C6DB"));
        else setActivityBackgroundColor(Color.parseColor("#7FE817"));
        display(n);
    }
    public void five(View view) {
        n = n + 5;
        if(n==randoms)setActivityBackgroundColor(Color.parseColor("#43C6DB"));
        else setActivityBackgroundColor(Color.parseColor("#7FE817"));
        display(n);
    }
    public void ten(View view) {
        n = n + 10;
        if(n==randoms)setActivityBackgroundColor(Color.parseColor("#43C6DB"));
        else setActivityBackgroundColor(Color.parseColor("#7FE817"));
        display(n);
    }
    public void reset(View view) {
        n = 0;
        setActivityBackgroundColor(Color.parseColor("#7FE817"));
        display(n);
    }
}
