package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rstechsoftwares.websitedevelopment.R;

import org.w3c.dom.Text;

public class JoomlaFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_joomla, container, false);
        TextView t1=rootView.findViewById(R.id.joomla1);
        t1.setText("Joomla is one of the largest and most famous FREE open source projects next to WordPress, With\n" +
                "origins all the way back to 2000, Joomla is responsible for many innovations in the PHP / MySQL\n" +
                "space that includes WordPress, Drupal, Magento and so many others.\n" +
                "As Joomla continues to thrive in 2015, Joomla remains the second most popular content\n" +
                "management system (CMS), behind only WordPress. Joomla is responsive because the Joomla team\n" +
                "decided to adopt the Bootstrap framework. The use of Bootstrap makes Joomla 3 attractive for\n" +
                "front-end designers, but it also makes it easy for developers to create interfaces for their code.");
        TextView t2=rootView.findViewById(R.id.joomla2);
                t2.setText("To start building websites with joomla, Domain Registration and Hosting should be done first, to\n" +
                        "install Joomla - you have two options. For both ways, you'll need a hosting and domain name.\n" +
                        "There are two possible ways to install Joomla\n" +
                        "One-Click Installation\n" +
                        "Manual Installation");
        TextView t3=rootView.findViewById(R.id.joomla3);
        t3.setText("If you signed up with Bluehost or Hostgator or any other similar hosting company, you should find\n" +
                "your '1-click installation' in your account control panel.\n" +
                "Log in to your hosting account.\n" +
                "Go to your control panel.\n" +
                "Look for the \"One-click Install\" icon and click that to proceed.\n" +
                "\n" +
                "Now you'll be redirected to a page where you'd be able to install Joomla for free with one-click-\n" +
                "installation");
        TextView t4=rootView.findViewById(R.id.joomla4);
        t4.setText("Once you have clicked on the 'Install' button, you'll be able to choose a domain that you have\n" +
                "bought, the white box after / (slash) can be left blank. If you choose to write, something let's say\n" +
                "'Joomla' - your site will be installed to YourNewDomain.com/Joomla. If you leave it blank, it'll be\n" +
                "installed straight to your root domain - YourNewDomain.com (recommended option).\n" +
                "Installing Joomla to your domain can take a while (2-10minutes), Once the install has been finished,\n" +
                "you'll be able to see the login credentials for your new Joomla website. If you can't see them for\n" +
                "some reason, make sure you check the Notification Center.");
        TextView t5=rootView.findViewById(R.id.joomla5);
        t5.setText("Download Joomla from http://www.joomla.org/download.html\n" +
                "Extract the archived joomla file and Move the downloaded Joomla installation package to the\n" +
                "server. Use a FTP Client to transfer the Joomla files to your server. There are several FTP Client\n" +
                "available for use, FileZilla is most popular one.\n" +
                "Now log into your hosting ftp (download FileZilla for that). The FTP address is usually\n" +
                "ftp.yourdomain.com, username and password are the same that you used to register to your host.\n" +
                "If there is any file named 'index' - delete it. After that upload all the files from your Joomla folder to\n" +
                "your FTP server. You can use \"drag n drop function in FileZilla. The other option is directly\n" +
                "uploading the Joomla files in the cpanel File Manager in the Public_html directly .\n" +
                "\n" +
                "Run the Joomla installation wizard. Enter the URL for your site (for example, http://www.your-\n" +
                "page.com) in your browser. Or if you uploaded it to a sub-folder, go to:\n" +
                "\n" +
                "http://yoursite.com/JoomlaFolder/ . It is a 3 step process");
        TextView t6=rootView.findViewById(R.id.joomla6);
        t6.setText("The other important thing in the process is setting up the database, It's smartest to use a MySQL\n" +
                "database to install Joomla, but Joomla does also support MySQLi and PostgreSQL.\n" +
                "In the database Section of the installation, Enter your database's host name, username, password and\n" +
                "other required details, Joomla will automatically generate a random table prefix to make the site\n" +
                "very much secure");
        TextView t7=rootView.findViewById(R.id.joomla7);
        t7.setText("The final installation screen offers you the choice of different sample data. Lower down the page is\n" +
                "an overview of your configuration settings. Joomla also checks to make sure that your server is\n" +
                "properly set up. If anything needs correcting, it will be marked in red. After Checking everything\n" +
                "click Install.");
        TextView t8=rootView.findViewById(R.id.joomla8);
        t8.setText("To access the Admin Interface Add the word /administrator/ to the URL of your site. For example,\n" +
                "http://YourNewDomain.com/administrator/\n" +
                "Login using the admin username and password that you created during the installation process. The\n" +
                "main toolbar across the top of the screen contains everything you need to manage your site, the\n" +
                "Control Panel you see after first logging in contains useful shortcuts and information based on that\n" +
                "main toolbar.");
        TextView t9=rootView.findViewById(R.id.joomla9);
        t9.setText("To write content in Joomla Website go to the main toolbar, then Content, then Article Manager.\n" +
                "There are only three things you need to do to publish your first article:\n" +
                "Title\n" +
                "Category\n" +
                "Body text\n" +
                "After entering all the contents, click Save to publish your article.Click your Site Name in the very\n" +
                "top left corner of the screen, You'll now see your article published at the top of the homepage.");
        TextView t10=rootView.findViewById(R.id.joomla10);
        t10.setText("A template is a type of Joomla extension that changes the way your site looks. There are two types\n" +
                "\n" +
                "of templates used by the Joomla CMS: Front-end Templates and Back-end Templates. The Front-\n" +
                "end Template controls the way your website is presented to the user viewing the website's content.\n" +
                "\n" +
                "The Back-end Template controls the way your website's administrative tasks are presented for\n" +
                "controlling management functions by a Joomla Administrator. These would include common tasks\n" +
                "such as: user, menu, article, category, module, component, plugin and template management. The\n" +
                "template can be accessed from main toolbar, go to Extensions, then Template Manager.");
        TextView t11=rootView.findViewById(R.id.joomla11);
        t11.setText("A component is a kind of Joomla extension. Components are the main functional units of Joomla;\n" +
                "they can be seen as mini-applications. An easy analogy would be that Joomla is the operating\n" +
                "system and the components are desktop applications. Created by a component, content is usually\n" +
                "displayed in the center of the main content area of a template (depending on the template).\n" +
                "Most components have two main parts: an administrator part and a site part. The site part is what is\n" +
                "used to render pages of your site when they are requested by your site visitors during normal site\n" +
                "operation. The administrator part provides an interface to configure and manage different aspects of\n" +
                "the component and is accessible through the Joomla administrator application.");
        TextView t12=rootView.findViewById(R.id.joomla12);
        t12.setText("An extension is a software package that extends your Joomla! installation in some way. A small\n" +
                "selection of extensions is included with the default Joomla! installation but many more are available\n" +
                "from http://extensions.joomla.org.\n" +
                "There are now about 9000 extensions in categories from 'Access & Security' to 'Style & Design'.\n" +
                "The directory's full name is the Joomla Extension Directory, or the JED for short.\n" +
                "One major difference between the JED and the WordPress plugin directory is that any extension can\n" +
                "be listed, regardless of whether or not they have a free version. So, it's fair to say that the JED really\n" +
                "does contain every Joomla extension worth using.");
        TextView t13=rootView.findViewById(R.id.joomla13);
        t13.setText("The JED has an active review and rating system. Some of the most popular extensions on the\n" +
                "directory have 100's of reviews and each one is rated according for its functionality, ease of use,\n" +
                "documentation and support.");
        return rootView;

    }
}
