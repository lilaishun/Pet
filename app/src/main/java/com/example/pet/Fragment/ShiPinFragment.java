package com.example.pet.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pet.R;
import com.example.pet.adapter.DingyueAdapter;
import com.example.pet.adapter.HomeLingshiAdapter;
import com.example.pet.adapter.MemgXinAdapter;
import com.example.pet.adapter.SpacesItemDecoration;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ShiPinFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState){
        View view=inflater .inflate(R.layout .shipin_fragment_layout  ,container,false) ;
initView(view);
        return view;
    }

    private void initView(View view) {
        RecyclerView shipin_Ry = view.findViewById(R.id.shipin_Ry);

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            strings.add(i+"");
        }
        HomeLingshiAdapter memgXinAdapter = new HomeLingshiAdapter(getContext(),strings);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        shipin_Ry.setLayoutManager(linearLayoutManager);
        shipin_Ry.addItemDecoration(new SpacesItemDecoration(15));
        shipin_Ry.setAdapter(memgXinAdapter);

    }
}
