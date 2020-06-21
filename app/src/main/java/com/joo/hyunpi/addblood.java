package com.joo.hyunpi;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class addblood extends AppCompatActivity {

    public void ButtonClick2(View v) {
        Toast.makeText(getApplicationContext(), "관리자 PIN번호를 확인해 주세요.", Toast.LENGTH_LONG).show();
    }



    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addblood);
    }
}