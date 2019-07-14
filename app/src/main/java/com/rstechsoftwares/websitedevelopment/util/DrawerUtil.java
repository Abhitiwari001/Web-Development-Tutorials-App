package com.rstechsoftwares.websitedevelopment.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

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
import com.rstechsoftwares.websitedevelopment.R;
import com.rstechsoftwares.websitedevelopment.activity.DetailsActivity;
import com.rstechsoftwares.websitedevelopment.activity.MainActivity;
import com.rstechsoftwares.websitedevelopment.database.AppDatabase;
import com.rstechsoftwares.websitedevelopment.database.dao.UserDao;
import com.rstechsoftwares.websitedevelopment.database.entity.User;

public class DrawerUtil {

    public static void getDrawer(final Activity activity, Toolbar toolbar) {

        AppDatabase database = AppDatabase.getInstance(activity.getApplicationContext());
        UserDao dao = database.userDao();
        User user = dao.getUser();
        String email = user.email;
        String name = user.name;
        String image = user.image;

        AccountHeader account = new AccountHeaderBuilder()
                .withActivity(activity)
                .addProfiles(
                        new ProfileDrawerItem()
                                .withName(name)
                                .withEmail(email)
                                .withIcon(image)
                )
                .withSelectionListEnabledForSingleProfile(false)
                .build();

        PrimaryDrawerItem homeItem = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("Home")
                .withIcon(activity.getResources()
                        .getDrawable(R.drawable.nav_icon_home));

        PrimaryDrawerItem rateItem = new PrimaryDrawerItem()
                .withIdentifier(2)
                .withName("Rate this app")
                .withIcon(activity.getResources()
                        .getDrawable(R.drawable.nav_icon_rate));

        PrimaryDrawerItem shareItem = new PrimaryDrawerItem()
                .withIdentifier(3)
                .withName("Share")
                .withIcon(activity.getResources()
                        .getDrawable(R.drawable.nav_icon_share));

        PrimaryDrawerItem moreAppsItem = new PrimaryDrawerItem()
                .withIdentifier(4)
                .withName("More Apps")
                .withIcon(activity.getResources()
                        .getDrawable(R.drawable.nav_icon_more));

        DividerDrawerItem dividerItem = new DividerDrawerItem();

        PrimaryDrawerItem mentorItem = new PrimaryDrawerItem()
                .withIdentifier(5)
                .withName("Mentor")
                .withIcon(activity.getResources()
                        .getDrawable(R.drawable.nav_icon_mentor));

        PrimaryDrawerItem aboutItem = new PrimaryDrawerItem()
                .withIdentifier(0)
                .withName("About Developer")
                .withIcon(activity.getResources()
                        .getDrawable(R.drawable.nav_icon_developer));

        ExpandableDrawerItem coursesA = new ExpandableDrawerItem()
                .withName("Basics")
                .withSelectable(false)
                .withSubItems(
                        new SecondaryDrawerItem()
                                .withName("Introduction")
                                .withLevel(2)
                                .withIdentifier(101),
                        new SecondaryDrawerItem()
                                .withName("HTML Basics")
                                .withLevel(2)
                                .withIdentifier(102),
                        new SecondaryDrawerItem()
                                .withName("HTML Styles")
                                .withLevel(2)
                                .withIdentifier(103),
                        new SecondaryDrawerItem()
                                .withName("HTML Formatting")
                                .withLevel(2)
                                .withIdentifier(104),
                        new SecondaryDrawerItem()
                                .withName("HTML CSS")
                                .withLevel(2)
                                .withIdentifier(105),
                        new SecondaryDrawerItem()
                                .withName("HTML Links")
                                .withLevel(2)
                                .withIdentifier(106),
                        new SecondaryDrawerItem()
                                .withName("HTML Images")
                                .withLevel(2)
                                .withIdentifier(107),
                        new SecondaryDrawerItem()
                                .withName("HTML Tables")
                                .withLevel(2)
                                .withIdentifier(108),
                        new SecondaryDrawerItem()
                                .withName("HTML Lists")
                                .withLevel(2)
                                .withIdentifier(109),
                        new SecondaryDrawerItem()
                                .withName("HTML Blocks")
                                .withLevel(2)
                                .withIdentifier(110),
                        new SecondaryDrawerItem()
                                .withName("HTML Layout")
                                .withLevel(2)
                                .withIdentifier(111),
                        new SecondaryDrawerItem()
                                .withName("HTML IFrames")
                                .withLevel(2)
                                .withIdentifier(112),
                        new SecondaryDrawerItem()
                                .withName("HTML Colors")
                                .withLevel(2)
                                .withIdentifier(113),
                        new SecondaryDrawerItem()
                                .withName("HTML Javascript")
                                .withLevel(2)
                                .withIdentifier(114),
                        new SecondaryDrawerItem()
                                .withName("Javascript Condition")
                                .withLevel(2)
                                .withIdentifier(115),
                        new SecondaryDrawerItem()
                                .withName("CSS Responsive")
                                .withLevel(2)
                                .withIdentifier(116),
                        new SecondaryDrawerItem()
                                .withName("Try Yourself Editor")
                                .withLevel(2)
                                .withIdentifier(117)
                );

        ExpandableDrawerItem coursesB = new ExpandableDrawerItem()
                .withName("Advanced")
                .withSelectable(false)
                .withSubItems(
                        new SecondaryDrawerItem()
                                .withName("Lightbox")
                                .withLevel(2)
                                .withIdentifier(201),
                        new SecondaryDrawerItem()
                                .withName("Filter List")
                                .withLevel(2)
                                .withIdentifier(202),
                        new SecondaryDrawerItem()
                                .withName("Filter Table")
                                .withLevel(2)
                                .withIdentifier(203),
                        new SecondaryDrawerItem()
                                .withName("Progress Bar")
                                .withLevel(2)
                                .withIdentifier(204),
                        new SecondaryDrawerItem()
                                .withName("Tooltip")
                                .withLevel(2)
                                .withIdentifier(205),
                        new SecondaryDrawerItem()
                                .withName("Hov Dropdown")
                                .withLevel(2)
                                .withIdentifier(206),
                        new SecondaryDrawerItem()
                                .withName("Popups")
                                .withLevel(2)
                                .withIdentifier(207),
                        new SecondaryDrawerItem()
                                .withName("Click Dropdown")
                                .withLevel(2)
                                .withIdentifier(208),
                        new SecondaryDrawerItem()
                                .withName("TODO List")
                                .withLevel(2)
                                .withIdentifier(209),
                        new SecondaryDrawerItem()
                                .withName("Loaders")
                                .withLevel(2)
                                .withIdentifier(210),
                        new SecondaryDrawerItem()
                                .withName("Menu Icon")
                                .withLevel(2)
                                .withIdentifier(211),
                        new SecondaryDrawerItem()
                                .withName("Accordion")
                                .withLevel(2)
                                .withIdentifier(212),
                        new SecondaryDrawerItem()
                                .withName("Contact Chips")
                                .withLevel(2)
                                .withIdentifier(213),
                        new SecondaryDrawerItem()
                                .withName("JS Animation")
                                .withLevel(2)
                                .withIdentifier(214),
                        new SecondaryDrawerItem()
                                .withName("Full Screen Navigation")
                                .withLevel(2)
                                .withIdentifier(215),
                        new SecondaryDrawerItem()
                                .withName("Side Navigation")
                                .withLevel(2)
                                .withIdentifier(216),
                        new SecondaryDrawerItem()
                                .withName("Icon Bar")
                                .withLevel(2)
                                .withIdentifier(217),
                        new SecondaryDrawerItem()
                                .withName("Responsive Table")
                                .withLevel(2)
                                .withIdentifier(218),
                        new SecondaryDrawerItem()
                                .withName("Login Form")
                                .withLevel(2)
                                .withIdentifier(219),
                        new SecondaryDrawerItem()
                                .withName("Parallax")
                                .withLevel(2)
                                .withIdentifier(220),
                        new SecondaryDrawerItem()
                                .withName("Toggle Switch")
                                .withLevel(2)
                                .withIdentifier(221)
                );

        ExpandableDrawerItem coursesC = new ExpandableDrawerItem()
                .withName("Angular JS")
                .withSelectable(false)
                .withSubItems(
                        new SecondaryDrawerItem()
                                .withName("Introduction")
                                .withLevel(2)
                                .withIdentifier(301),
                        new SecondaryDrawerItem()
                                .withName("AngularJS Expressions")
                                .withLevel(2)
                                .withIdentifier(302),
                        new SecondaryDrawerItem()
                                .withName("AngularJS Model")
                                .withLevel(2)
                                .withIdentifier(303),
                        new SecondaryDrawerItem()
                                .withName("AngularJS Controller")
                                .withLevel(2)
                                .withIdentifier(304),
                        new SecondaryDrawerItem()
                                .withName("AngularJS Scopes")
                                .withLevel(2)
                                .withIdentifier(305),
                        new SecondaryDrawerItem()
                                .withName("AngularJS Filters")
                                .withLevel(2)
                                .withIdentifier(306),
                        new SecondaryDrawerItem()
                                .withName("AngularJS Select")
                                .withLevel(2)
                                .withIdentifier(307),
                        new SecondaryDrawerItem()
                                .withName("AngularJS Events")
                                .withLevel(2)
                                .withIdentifier(308),
                        new SecondaryDrawerItem()
                                .withName("AngularJS API")
                                .withLevel(2)
                                .withIdentifier(309),
                        new SecondaryDrawerItem()
                                .withName("AngularJS Animation")
                                .withLevel(2)
                                .withIdentifier(310)
                );

        ExpandableDrawerItem coursesD = new ExpandableDrawerItem()
                .withName("CMS Wordpress Joomla")
                .withSelectable(false)
                .withSubItems(
                        new SecondaryDrawerItem()
                                .withName("Wordpress Tutorial")
                                .withLevel(2)
                                .withIdentifier(401),
                        new SecondaryDrawerItem()
                                .withName("Joomla Tutorial")
                                .withLevel(2)
                                .withIdentifier(402),
                        new SecondaryDrawerItem()
                                .withName("Drupal Tutorial")
                                .withLevel(2)
                                .withIdentifier(403)
                );

        Drawer result = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(toolbar)
                .withAccountHeader(account)
                .withDisplayBelowStatusBar(true)
                .withTranslucentStatusBar(true)
                .withActionBarDrawerToggleAnimated(true)
                .withSelectedItem(-1)
                .addDrawerItems(
                        homeItem,
                        rateItem,
                        shareItem,
                        moreAppsItem,
                        dividerItem,
                        mentorItem,
                        dividerItem,
                        coursesA,
                        coursesB,
                        coursesC,
                        coursesD,
                        dividerItem,
                        aboutItem
                )
                .withOnDrawerItemClickListener((view, position, drawerItem) -> {
                    long i = drawerItem.getIdentifier();
                    if (i == 1) {
                        Intent intent = new Intent(view.getContext(), MainActivity.class);
                        activity.startActivity(intent);
                        // Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    } else if (i == 2) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en"));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_NEW_DOCUMENT | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        activity.startActivity(intent);
                        // Toast.makeText(MainActivity.this, "Rate", Toast.LENGTH_SHORT).show();
                    } else if (i == 3) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT, "Try out our new Web Development Tutorials Android App - RSTechnologies. Download Now - " + "https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en");
                        intent.setType("text/plain");
                        activity.startActivity(Intent.createChooser(intent, "Share to"));
                        // Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                    } else if (i == 4) {
                        // https://play.google.com/store/apps/developer?id=RSTech+Softwares
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=RSTech+Softwares&hl=en"));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_NEW_DOCUMENT | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        activity.startActivity(intent);
                        // Toast.makeText(MainActivity.this, "More", Toast.LENGTH_SHORT).show();
                    } else if (i >= 0) {
                        Intent intent = new Intent(view.getContext(), DetailsActivity.class);
                        intent.putExtra(Constants.DETAILS_SCREEN_KEY, i);
                        activity.startActivity(intent);
                    }
                    return false;
                })
                .build();

    }

}
