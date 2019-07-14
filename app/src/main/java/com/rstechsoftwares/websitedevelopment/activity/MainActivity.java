package com.rstechsoftwares.websitedevelopment.activity;

import android.Manifest;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.glide.slider.library.SliderLayout;
import com.glide.slider.library.SliderTypes.DefaultSliderView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.ExpandableDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.rstechsoftwares.websitedevelopment.Constants;
import com.rstechsoftwares.websitedevelopment.OnRecyclerViewItemClickListener;
import com.rstechsoftwares.websitedevelopment.R;
import com.rstechsoftwares.websitedevelopment.adapter.TopicsListAdapter;
import com.rstechsoftwares.websitedevelopment.database.AppDatabase;
import com.rstechsoftwares.websitedevelopment.database.dao.UserDao;
import com.rstechsoftwares.websitedevelopment.database.entity.Slider;
import com.rstechsoftwares.websitedevelopment.database.entity.User;
import com.rstechsoftwares.websitedevelopment.fragment.MentorFragment;
import com.rstechsoftwares.websitedevelopment.model.Topic;
import com.rstechsoftwares.websitedevelopment.util.DrawerUtil;
import com.rstechsoftwares.websitedevelopment.viewmodel.SlidersViewModel;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    private SliderLayout slider;
    private Toolbar toolbar;
    private RecyclerView basicsRV, advancedRV, angularRV, cmsRV;
    private TopicsListAdapter basicsAdapter, advancedAdapter, angularAdapter, cmsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);


            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.INTERNET}, 111);

                MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");
                AdView m=findViewById(R.id.adView);
                AdRequest adRequest=new AdRequest.Builder().addTestDevice("0B7011B7FA0861821F8B9A8602FA9E86").build();
                m.loadAd(adRequest);
                m.setAdListener(new AdListener(){
                    @Override
                    public void onAdLoaded() {
                        super.onAdLoaded();
                        m.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAdFailedToLoad(int i) {
                        super.onAdFailedToLoad(i);
                    m.setVisibility(View.GONE);

                    }
                });

               }
        }
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
        basicsList.add(new Topic("https://web.dev/images/social.png", "Introduction"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Basics"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Styles"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Formatting"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML CSS"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Links"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Images"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Tables"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Lists"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Blocks"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Layout"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML IFrames"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Colors"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "HTML Javascript"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "Javascript Condition"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "CSS Responsive"));
        basicsList.add(new Topic("https://web.dev/images/social.png", "Try yourself editor"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Lightbox"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Filter List"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Filter Table"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Progress Bar"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Tooltip"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Hov Dropdown"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Popups"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Click Dropdown"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "TODO List"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Loaders"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Menu Icon"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Accordion"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Contact Chips"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "JS Animation"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Full Screen Navigation"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Side Navigation"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Icon Bar"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Responsive Table"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Login Form"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Parallax"));
        advancedList.add(new Topic("https://web.dev/images/social.png", "Toggle Switch"));
        angularList.add(new Topic("https://web.dev/images/social.png", "Introduction"));
        angularList.add(new Topic("https://web.dev/images/social.png", "AngularJS Expressions"));
        angularList.add(new Topic("https://web.dev/images/social.png", "AngularJS Model"));
        angularList.add(new Topic("https://web.dev/images/social.png", "AngularJS Controller"));
        angularList.add(new Topic("https://web.dev/images/social.png", "AngularJS Scopes"));
        angularList.add(new Topic("https://web.dev/images/social.png", "AngularJS Filters"));
        angularList.add(new Topic("https://web.dev/images/social.png", "AngularJS Select"));
        angularList.add(new Topic("https://web.dev/images/social.png", "AngularJS Events"));
        angularList.add(new Topic("https://web.dev/images/social.png", "AngularJS API"));
        angularList.add(new Topic("https://web.dev/images/social.png", "AngularJS Animation"));
        cmsList.add(new Topic("https://web.dev/images/social.png", "Wordpress Tutorial"));
        cmsList.add(new Topic("https://web.dev/images/social.png", "Joomla Tutorial"));
        cmsList.add(new Topic("https://web.dev/images/social.png", "Drupal Tutorial"));
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
