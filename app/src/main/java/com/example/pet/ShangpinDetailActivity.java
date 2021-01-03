package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.pet.adapter.MemgXinAdapter;
import com.example.pet.adapter.SpacesItemDecoration;
import com.example.pet.adapter.TaoCanAdapter;
import com.example.pet.adapter.TaoCanMoreAdapter;

import java.util.ArrayList;

public class ShangpinDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shangpin_detail);
        initView();
    }

    private void initView() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(i+"");
        }
        RecyclerView taocan_ry = findViewById(R.id.taocan_ry);
        TaoCanAdapter memgXinAdapter = new TaoCanAdapter(this,strings);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);

        taocan_ry.setLayoutManager(linearLayoutManager);
        taocan_ry.addItemDecoration(new SpacesItemDecoration(10));
        taocan_ry.setAdapter(memgXinAdapter);


        RecyclerView gengduo_ry = findViewById(R.id.gengduo_ry);
        TaoCanMoreAdapter taoCanMoreAdapter = new TaoCanMoreAdapter(this,strings);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);

        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);

        gengduo_ry.setLayoutManager(gridLayoutManager);
        gengduo_ry.addItemDecoration(new SpacesItemDecoration(10));
        gengduo_ry.setAdapter(taoCanMoreAdapter);
    }
}
