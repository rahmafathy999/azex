package com.example.session1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.recViewHolder> {
    ArrayList<String> arrayList;
    RecListener recListener;
    

    public RecAdapter(ArrayList<String> arrayList,RecListener recListener) {

        this.arrayList = arrayList;
        this.recListener = recListener;
    }

    @NonNull

    @Override

    public recViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recy,null,false);
        return new recViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull recViewHolder holder, int position) {
holder.tv.setText(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class recViewHolder extends RecyclerView.ViewHolder{
TextView tv;
        public recViewHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv_rec);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
recListener.onClick(tv.getText().toString());
                }
            });
        }
    }

}
