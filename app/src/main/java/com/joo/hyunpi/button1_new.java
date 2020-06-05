package com.joo.hyunpi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Objects;

public class button1_new extends AppCompatActivity {

    TextView textTitle ;

    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1_item);


        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        textTitle = findViewById(R.id.button1_1);



        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        textTitle.setText(title);
    }
}