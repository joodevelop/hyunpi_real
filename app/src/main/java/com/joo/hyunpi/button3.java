package com.joo.hyunpi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class button3 extends AppCompatActivity {

    private static final String TAG = "Dd";
    private GridAdapter gridadapter;


    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);


        List<Integer> imageList2 = new ArrayList<>();
        List<String> listTitle2 = new ArrayList<>();

        RecyclerView recyclerView2 = findViewById(R.id.button3);


        GridLayoutManager gridlayoutManager = new GridLayoutManager(this,2);
        recyclerView2.setLayoutManager(gridlayoutManager);
        gridadapter = new GridAdapter(this, listTitle2, imageList2);
        recyclerView2.setAdapter(gridadapter);


        listTitle2.add("CGV");
        listTitle2.add("메가박스");
        listTitle2.add("롯데시네마");
        listTitle2.add("이디야");
        listTitle2.add("스타벅스");
        listTitle2.add("투썸플레이스");

        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);



    }




}

