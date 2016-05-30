package com.tomato.curry;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tomato.curry.Adapters.CitySelectionAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CitySelection extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<String>myDataset;
    private TextView tvtitle;
    public String[]  array={"TIRUPATHI","NELLORE","CHENNAI","HYDERABAD","BANGALORE","VIJAYAWADA","VISAKAPATNAM"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_selection);
        tvtitle=(TextView)findViewById(R.id.tvtitle);
        mRecyclerView=(RecyclerView)findViewById(R.id.city_rview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        myDataset=new ArrayList<>();
        addData(myDataset);
        mAdapter = new CitySelectionAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(CitySelection.this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                final Intent intent= new Intent(CitySelection.this,CityOverview.class);
                switch (position){
                    case 0:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                intent.putExtra("city","TIRUPATHI");
                                intent.putExtra("city_description","The city which looks like a foot of god \nand the people are more blessed to have here.");
                                intent.putExtra("image",R.drawable.tpty);
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 1:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                intent.putExtra("city","NELLORE");
                                intent.putExtra("city_description","The city is located on the banks of the \nPenna river and it is blessed with Asia's \nbiggest Krishnapatnam port.");
                                intent.putExtra("image",R.drawable.nellore);
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 2:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                intent.putExtra("city","CHENNAI");
                                intent.putExtra("city_description","The city has the people who has strong \nenough dare to face any Natural \ncalamity. so, hail to Chennaities.");
                                intent.putExtra("image",R.drawable.chennai);
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 3:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                intent.putExtra("city","HYDERABAD");
                                intent.putExtra("city_description","The city which cant describe in a single \nword and can refer to the city of \nnight life, city of Biriyani,\ncity of Mughal heritage bla bla.");
                                intent.putExtra("image",R.drawable.hyd);
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 4:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                intent.putExtra("city","BANGALORE");
                                intent.putExtra("city_description","The proudest city of India which has the \nbiggest I.T hub and as well as known of city of Lamborghini.");
                                intent.putExtra("image",R.drawable.bangalore);
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 5:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                intent.putExtra("city","VIJAYAWADA");
                                intent.putExtra("city_description","One of the biggest bus station is located \nin this city and it is blessed with plenty of water resources here.");
                                intent.putExtra("image",R.drawable.vijayawada);
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                    case 6:
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                intent.putExtra("city","VISAKAPATNAM");
                                intent.putExtra("city_description","One of the most beautiful cities of India \nincludes hill stations, sea shores and \nplays a key role in Tollywood industry \nfor locations.");
                                intent.putExtra("image",R.drawable.visakapatnam);
                                startActivity(intent);

                            }
                        }, 200);
                        break;
                }
            }
        }));
    }

    private void addData(ArrayList<String> myDataset) {
       for(int i=0;i<array.length;i++){
           myDataset.add(array[i]);

       }

    }
}
