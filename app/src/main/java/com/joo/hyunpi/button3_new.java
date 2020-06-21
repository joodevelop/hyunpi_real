package com.joo.hyunpi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Objects;

public class button3_new extends AppCompatActivity {

    TextView textTitle;

    public void ButtonClick(View v) {
        Toast.makeText(getApplicationContext(), "구매가 완료되었습니다.", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3_2);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        textTitle = findViewById(R.id.button3_3);


        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        textTitle.setText(title);


    }


}