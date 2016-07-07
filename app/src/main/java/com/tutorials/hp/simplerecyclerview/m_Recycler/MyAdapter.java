package com.tutorials.hp.simplerecyclerview.m_Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.tutorials.hp.simplerecyclerview.R;

import java.util.ArrayList;

/**
 * Created by Oclemy on 7/6/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    ArrayList<String> languages;

    public MyAdapter(Context c, ArrayList<String> languages) {
        this.c = c;
        this.languages = languages;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        //BIND DATA
        holder.nameTxt.setText(languages.get(position));

        //ITEM CLICK
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                Toast.makeText(c, languages.get(pos), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return languages.size();
    }
}
