package com.example.myapplication;

import static com.example.myapplication.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int red = Color.RED;
    int green = Color.GREEN;
    int yellow = Color.YELLOW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
    }

    public void One(View view) {
        View ground = findViewById(R.id.ground);
        ground.setBackgroundColor(red);
    }

    public void Two(View view){
        View ground = findViewById(R.id.ground);
        ground.setBackgroundColor(yellow);
    }

    public void Three(View view){
        View ground = findViewById(R.id.ground);
        ground.setBackgroundColor(green);
    }
}