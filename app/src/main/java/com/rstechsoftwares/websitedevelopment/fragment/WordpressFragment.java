package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.rstechsoftwares.websitedevelopment.R;

public class WordpressFragment extends Fragment {
    private InterstitialAd mInterstitialAd;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_wordpress, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        TextView t= rootView.findViewById(R.id.wordpress11);
                t.setText("In some rare case (some hosting companies do not provide one-click-install for WordPress) you do not\n" +
                        "have the possibility to install WordPress automatically, look this manual guide below\n" +
                        "Download WordPress from here: http://wordpress.org/download.\n" +
                        "Create a new folder on your desktop and unzip WordPress in it.\n" +
                        "Look for a file named wp-config-sample.php and rename it to: wp-config.php.\n" +
                        "Now open the wp-config.php (with notepad for example) and fill the following lines:\n" +
                        "define(DB_NAME, database_name_here); Database name (if you do not know it, ask this from\n" +
                        "your hosting support) define(DB_USER, username_here); Your hosting username\n" +
                        "        define('DB_PASSWORD', 'password_here'); Your hosting password After you have filled the gaps,\n" +
                        "save the file.\n" +
                        "Now log into your hosting ftp (download FileZilla for that). The FTP address is usually\n" +
                        "ftp.yourdomain.com, username and password are the same that you used to register to your host.\n" +
                        "If there is any file named 'index' - delete it. After that upload all the files from your WordPress\n" +
                        "folder to your FTP server. You can use \"drag n drop function in FileZilla.\n" +
                        "Once you have completed the previous steps, go the URL: yourdomain.com/wp-admin/install.php");
        TextView t2=rootView.findViewById(R.id.wordpress15);
        t2.setText("Want to add a Home page, or an About Me page\n" +
                "1. Look along the sidebar in the WordPress Dashboard for Pages -> Add New.\n" +
                "2. Once you have clicked, you will find a screen that looks a lot like what you have maybe seen in\n" +
                "Microsoft Word. Add text, images and more to build the page you want, then save it when you're\n" +
                "done.");
        TextView t3=rootView.findViewById(R.id.wordpress16);
t3.setText("To add your new page to the navigation bar Menu\n" +
        "1. After creating the page, Save any changes you have made to the page by clicking Update\n" +
        "2. Click Appearance -> Menus in the sidebar of the WordPress Dashboard\n" +
        "3. Find the page you created and add it to the list by clicking the checkbox next to it and then 'Add\n" +
        "to Menu'.");
        TextView t4=rootView.findViewById(R.id.wordpress17);
                t4.setText("If you have a blog on your website, Posts will be where you turn to next. You can use different\n" +
                        "categories to group similar posts, If you want to add a blog to your website, you can use different\n" +
                        "categories and posts. Let's say you want to create a category named 'Blog'. To do so, simply add it\n" +
                        "to your menu and start making posts.");
        TextView t5=rootView.findViewById(R.id.wordpress18);
                t5.setText("The Page titles explain to searchers what your website is about, and they are also a big part of how\n" +
                        "search engines determine your rankings, so you want to be sure they have got the keywords you want\n" +
                        "to target the users. You should use a unique title on every page of your site.\n" +
                        "Taglines are added at the end of titles across every page.\n" +
                        "In order to change the title and tagline on your website, go to 'Settings -> General' and fill the\n" +
                        "desired title and tagline in the form");
        TextView t6=rootView.findViewById(R.id.wordpress19);
        t6.setText("A static page is a page that does not change. Unlike a blog, where the first new article will show up at\n" +
                "the top every time, a static page will show the same content every time someone visits the site.\n" +
                "1. Go to Settings -> Reading, Choose a static page that you have created. Front Page' denotes your\n" +
                "home page, 'Posts page' is the front page of your blog .\n" +
                "2.If you don't choose a static page on your own, WordPress will take your latest posts and start\n" +
                "showing them on your homepage");
        TextView t7=rootView.findViewById(R.id.wordpress20);
                t7.setText("Most WordPress themes have a sidebar on the right side in some cases it is on the left, If you want to\n" +
                        "get rid of the sidebar or edit out items you do not need like Categories, Meta and Archives, which\n" +
                        "are usually pointless, here is the procedure\n" +
                        "1. Go to 'Appearance -> Widgets' in the WordPress Dashboard.\n" +
                        "2. From the widgets menu, you can use drag n drop to add different boxes to your sidebar, or\n" +
                        "remove the items you don't want.");
        TextView t8=rootView.findViewById(R.id.wordpress7);
                t8.setText("Finding a domain name that is easy to type and simple is critical to online success.If you are making a\n" +
                        "website for your business, your domain name should match your company name, For example if\n" +
                        "you are a tyre replacement company you can choose Tyrerepair.com or tyrereplacement.com, If\n" +
                        "you're planning to set up a website for yourself, then YourName.com can be a great option.");
        return rootView;

    }
}
