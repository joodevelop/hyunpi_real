package com.joo.hyunpi;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class button2 extends AppCompatActivity {

    private RecyclerAdapter adapter;

    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
    }
}