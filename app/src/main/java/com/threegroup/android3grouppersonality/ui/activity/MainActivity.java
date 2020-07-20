package com.threegroup.android3grouppersonality.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.threegroup.android3grouppersonality.R;
import com.threegroup.android3grouppersonality.ui.fragment.HomeFragment;
import com.threegroup.android3grouppersonality.ui.fragment.MeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView ivHome,ivMe,ivHot,ivCollection;
    private HomeFragment homeFragment;
    private MeFragment meFragment;
/*    private HeatFragment heatFragment;
    private CollectionFragment collectionFragment;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ivHome = findViewById(R.id.ivHome);
        ivMe = findViewById(R.id.ivMe);
        ivHot=findViewById(R.id.ivHot);
        ivCollection=findViewById(R.id.ivCollection);
        ivHome.setOnClickListener(this);
        ivMe.setOnClickListener(this);
        ivHot.setOnClickListener(this);
        ivCollection.setOnClickListener(this);

        homeFragment = new HomeFragment();
        meFragment = new MeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.flcontent, homeFragment).commit();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivHome://新闻列表页面
                if (homeFragment == null) homeFragment = new HomeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.flcontent, homeFragment).commit();
                break;
            case R.id.ivMe://界面我
                if (meFragment == null) meFragment = new MeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.flcontent, meFragment).commit();
                break;
/*            case R.id.ivHot://界面热度
                if (heatFragment == null) heatFragment = new HeatFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.flcontent, heatFragment).commit();
                break;
            case R.id.ivCollection://界面热度
                if (collectionFragment == null) collectionFragment = new CollectionFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.flcontent, collectionFragment).commit();
                break;*/
        }
    }
}
