package com.joo.hyunpi;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class button2 extends AppCompatActivity {
    private View gifticon;

    private RecyclerAdapter adapter;

    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);

        gifticon = findViewById(R.id.gifticon);
        gifticon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(button2.this , gifticon.class);
                startActivity(intent); // 액티비티 이동.
            }

        });


    }
}