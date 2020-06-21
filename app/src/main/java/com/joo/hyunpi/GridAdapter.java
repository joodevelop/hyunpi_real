package com.joo.hyunpi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ItemViewHolder> {

    // adapter에 들어갈 list 입니다.
    List<String> listTitle2;
    List<Integer> imageList2;
    LayoutInflater inflater;

    public GridAdapter(Context ctx, List<String> listTitle2, List<Integer> imageList2) {
        this.imageList2 = imageList2;
        this.listTitle2 = listTitle2;
        this.inflater = LayoutInflater.from(ctx);

    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item2, parent, false);
        return new ItemViewHolder(view);
    }
    @Override
    public int getItemCount() {
        // RecyclerView의 총 개수 입니다.
        return imageList2.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.imageView2.setImageResource(imageList2.get(position));
        holder.textView4.setText(listTitle2.get(position));
        // Item을 하나, 하나 보여주는(bind 되는) 함수입니다.


    }

    // RecyclerView의 핵심인 ViewHolder 입니다.
    // 여기서 subView를 setting 해줍니다.
    class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView2;
        private TextView textView4;

        ItemViewHolder(View itemView) {
            super(itemView);

            imageView2 = itemView.findViewById(R.id.imageView2);
            textView4 = itemView.findViewById(R.id.textView3);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), button3_new.class);
                    intent.putExtra("listTitle", String.valueOf(listTitle2.get(getAdapterPosition())));
                    v.getContext().startActivity(intent);


                }

            });


        }


    }
}


