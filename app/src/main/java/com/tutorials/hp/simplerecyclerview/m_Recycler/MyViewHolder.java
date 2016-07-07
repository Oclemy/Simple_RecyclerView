package com.tutorials.hp.simplerecyclerview.m_Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.simplerecyclerview.R;

/**
 * Created by Oclemy on 7/6/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView nameTxt;
    ItemClickListener itemClickListener;

    public MyViewHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }
}
