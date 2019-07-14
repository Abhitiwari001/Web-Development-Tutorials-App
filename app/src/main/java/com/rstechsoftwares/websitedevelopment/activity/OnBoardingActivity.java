package com.rstechsoftwares.websitedevelopment.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.firebase.ui.auth.AuthUI;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.rstechsoftwares.websitedevelopment.Constants;
import com.rstechsoftwares.websitedevelopment.adapter.OnBoardingViewPagerAdapter;
import com.rstechsoftwares.websitedevelopment.R;
import com.rstechsoftwares.websitedevelopment.database.AppDatabase;
import com.rstechsoftwares.websitedevelopment.database.dao.UserDao;
import com.rstechsoftwares.websitedevelopment.database.entity.User;
import com.rstechsoftwares.websitedevelopment.model.ScreenItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This activity is launched on first launch of the app
 * It gives a small introduction about the app
 */
public class OnBoardingActivity extends AppCompatActivity {

    public static final int RC_SIGN_IN = 123;

    private ViewPager screenPager;
    private OnBoardingViewPagerAdapter adapter;
    private TabLayout tabIndicator;
    private FloatingActionButton nextButton;
    private int position = 0;
    private MaterialButton buttonSignIn;
    private Animation buttonAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        // checking if this has been opened before or not
        if (hasOpened()) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }

        // boilerplate code
        tabIndicator = findViewById(R.id.tab_indicator);
        nextButton = findViewById(R.id.button_next);
        buttonSignIn = findViewById(R.id.button_get_started);
        screenPager = findViewById(R.id.onboarding_viewpager);
        buttonAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_animation);

        // modify content of onboarding screen here
        final List<ScreenItem> data = new ArrayList<>();
        data.add(new ScreenItem("Reach Target Faster", "Become a  Web Developer Expert By Practising daily", R.drawable.target));
        data.add(new ScreenItem("Top Content", "Content is delivered in easily understandable language,collected at a single screen", R.drawable.tcontent));
        data.add(new ScreenItem("Mentor Feature", "Unlock the mentor feature and clear your doubts from Experts at a Reasonable Price ", R.drawable.t));

        adapter = new OnBoardingViewPagerAdapter(this, data);
        screenPager.setAdapter(adapter);

        tabIndicator.setupWithViewPager(screenPager);

        // next floating action button on click handler
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get current position
                position = screenPager.getCurrentItem();

                // load next page
                if (position < data.size()) {
                    position++;
                    screenPager.setCurrentItem(position);
                }

                // check if that is the last page
                if (position == data.size() - 1) {
                    loadLastScreen();
                }

            }
        });

        // page indicator
        tabIndicator.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == data.size() - 1)
                    loadLastScreen();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        // Google sign in
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<AuthUI.IdpConfig> providers = Arrays.asList(new AuthUI.IdpConfig.GoogleBuilder().build());
                startActivityForResult(AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .build(), RC_SIGN_IN);
            }
        });
    }

    // Handle sign in result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            //if (resultCode == RESULT_OK) {
                // sign in successful
                //FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                //String name = user.getDisplayName();
                //String email = user.getEmail();
                //String photo = user.getPhotoUrl().toString();
                User user1 = new User();
                user1.name = "Sanjeev";
                user1.image = "www.google.com";
                user1.email = "thedevelopersanjeev@gmail.com";
                // add user details to database
                AppDatabase database = AppDatabase.getInstance(this);
                UserDao userDao = database.userDao();
                userDao.insertUser(user1);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                savePreferences();
                finish();

        }
    }

    /**
     * This method checks if OnBoardingActivity has been launched before or not
     * It uses shared preferences.
     *
     * @return boolean
     */
    private boolean hasOpened() {
        SharedPreferences preferences = getApplicationContext().getSharedPreferences(Constants.PREFERENCES_FILE_NAME, MODE_PRIVATE);
        return preferences.getBoolean(Constants.KEY_IS_ONBOARDING_DONE, false);
    }

    /**
     * Save the result after sign in is successful
     */
    private void savePreferences() {
        SharedPreferences preferences = getApplicationContext().getSharedPreferences(Constants.PREFERENCES_FILE_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(Constants.KEY_IS_ONBOARDING_DONE, true);
        editor.commit();
    }

    /**
     * Loads last screen of OnBoardingScreen
     * Hides next button and shows sign in button
     */
    private void loadLastScreen() {
        buttonSignIn.setVisibility(View.VISIBLE);
        nextButton.setVisibility(View.INVISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);
        buttonSignIn.setAnimation(buttonAnimation);
    }
}
