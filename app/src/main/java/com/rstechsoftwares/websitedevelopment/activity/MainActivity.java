package com.rstechsoftwares.websitedevelopment.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.glide.slider.library.SliderLayout;
import com.glide.slider.library.SliderTypes.DefaultSliderView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rstechsoftwares.websitedevelopment.Constants;
import com.rstechsoftwares.websitedevelopment.R;
import com.rstechsoftwares.websitedevelopment.adapter.TopicsListAdapter;
import com.rstechsoftwares.websitedevelopment.database.entity.Slider;
import com.rstechsoftwares.websitedevelopment.model.Topic;
import com.rstechsoftwares.websitedevelopment.util.DrawerUtil;
import com.rstechsoftwares.websitedevelopment.viewmodel.SlidersViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SliderLayout slider;
    private Toolbar toolbar;
    private RecyclerView basicsRV, advancedRV, angularRV, cmsRV;
    private TopicsListAdapter basicsAdapter, advancedAdapter, angularAdapter, cmsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slider = findViewById(R.id.images_slider);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        basicsRV = findViewById(R.id.basics_recycler_view);
        advancedRV = findViewById(R.id.advanced_recycler_view);
        angularRV = findViewById(R.id.angular_recycler_view);
        cmsRV = findViewById(R.id.cms_recycler_view);
        basicsRV.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        advancedRV.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        angularRV.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        cmsRV.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        basicsRV.setHasFixedSize(true);
        advancedRV.setHasFixedSize(true);
        angularRV.setHasFixedSize(true);
        cmsRV.setHasFixedSize(true);
        ArrayList<Topic> basicsList = new ArrayList<>();
        ArrayList<Topic> advancedList = new ArrayList<>();
        ArrayList<Topic> angularList = new ArrayList<>();
        ArrayList<Topic> cmsList = new ArrayList<>();
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "Introduction"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Basics"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Styles"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Formatting"));
        basicsList.add(new Topic("https://cdn.pixabay.com/photo/2017/08/05/11/16/logo-2582747_960_720.png", "HTML CSS"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Links"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Images"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Tables"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Lists"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Blocks"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Layout"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML IFrames"));
        basicsList.add(new Topic("https://www.mrwebmaster.it/img/cope_tax/2.jpg", "HTML Colors"));
        basicsList.add(new Topic("http://www.sclance.com/pngs/javascript-logo-png/javascript_logo_png_728049.png", "HTML Javascript"));
        basicsList.add(new Topic("http://www.sclance.com/pngs/javascript-logo-png/javascript_logo_png_728049.png", "Javascript Condition"));
        basicsList.add(new Topic("https://cdn.pixabay.com/photo/2017/08/05/11/16/logo-2582747_960_720.png", "CSS Responsive"));
        basicsList.add(new Topic("http://www.tiktakti.co.il/files/file/content/try_it_now.png", "Try yourself editor"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Lightbox"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Filter List"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Filter Table"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Progress Bar"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Tooltip"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Hov Dropdown"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Popups"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Click Dropdown"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "TODO List"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Loaders"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Menu Icon"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Accordion"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Contact Chips"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "JS Animation"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Full Screen Navigation"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Side Navigation"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Icon Bar"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Responsive Table"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Login Form"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Parallax"));
        advancedList.add(new Topic("https://www.acil.in/wp-content/uploads/2018/11/advanced-web-designing-banner.jpg", "Toggle Switch"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "Introduction"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "AngularJS Expressions"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "AngularJS Model"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "AngularJS Controller"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "AngularJS Scopes"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "AngularJS Filters"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "AngularJS Select"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "AngularJS Events"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "AngularJS API"));
        angularList.add(new Topic("https://www.logolynx.com/images/logolynx/01/017f96243fed45ea9b37ef8ab5f96740.png", "AngularJS Animation"));
        cmsList.add(new Topic("https://cdn.pixabay.com/photo/2016/11/09/08/58/wordpress-1810632_960_720.jpg", "Wordpress Tutorial"));
        cmsList.add(new Topic("https://docs.joomla.org/images/3/37/Joomla-3D-Vertical-logo-light-background-en.png", "Joomla Tutorial"));
        cmsList.add(new Topic("https://www.digitalpolygon.com/wp-content/uploads/2019/01/DrupalLogo.png", "Drupal Tutorial"));
        basicsAdapter = new TopicsListAdapter(basicsList);
        advancedAdapter = new TopicsListAdapter(advancedList);
        angularAdapter = new TopicsListAdapter(angularList);
        cmsAdapter = new TopicsListAdapter(cmsList);
        basicsRV.setAdapter(basicsAdapter);
        advancedRV.setAdapter(advancedAdapter);
        angularRV.setAdapter(angularAdapter);
        cmsRV.setAdapter(cmsAdapter);
        sliderSetUp();
        basicsAdapter.setOnItemClickListener(position -> {
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            long val = position + 101;
            intent.putExtra(Constants.DETAILS_SCREEN_KEY, val);
            startActivity(intent);
        });
        advancedAdapter.setOnItemClickListener(position -> {
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            long val = position + 201;
            intent.putExtra(Constants.DETAILS_SCREEN_KEY, val);
            startActivity(intent);
        });
        angularAdapter.setOnItemClickListener(position -> {
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            long val = position + 301;
            intent.putExtra(Constants.DETAILS_SCREEN_KEY, val);
            startActivity(intent);

        });
        cmsAdapter.setOnItemClickListener(position -> {
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            long val = position + 401;
            intent.putExtra(Constants.DETAILS_SCREEN_KEY, val);
            startActivity(intent);

        });
        DrawerUtil.getDrawer(this, toolbar);
    }

    private void sliderSetUp() {
        SlidersViewModel slidersViewModel;
        slidersViewModel = ViewModelProviders.of(this).get(SlidersViewModel.class);
        slidersViewModel.getSliders().observe(this, sliders -> {
            slider.removeAllSliders();
            for (Slider eachSlider : sliders) {
                DefaultSliderView temp = new DefaultSliderView(MainActivity.this);
                temp.image(eachSlider.sliderUrl).setProgressBarVisible(true);
                slider.addSlider(temp);
            }
        });

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("sliders");
        reference.addValueEventListener(new ValueEventListener() {
            List<Slider> tempSliders = new ArrayList<>(0);

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                slidersViewModel.removeAllSliders();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    String value = (String) snapshot.getValue();
                    Slider tempSlider = new Slider();
                    tempSlider.sliderUrl = value;
                    tempSliders.add(tempSlider);
                }
                slidersViewModel.insertAllSliders(tempSliders);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("TAG", databaseError.getMessage());
            }
        });

        slider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        slider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);

    }

    @Override
    protected void onStop() {
        slider.stopAutoCycle();
        super.onStop();
    }
}
