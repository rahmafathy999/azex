package com.example.session1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_main);
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Rahma");
        arrayList.add("abdo");
        arrayList.add("aya");
        arrayList.add("asmaa");
        arrayList.add("ahmed");
        arrayList.add("adel");
        RecAdapter n=new RecAdapter(arrayList, new RecListener() {
            @Override
            public void onClick(String name) {
              frag1 frag1= com.example.session1.frag1.newInstance(name);
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.container,frag1);
                ft.commit();
            }
        });
        recyclerView.setAdapter(n);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



}
