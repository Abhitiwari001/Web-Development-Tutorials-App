package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.rstechsoftwares.websitedevelopment.R;

public class DrupalFragment extends Fragment implements RewardedVideoAdListener {
    private RewardedVideoAd mRewardedVideoAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_drupal, container, false);
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        TextView textView = rootView.findViewById(R.id.drupa);
        textView.setText("To Download Drupal visit http://drupal.org/project/drupal and click on the verison of drupal you\n" +
                "want and download it.\n" +
                "Log in to your hosting account's control panel and in File Manager, Navigate to your HTML\n" +
                "directory.\n" +
                "Upload your compressed .tar.gz or .zip file to the Html directory. Most of the Hosting service\n" +
                "\n" +
                "providers allows you to upload a compressed file and un-archive ('uncompress' or 'unzip') the file-\n" +
                "set on the server.\n" +
                "\n" +
                "Rename the folder from its current name: \"Drupal-X.X\" to the name you want to use to refer to\n" +
                "your site, such as \"mysite Name\"");

        TextView textView2 = rootView.findViewById(R.id.drupa2);
        textView2.setText("In order to set up your new site, it is necessary to be able to modify the settings.php file . By default\n" +
                "when you unarchive these files, only the default.settings.php file exists and the permissions are set\n" +
                "to Read Only.\n" +
                "In your Cpanel file manager navigate to the /sites/default directory, Select the default.settings.php\n" +
                "file (usually done by checking a box next to the file)Copy the file, naming the new copy\n" +
                "'settings.php'.\n" +
                "To Change the permission of the settings.php, In file manager select the file \"settings.php\" and click\n" +
                "on permissions. Add the permissions for the file to be written by the web server (i.e. web users). If\n" +
                "your system is asking you to use a numeric value to CHMOD the file you will want to use 666, this\n" +
                "will set the file to be written by anyone. Save your changes.");

        TextView textView3 = rootView.findViewById(R.id.drupa3);
        textView3.setText("You must create a new, empty database for Drupal to use. You must also add a user who has full\n" +
                "access to this newly created database.\n" +
                "From your control panel, open phpMyAdmin. In the Create new database field, type the name you\n" +
                "want to use for your new Drupal database and then click Create.\n" +
                "Click the Privileges tab and Click Add a new User.\n" +
                "In the User name field, type the username that you want to add (this will be the username for site to\n" +
                "access the database, not your own username).\n" +
                "In the drop-down menu beside the Host field, select Local. In the Password and Re-type fields, type\n" +
                "a password to use for the new user.\n" +
                "\n" +
                "In the \"Database for user\" section, select \"Grant all privileges\" on the database you just created.In\n" +
                "the \"Global privileges\" section, leave all of the global privileges checkboxes unselected. Click Go.");


        TextView textView4 = rootView.findViewById(R.id.drupa4);
        textView4.setText("Using your web browser, navigate to the base URL of your new website, e.g.\n" +
                "http://www.example.com. When you go to your new website, you should see the Drupal installation\n" +
                "page. The installation wizard will guide you through the process of setting up your Drupal website .\n" +
                "On the Select an installation profile page, select Standard. Click Save and continue.On the Choose\n" +
                "language page, select English. Click Save and continue.");


        TextView textView5 = rootView.findViewById(R.id.drupa5);
        textView5.setText("On the Database configuration page, select the type of database that you are using. Type the\n" +
                "database name, database username and database password (the same ones you used to set up your\n" +
                "database).\n" +
                "On the Configure site page, In the Site name field, type the name you want to give your site. In the\n" +
                "Site email address field, type the email address that automated messages from your Drupal site will\n" +
                "be sent from.\n" +
                "In the site maintenance account section, type a username, email address and password to use for the\n" +
                "maintenance account. In the server settings section, select a country from the list and then select a\n" +
                "time zone.\n" +
                "If desired, select Check for updates automatically and Receive email notifications (recommended to\n" +
                "keep your site's security up to date).Click Save and continue.\n" +
                "After completing all the above steps you will see installation complete page, click the Visit your\n" +
                "new site link. You should see a newly installed Drupal homepage, as shown in the screenshot below.");

        TextView textView6 = rootView.findViewById(R.id.drupa6);
        textView6.setText("After setting up the drupal the first thing you may want to do is change the boring \"My Site\" title.\n" +
                "To change the site name, go to \"Configuration\" -> \"Site Information\". In the Site Name field, enter\n" +
                "the name of your site. If you have a catchy slogan, you can type it into the Slogan field. This might\n" +
                "be your tag line, catch phrase or simply some details that better explain what your site is all about.");

        TextView textView7 = rootView.findViewById(R.id.drupa7);
        textView7.setText("You may want a different theme from the original theme that appears on installation. There are not\n" +
                "many choices that come with the stock installation. To find additional themes from the Drupal site,\n" +
                "navigate to the Appearance menu and then click Install New Theme. Click \"Themes\" and you will\n" +
                "be taken to the Themes section at Drupal.org. Filter to find themes that work with that version.\n" +
                "Quick tip: You can sort by Most Installed, Relevancy, Title and more. For example, if you wanted a\n" +
                "particular Theme, locate the link to the latest Drupal version, and right-click it to copy the URL\n" +
                "address. Back at the site, copy the address into the Install From a URL field box. Click Install. Then\n" +
                "click Enable Newly Installed to successfully change the theme");

        TextView textView8 = rootView.findViewById(R.id.drupa8);
        textView8.setText("One of the most viewed web pages on every site is the About me page. Web visitors intuitively want\n" +
                "to know what a site is about and who is behind the scenes. In this section we will see how you can\n" +
                "set up a simple page; such as About me. Simply navigate to \"Content\" -> \"Add Content\" -> \"Basic\n" +
                "Page\". Type \"About Us\" in the title and add relevant information in the body.\n" +
                "To get the About page to appear in the main menu, under Menu Settings check the box Provide A\n" +
                "Menu Link. Save the page and you should be able to see About Us in the main menu. To change the\n" +
                "order of the items, navigate to \"Structure\" -> \"Menus\" -> \"Main Menu\". The items can be shifted\n" +
                "around by grabbing the little crosses with the mouse and dragging them up or down.");

        TextView textView9 = rootView.findViewById(R.id.drupa9);
        textView9.setText("One of the Drupal's strengths is a large dedicated and supportive community. They have contributed\n" +
                "some excellent modules, often called \"contrib modules\" to the Drupal system for everyone to use.\n" +
                "You can find the modules at: https://www.drupal.org/download");

        TextView textView10 = rootView.findViewById(R.id.drupa10);
        textView10.setText("Download the zip or tar file. Extract that to your /sites/all/modules/{modulename} folder directory\n" +
                "of the Drupal installation on your webhost. To finish, you should enable the module in the\n" +
                "administration section of your site.");

        TextView textView11 = rootView.findViewById(R.id.drupa11);
        textView11.setText("To add admin menu module, First turn the existing \"Toolbar\" off. Then activate the Admin Menu\n" +
                "module which gives you cool drop-down menus of the entire admin area. This one module will save\n" +
                "you a ton of time as it saves you from having to load a ton of pages to get to the single admin\n" +
                "function you are looking for.");
        TextView textView12 = rootView.findViewById(R.id.drupa12);
        textView12.setText("Drupal 7 does not provide a default WYSIWYG text editor but Drupal 8 has WYSIWG as standard.\n" +
                "WYSISYG stands for What You See Is What You Get, which provides a visual HTML textarea\n" +
                "editor, similar to popular word processors, making text more visually appealing and easier to\n" +
                "format.\n" +
                "CKEditor is a popular solution to get WYSIWYG functionality in drupal 7. It was recently\n" +
                "improved to be faster and easier to use. To make CKEDitor work, after you install the Drupal\n" +
                "module, you must also download the standalone CKEditor from download section at CKEditor.com.\n" +
                "Then unpack those contents into the sites/all/modules/ckeditor/ckeditor directory on your Drupal\n" +
                "site.");

        TextView textView13 = rootView.findViewById(R.id.drupa13);
        textView13.setText("IMCE helps you add images to you posts. It is a browser and uploader that worked with CKEDitor\n" +
                "text editor. After installing IMCE and enabling it, go to \"Configure-> Content Authoring ->\n" +
                "\n" +
                "CKEditor -> Profiles -> Advanced -> Edit -> File Browser Settings\". Then select IMCE from the\n" +
                "dropdown menus for the link dialog window, image dialog window and flash dialog window and\n" +
                "Save the settings.");

        TextView textView14 = rootView.findViewById(R.id.drupa14);
        textView14.setText("Drupal's built-in Path module lets you create better URLs. Pathauto relieves the drudgery of doing\n" +
                "this on every post, especially if you are working with end users who may neglect this. You can\n" +
                "assign custom replacement patterns and user account page paths so the URLs match your SEO and\n" +
                "usability standards. However, Pathauto requires the Token module.");

        TextView textView15 = rootView.findViewById(R.id.drupa15);
        textView15.setText("Tokens are little sections of text that are placed via a placeholder system. With Drupal 7, much of\n" +
                "the functionality of the Token module has been written into Drupal core, but some module still\n" +
                "requires it.");

        TextView textView16 = rootView.findViewById(R.id.drupa16);
        textView16.setText("Quicktabs creates great tabbed views, nodes and blocks quickly and easily without writing custom\n" +
                "JavaScript. After installing and enabling the module, you'll find a Quicktabs selection under the\n" +
                "Structure menu.");

        TextView textView17 = rootView.findViewById(R.id.drupa17);
        textView17.setText("Drupal 8 is the latest and more advanced and capable than version 7, For developers and designers,\n" +
                "Drupal 8 has adopted much of the Symfony stack. This means that large parts of Symfony2 are in\n" +
                "the codebase, and themes now use the Twig templating language. Drupal 8 is architected to support\n" +
                "mobile-first initiatives, enabling responsive experiences across screens as well as supporting mobile\n" +
                "apps.\n" +
                "For site-builders, Drupal 8 will be significantly more capable than Drupal 7. The new version\n" +
                "includes many popular modules that were only available as add-on modules in Drupal 7. The hugely\n" +
                "popular Views module is now part of the Drupal 8 core, and so are fields such as Date, E-mail, Link\n" +
                "and Telephone Number.\n" +
                "For content-administrators, there's front-end editing, so you can click on almost any part of the site\n" +
                "and edit it without leaving the page.");
        return rootView;

    }
    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }
    @Override
    public void onRewarded(RewardItem reward) {
        Toast.makeText(getContext(), "onRewarded! currency: " + reward.getType() + "  amount: " +
                reward.getAmount(), Toast.LENGTH_SHORT).show();
        // Reward the user.
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {
        Toast.makeText(getContext(), "onRewardedVideoAdLeftApplication",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdClosed() {
        Toast.makeText(getContext(), "onRewardedVideoAdClosed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int errorCode) {
        Toast.makeText(getContext(), "onRewardedVideoAdFailedToLoad", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdLoaded() {
        mRewardedVideoAd.show();
    }

    @Override
    public void onRewardedVideoAdOpened() {
        Toast.makeText(getContext(), "onRewardedVideoAdOpened", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoStarted() {
        Toast.makeText(getContext(), "onRewardedVideoStarted", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoCompleted() {
        Toast.makeText(getContext(), "onRewardedVideoCompleted", Toast.LENGTH_SHORT).show();
    }
}
