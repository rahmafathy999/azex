package com.example.session1;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */

public class frag1 extends Fragment {
    private static String key = "names";
    private String name;

public static frag1 newInstance(String name){
    Bundle bundle=new Bundle();
    bundle.putString(key,name);
    frag1 frag1=new frag1();
    frag1.setArguments(bundle);
    return frag1;
}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle=getArguments();
      name=  bundle.getString(key);

    }

    public frag1() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_frag1, container, false);
        TextView textView=v.findViewById(R.id.tv_frag);
        textView.setText(name);
        return v;
    }

}

