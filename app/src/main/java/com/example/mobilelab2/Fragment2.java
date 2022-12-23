package com.example.mobilelab2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {
    Fragment2Adapter adapter;
    List<String> items = new ArrayList<>();

    Fragment2(){
        super(R.layout.fragment2_layout);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2_layout, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);

        items.add("Абхазия");
        items.add("Азербайджан");
        items.add("Армения");
        items.add("Бангладеш");
        items.add("Бахрейн");
        items.add("Бруней");
        items.add("Вьетнам");
        items.add("Грузия");
        items.add("Индия");
        items.add("Индонезия");
        items.add("Камбоджа");
        items.add("Катар");
        items.add("Китай");
        items.add("Россия");
        items.add("Саудовская Аравия");
        items.add("Сирия");
        items.add("Таиланд");
        items.add("Япония");

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new Fragment2Adapter(this.getContext(), items);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
