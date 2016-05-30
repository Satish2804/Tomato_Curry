package com.tomato.curry.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.tomato.curry.R;

import java.util.ArrayList;


public class SameSaloonListAdapter extends RecyclerView.Adapter<SameSaloonListAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            mImageView = (ImageView) v.findViewById(R.id.saloon_banner);
        }
    }


    public SameSaloonListAdapter() {

    }

    @Override
    public SameSaloonListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.saloon_selection_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 10;
    }
}