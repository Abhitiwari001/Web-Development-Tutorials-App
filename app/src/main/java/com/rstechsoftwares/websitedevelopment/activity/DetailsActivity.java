package com.rstechsoftwares.websitedevelopment.activity;

import android.os.Build;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.rstechsoftwares.websitedevelopment.Constants;
import com.rstechsoftwares.websitedevelopment.R;
import com.rstechsoftwares.websitedevelopment.fragment.AboutDeveloperFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AccordionFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsAnimationFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsApiFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsControllerFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsEventsFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsExpressionsFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsFiltersFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsIntroductionFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsModelFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsScopesFragment;
import com.rstechsoftwares.websitedevelopment.fragment.AngularJsSelectFragment;
import com.rstechsoftwares.websitedevelopment.fragment.ClickDropdownFragment;
import com.rstechsoftwares.websitedevelopment.fragment.ContactChipsFragment;
import com.rstechsoftwares.websitedevelopment.fragment.CssResponsiveFragment;
import com.rstechsoftwares.websitedevelopment.fragment.DrupalFragment;
import com.rstechsoftwares.websitedevelopment.fragment.FilterListFragment;
import com.rstechsoftwares.websitedevelopment.fragment.FilterTableFragment;
import com.rstechsoftwares.websitedevelopment.fragment.FullScreenNavigationFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HovDropdownFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlBasicsFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlBlocksFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlColorsFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlCssFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlFormattingFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlIFramesFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlImagesFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlJavascriptFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlLayoutFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlLinksFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlListsFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlStylesFragment;
import com.rstechsoftwares.websitedevelopment.fragment.HtmlTablesFragment;
import com.rstechsoftwares.websitedevelopment.fragment.IconBarFragment;
import com.rstechsoftwares.websitedevelopment.fragment.IntroductionFragment;
import com.rstechsoftwares.websitedevelopment.fragment.JSAnimationFragment;
import com.rstechsoftwares.websitedevelopment.fragment.JavascriptConditionFragment;
import com.rstechsoftwares.websitedevelopment.fragment.JoomlaFragment;
import com.rstechsoftwares.websitedevelopment.fragment.LightboxFragment;
import com.rstechsoftwares.websitedevelopment.fragment.LoadersFragment;
import com.rstechsoftwares.websitedevelopment.fragment.LoginFormFragment;
import com.rstechsoftwares.websitedevelopment.fragment.MentorFragment;
import com.rstechsoftwares.websitedevelopment.fragment.MenuIconFragment;
import com.rstechsoftwares.websitedevelopment.fragment.ParallaxFragment;
import com.rstechsoftwares.websitedevelopment.fragment.PopupsFragment;
import com.rstechsoftwares.websitedevelopment.fragment.ProgressBarFragment;
import com.rstechsoftwares.websitedevelopment.fragment.ResponsiveTableFragment;
import com.rstechsoftwares.websitedevelopment.fragment.SideNavigationFragment;
import com.rstechsoftwares.websitedevelopment.fragment.TodoListFragment;
import com.rstechsoftwares.websitedevelopment.fragment.ToggleSwitchFragment;
import com.rstechsoftwares.websitedevelopment.fragment.TooltipFragment;
import com.rstechsoftwares.websitedevelopment.fragment.TryYourselfFragment;
import com.rstechsoftwares.websitedevelopment.fragment.WordpressFragment;
import com.rstechsoftwares.websitedevelopment.util.DrawerUtil;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerUtil.getDrawer(this, toolbar);
        long val = getIntent().getLongExtra(Constants.DETAILS_SCREEN_KEY, 0);
        loadFragment(val);
    }

    /**
     * Loads appropriate fragment based on value received
     *
     * @param value
     */
    private void loadFragment(long value) {

        if (value == 0) {
            getSupportActionBar().setTitle("About Developer");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AboutDeveloperFragment())
                    .commit();
        } else if (value == 5) {
            getSupportActionBar().setTitle("Mentor");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new MentorFragment())
                    .commit();
        } else if (value == 101) {
            getSupportActionBar().setTitle("Introduction");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new IntroductionFragment())
                    .commit();
        } else if (value == 102) {
            getSupportActionBar().setTitle("HTML Basics");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlBasicsFragment())
                    .commit();
        } else if (value == 103) {
            getSupportActionBar().setTitle("HTML Styles");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlStylesFragment())
                    .commit();
        } else if (value == 104) {
            getSupportActionBar().setTitle("HTML Formatting");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlFormattingFragment())
                    .commit();
        } else if (value == 105) {
            getSupportActionBar().setTitle("HTML CSS");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlCssFragment())
                    .commit();
        } else if (value == 106) {
            getSupportActionBar().setTitle("HTML Links");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlLinksFragment())
                    .commit();
        } else if (value == 107) {
            getSupportActionBar().setTitle("HTML Images");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlImagesFragment())
                    .commit();
        } else if (value == 108) {
            getSupportActionBar().setTitle("HTML Tables");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlTablesFragment())
                    .commit();
        } else if (value == 109) {
            getSupportActionBar().setTitle("HTML Lists");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlListsFragment())
                    .commit();
        } else if (value == 110) {
            getSupportActionBar().setTitle("HTML Blocks");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlBlocksFragment())
                    .commit();
        } else if (value == 111) {
            getSupportActionBar().setTitle("HTML Layout");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlLayoutFragment())
                    .commit();
        } else if (value == 112) {
            getSupportActionBar().setTitle("HTML IFrames");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlIFramesFragment())
                    .commit();
        } else if (value == 113) {
            getSupportActionBar().setTitle("HTML Colors");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlColorsFragment())
                    .commit();
        } else if (value == 114) {
            getSupportActionBar().setTitle("HTML Javascript");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HtmlJavascriptFragment())
                    .commit();
        } else if (value == 115) {
            getSupportActionBar().setTitle("Javascript Condition");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new JavascriptConditionFragment())
                    .commit();
        } else if (value == 116) {
            getSupportActionBar().setTitle("CSS Responsive");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new CssResponsiveFragment())
                    .commit();
        } else if (value == 117) {
            getSupportActionBar().setTitle("Try Yourself Editor");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new TryYourselfFragment())
                    .commit();
        } else if (value == 201) {
            getSupportActionBar().setTitle("Lightbox");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new LightboxFragment())
                    .commit();
        } else if (value == 202) {
            getSupportActionBar().setTitle("Filter List");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new FilterListFragment())
                    .commit();
        } else if (value == 203) {
            getSupportActionBar().setTitle("Filter Table");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new FilterTableFragment())
                    .commit();
        } else if (value == 204) {
            getSupportActionBar().setTitle("Progress Bar");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new ProgressBarFragment())
                    .commit();
        } else if (value == 205) {
            getSupportActionBar().setTitle("Tooltip");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new TooltipFragment())
                    .commit();
        } else if (value == 206) {
            getSupportActionBar().setTitle("Hov Dropdown");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new HovDropdownFragment())
                    .commit();
        } else if (value == 207) {
            getSupportActionBar().setTitle("Popups");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new PopupsFragment())
                    .commit();
        } else if (value == 208) {
            getSupportActionBar().setTitle("Click Dropdown");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new ClickDropdownFragment())
                    .commit();
        } else if (value == 209) {
            getSupportActionBar().setTitle("TODO List");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new TodoListFragment())
                    .commit();
        } else if (value == 210) {
            getSupportActionBar().setTitle("Loaders");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new LoadersFragment())
                    .commit();
        } else if (value == 211) {
            getSupportActionBar().setTitle("Menu Icon");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new MenuIconFragment())
                    .commit();
        } else if (value == 212) {
            getSupportActionBar().setTitle("Accordion");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AccordionFragment())
                    .commit();
        } else if (value == 213) {
            getSupportActionBar().setTitle("Contact Chips");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new ContactChipsFragment())
                    .commit();
        } else if (value == 214) {
            getSupportActionBar().setTitle("JS Animation");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new JSAnimationFragment())
                    .commit();
        } else if (value == 215) {
            getSupportActionBar().setTitle("Full Screen Navigation");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new FullScreenNavigationFragment())
                    .commit();
        } else if (value == 216) {
            getSupportActionBar().setTitle("Side Navigation");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new SideNavigationFragment())
                    .commit();
        } else if (value == 217) {
            getSupportActionBar().setTitle("Icon Bar");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new IconBarFragment())
                    .commit();
        } else if (value == 218) {
            getSupportActionBar().setTitle("Responsive Table");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new ResponsiveTableFragment())
                    .commit();
        } else if (value == 219) {
            getSupportActionBar().setTitle("Login Form");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new LoginFormFragment())
                    .commit();
        } else if (value == 220) {
            getSupportActionBar().setTitle("Parallax");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new ParallaxFragment())
                    .commit();
        } else if (value == 221) {
            getSupportActionBar().setTitle("Toggle Switch");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new ToggleSwitchFragment())
                    .commit();
        } else if (value == 301) {
            getSupportActionBar().setTitle("Angular Introduction");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsIntroductionFragment())
                    .commit();
        } else if (value == 302) {
            getSupportActionBar().setTitle("Angular JS Expressions");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsExpressionsFragment())
                    .commit();
        } else if (value == 303) {
            getSupportActionBar().setTitle("Angular JS Model");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsModelFragment())
                    .commit();
        } else if (value == 304) {
            getSupportActionBar().setTitle("Angular JS Controller");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsControllerFragment())
                    .commit();
        } else if (value == 305) {
            getSupportActionBar().setTitle("Angular JS Scopes");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsScopesFragment())
                    .commit();
        } else if (value == 306) {
            getSupportActionBar().setTitle("Angular JS Filters");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsFiltersFragment())
                    .commit();
        } else if (value == 307) {
            getSupportActionBar().setTitle("Angular JS Select");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsSelectFragment())
                    .commit();
        } else if (value == 308) {
            getSupportActionBar().setTitle("Angular JS Events");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsEventsFragment())
                    .commit();
        } else if (value == 309) {
            getSupportActionBar().setTitle("Angular JS API");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsApiFragment())
                    .commit();
        } else if (value == 310) {
            getSupportActionBar().setTitle("Angular Js Animation");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new AngularJsAnimationFragment())
                    .commit();
        } else if (value == 401) {
            getSupportActionBar().setTitle("Wordpress");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new WordpressFragment())
                    .commit();
        } else if (value == 402) {
            getSupportActionBar().setTitle("Joomla");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new JoomlaFragment())
                    .commit();
        } else if (value == 403) {
            getSupportActionBar().setTitle("Drupal");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_container_frame, new DrupalFragment())
                    .commit();
        }


    }
}
