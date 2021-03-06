package com.tomato.curry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.tomato.curry.Adapters.SameSaloonListAdapter;

public class SaloonSelection extends AppCompatActivity {
    private  RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private SameSaloonListAdapter sameSaloonListAdapter;
    private ImageView ivback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saloon_selection);
        ivback=(ImageView)findViewById(R.id.ivback);
        mRecyclerView = (RecyclerView) findViewById(R.id.saloon_selection_list);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        sameSaloonListAdapter = new SameSaloonListAdapter();
        mRecyclerView.setAdapter(sameSaloonListAdapter);
        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}
