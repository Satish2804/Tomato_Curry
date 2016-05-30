package com.tomato.curry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CityOverview extends Activity {
    private ImageView ivback,ivapplogo,ivmen,ivwomen;
    private LinearLayout llComming_soon,llmen_women_selection;
    private Intent obIntent;
    private Integer city_image;
    private RelativeLayout rlrootlayout;
    private TextView city_title,city_description;
     String city_name,city_desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_overview);
        obIntent=getIntent();
        rlrootlayout=(RelativeLayout)findViewById(R.id.city_overview_root);
        city_title=(TextView)findViewById(R.id.city_title);
        city_description=(TextView)findViewById(R.id.city_description);
        llComming_soon=(LinearLayout)findViewById(R.id.comingsooon_layout);
        llmen_women_selection=(LinearLayout)findViewById(R.id.men_women_selection);
        city_name=obIntent.getStringExtra("city");
        city_image=obIntent.getIntExtra("image",0);
        city_desc=obIntent.getStringExtra("city_description");
        city_title.setText(city_name);
        city_description.setText(city_desc);
        rlrootlayout.setBackgroundResource(city_image);
        if(!city_name.equalsIgnoreCase("TIRUPATHI")){
            llmen_women_selection.setVisibility(View.GONE);
            llComming_soon.setVisibility(View.VISIBLE);
        }
        else{
            llmen_women_selection.setVisibility(View.VISIBLE);
        }
        ivback=(ImageView)findViewById(R.id.ivback);
        ivapplogo=(ImageView)findViewById(R.id.app_logo);
//        Drawable[] back=new Drawable[] {
//                FontIconDrawable.inflate(CityOverview.this, R.xml.ic_back)
//            };
//        ivback.setImageDrawable(back[0]);
        ivmen=(ImageView)findViewById(R.id.men);
        ivwomen=(ImageView)findViewById(R.id.women);
        ivmen.setOnClickListener(Onclickpic);
        ivwomen.setOnClickListener(Onclickpic);
        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ivapplogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    View.OnClickListener Onclickpic=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch(v.getId()){
                case R.id.men:
                    intent= new Intent(CityOverview.this, SaloonList.class);
                    intent.putExtra("gender","men" );
                    startActivity(intent);
                    break;

                case R.id.women:
                    intent= new Intent(CityOverview.this, SaloonList.class);
                    intent.putExtra("gender","women" );
                    startActivity(intent);
                    break;

            }

        }
    };
}
