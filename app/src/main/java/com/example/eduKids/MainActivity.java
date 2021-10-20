package com.example.eduKids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class   MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton animals = (ImageButton) findViewById(R.id.animals);
        ImageButton alphabets = (ImageButton) findViewById(R.id.alphabets);
        ImageButton fruits = (ImageButton) findViewById(R.id.fruits);


        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Animals.class);
                view.getContext().startActivity(intent);}
        });

        alphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), alphabets.class);
                view.getContext().startActivity(intent);}
        });

        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), fruits.class);
                view.getContext().startActivity(intent);}
        });
    }
}