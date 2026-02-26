package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityText = findViewById(R.id.text_cityName);
        Button backButton = findViewById(R.id.button_back);


        Intent intent = getIntent();
        String city = intent.getStringExtra(EXTRA_CITY_NAME);
        if (city == null) city = "";

        cityText.setText(city);

        backButton.setOnClickListener(v -> finish());
    }
}