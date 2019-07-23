package com.example.monirujjamanmusa.assignment2_recyclerview_volly_picaso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<MyItem> Mylist;
    private Context context;

    public MyAdapter(List<MyItem> mylist, Context context) {
        Mylist = mylist;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        MyViewHolder VH=new  MyViewHolder(v);

        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

        final MyItem myItemPosition=Mylist.get(position);
        myViewHolder.headText.setText(myItemPosition.getHead());
        myViewHolder.descText.setText(myItemPosition.getDesc());

        Picasso.get().load(myItemPosition.getImageUrl()).into(myViewHolder.imageView);



    }

    @Override
    public int getItemCount() {
        return Mylist.size();
    }
}
