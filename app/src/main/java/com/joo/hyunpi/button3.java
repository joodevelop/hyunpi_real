package com.joo.hyunpi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class button3 extends AppCompatActivity {

    private static final String TAG = "Dd";
    private GridAdapter gridadapter;

    List<Integer> imageList2 = new ArrayList<>();
    List<String> listTitle2 = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_button3);

        init();


        getData();

    }
        private void init() {

            RecyclerView recyclerView2 = findViewById(R.id.button3);

            GridLayoutManager gridlayoutManager = new GridLayoutManager(this,2);
            recyclerView2.setLayoutManager(gridlayoutManager);
            gridadapter = new GridAdapter(this, listTitle2, imageList2);
            recyclerView2.setAdapter(gridadapter);

        }
    private void getData() {

        listTitle2.add("CGV(10HP)");
        listTitle2.add("메가박스(10HP)");
        listTitle2.add("롯데시네마(10HP)");
        listTitle2.add("이디야(6HP)");
        listTitle2.add("스타벅스(7HP)");
        listTitle2.add("투썸플레이스(7HP)");

        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);
        imageList2.add(R.drawable.common_google_signin_btn_icon_dark_normal);


    }


}














