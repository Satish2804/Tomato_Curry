package com.tomato.curry;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.tomato.curry.Adapters.SaloonListAdapter;

import java.util.ArrayList;

public class SaloonList extends AppCompatActivity {
    private ImageView iv_back, iv_app_logo, iv_direction;
    private ArrayList<Integer> banner_imgs;
    private String gender;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;
    private SaloonListAdapter saloonListAdapter;
    private int[] bannerpics_men = {R.drawable.naturals_lounge, R.drawable.green_trends, R.drawable.jawed_habib, R.drawable.naturals2, R.drawable.eemos, R.drawable.larken, R.drawable.chandu_s, R.drawable.cut_cut, R.drawable.gokul_sri, R.drawable.mrchange, R.drawable.voguefamilysalon};
    private int[] bannerpics_women = {R.drawable.naturals_lounge, R.drawable.green_trends, R.drawable.jawed_habib, R.drawable.naturals2, R.drawable.eemos, R.drawable.larken, R.drawable.chaitu_s, R.drawable.chandu_s, R.drawable.clouds_nine_women, R.drawable.missnmisses};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saloon_list);
        gender = getIntent().getStringExtra("gender");
        iv_app_logo = (ImageView) findViewById(R.id.app_logo);
        iv_direction = (ImageView) findViewById(R.id.ivdirection);
        iv_back = (ImageView) findViewById(R.id.ivback);
        banner_imgs = new ArrayList<>();
        mRecyclerView = (RecyclerView) findViewById(R.id.saloon_list);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        iv_app_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SaloonList.this, CitySelection.class));
                finish();
            }
        });
        if (gender.equalsIgnoreCase("men")) {
            for (int i = 0; i < bannerpics_men.length; i++) {
                banner_imgs.add(bannerpics_men[i]);
            }
            saloonListAdapter = new SaloonListAdapter(banner_imgs);

        } else {
            for (int i = 0; i < bannerpics_women.length; i++) {
                banner_imgs.add(bannerpics_women[i]);
            }
            saloonListAdapter = new SaloonListAdapter(banner_imgs);

        }
        mRecyclerView.setAdapter(saloonListAdapter);
        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(SaloonList.this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                final Intent intent = new Intent(SaloonList.this, SaloonSelection.class);
                switch (position) {
                    case 0:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {

                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 1:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 2:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 3:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 4:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 5:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 6:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 7:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 8:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 9:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 10:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                }
            }
        }));

    }
}
