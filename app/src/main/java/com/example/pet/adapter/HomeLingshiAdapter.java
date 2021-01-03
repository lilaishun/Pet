package com.example.pet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pet.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeLingshiAdapter extends RecyclerView.Adapter<HomeLingshiAdapter.MyHolder> {
private ArrayList<String> mList;
private Context mContext;
public HomeLingshiAdapter(){}
public HomeLingshiAdapter(Context context, ArrayList<String> list){
    this.mList=list;
    this.mContext=context;
}
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_shipin_item_layout, parent, false);
        MyHolder myHolder = new MyHolder(inflate);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

    public MyHolder(@NonNull View itemView) {
        super(itemView);

    }
}
}

