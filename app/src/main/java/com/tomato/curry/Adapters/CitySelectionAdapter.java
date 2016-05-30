package com.tomato.curry.Adapters;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tomato.curry.R;
import java.util.ArrayList;


public class CitySelectionAdapter extends RecyclerView.Adapter<CitySelectionAdapter.ViewHolder> {
    private ArrayList<String> mDataset =new ArrayList<>();


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public Button mbutton;
        public ViewHolder(View v) {
            super(v);
            mbutton = (Button) v.findViewById(R.id.list_item);
        }
    }


    public CitySelectionAdapter(ArrayList<String> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public CitySelectionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_selection_row_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mbutton.setText(mDataset.get(position));
        if(Build.VERSION.SDK_INT <21){
            holder.mbutton.setBackgroundColor(Color.WHITE);
        }

    }


    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}