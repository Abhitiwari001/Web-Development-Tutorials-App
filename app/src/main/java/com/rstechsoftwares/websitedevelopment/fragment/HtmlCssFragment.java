package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class HtmlCssFragment extends Fragment implements RewardedVideoAdListener {
    private RewardedVideoAd mRewardedVideoAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_css, container, false);
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        TextView textView = rootView.findViewById(R.id.html_css_desc);
        textView.setText("CSS stands for Cascading Style Sheets , it defines how HTML elements are to be displayed.\n" +
                "It can be added to HTML elements in 3 ways:\n" +
                "1.Inline - using a style attribute in HTML elements\n" +
                "2.Internal - using a <style> element in the HTML <head> section\n" +
                "3.External - using one or more external CSS files");

        CodeView codeView = rootView.findViewById(R.id.html_inline_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<h1 style=\"color:steelblue\">\n" +
                "This is inline styling example</h1>\n" +
                "</body>\n" +
                "</html>");

        TextView textView1 = rootView.findViewById(R.id.html_style_tv);
        textView1.setText("An internal style sheet can be used to define a common style for all HTML elements on a page.\n" +
                "Internal styling is defined in the <head> section of an HTML page, using a <style> tag");

        CodeView codeView1 = rootView.findViewById(R.id.html_style_code);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "body {background-color:\n" +
                "MediumTurquoise }\n" +
                "h1 {\n" +
                "color:steelblue;\n" +
                "font-family:verdana;\n" +
                "font-size:300%;\n" +
                "}\n" +
                "p {\n" +
                "color:DarkOrchid;\n" +
                "font-family:verdana;\n" +
                "font-size:200%;\n" +
                " }\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                " <h1>This is a heading</h1>\n" +
                " <p>This is a paragraph.</p>\n" +
                "</body>\n" +
                "</html>");

        TextView textView2 = rootView.findViewById(R.id.html_estyle_tv);
        textView2.setText("In External styling the same styles can be used across multiple pages of the site .\n" +
                "External styles are defined in the <head> section of an HTML page, in the <link> tag .");

        CodeView codeView2 = rootView.findViewById(R.id.html_estyle_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<link rel=\"External\"\n" +
                "href=\"style1.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>This is a heading</h1>\n" +
                "<p>This is a paragraph.</p>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView3 = rootView.findViewById(R.id.html_cssbox_code);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "p {\n" +
                " border:5px solid steelblue;\n" +
                " padding:10px;\n" +
                " margin:30px;\n" +
                "}\n" +
                "div {\n" +
                " width: 320px;\n" +
                " padding: 10px;\n" +
                " border: 5px solid Turquoise;\n" +
                " margin: 30px;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>CSS BOX EXAMPLE</p>\n" +
                "<div>\n" +
                "<p> This a Box </p>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView4 = rootView.findViewById(R.id.html_vnav_code);
        codeView4.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "ul {\n" +
                " list-style-type: none;\n" +
                " margin: 0;\n" +
                " padding: 0;\n" +
                " width: 200px;\n" +
                " background-color: #f1f1f1;\n" +
                "}\n" +
                "li a {\n" +
                " display: block;\n" +
                " color: #000;\n" +
                " padding: 8px 0 8px 16px;\n" +
                " text-decoration: none;\n" +
                "}\n" +
                "li a.active {\n" +
                " background-color: steelblue;\n" +
                " color: white;\n" +
                "}\n" +
                "li a:hover:not(.active) {\n" +
                " background-color: turquoise;\n" +
                " color: white;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Vertical Navigation Bar</h2>\n" +
                "<p>In this example, Active class is\n" +
                "in a Steelblue background color and\n" +
                "a white text.</p>\n" +
                "<ul>\n" +
                "\t<li><a class=\"active\" href=\"#home\">\n" +
                "Home</a></li>\n" +
                "<li><a href=\"#Content\">Content</a>\n" +
                "</li>\n" +
                "<li><a href=\"#contact\">Contact</a>\n" +
                "</li>\n" +
                "<li><a href=\"#about\">About</a>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView5 = rootView.findViewById(R.id.html_fvnav_code);
        codeView5.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "body {\n" +
                " margin: 0;\n" +
                "}\n" +
                "ul {\n" +
                " list-style-type: none;\n" +
                " margin: 0;\n" +
                " padding: 0;\n" +
                " width: 26%;\n" +
                " background-color: #f1f1f1;\n" +
                " position: fixed;\n" +
                " height: 100%;\n" +
                " overflow: auto;\n" +
                "}\n" +
                "li a {\n" +
                " display: block;\n" +
                " color: #000;\n" +
                " padding: 8px 0 8px 16px;\n" +
                " text-decoration: none;\n" +
                " }\n" +
                "li a.active {\n" +
                " background-color: steelblue;\n" +
                " color: white;\n" +
                "}\n" +
                "li a:hover:not(.active) {\n" +
                " background-color: turquoise;\n" +
                " color: white;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<ul>\n" +
                "<li><a class=\"active\" href=\"#home\">\n" +
                "Home</a></li>\n" +
                "<li><a href=\"#news\">News</a>\n" +
                "</li>\n" +
                "<li><a href=\"#contact\">Contact</a>\n" +
                "</li>\n" +
                "<li><a href=\"#about\">About</a>\n" +
                "\t</li>\n" +
                "</ul>\n" +
                "<div style=\"margin-left:26%;\n" +
                "padding:2px 16px;height:1000px;\">\n" +
                "<h2>Fixed Side Nav Bar</h2>\n" +
                "<h3>Try to scroll this area, and\n" +
                "see how the sidenav sticks\n" +
                "to the page</h3>\n" +
                "<p>Notice that this div element\n" +
                "has a left margin of 26%. This\n" +
                "is because the side navigation\n" +
                "is set to 26% width. If you\n" +
                "remove the margin, the sidenav\n" +
                "will overlay/sit on top of\n" +
                "this div.</p>\n" +
                "\n" +
                "<p>Also notice that we have set\n" +
                "overflow:auto to sidenav. This\n" +
                "will add a scrollbar when the\n" +
                "sidenav is too long (for\n" +
                "example if it has over 50 links\n" +
                "inside of it).</p>\n" +
                " <p>Text 1</p>\n" +
                " <p>Text 2</p>\n" +
                " <p>Text 3</p>\n" +
                " <p>Text 4</p>\n" +
                " <p>Text 5</p>\n" +
                " <p>Text 6</p>\n" +
                " <p>Text 7</p>\n" +
                " <p>Text 8</p>\n" +
                " <p>Text 9</p>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView6 = rootView.findViewById(R.id.html_hnav_code);
        codeView6.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "ul {\n" +
                " list-style-type: none;\n" +
                " margin: 0;\n" +
                " padding: 0;\n" +
                " overflow: hidden;\n" +
                " background-color: #333;\n" +
                "}\n" +
                "li {\n" +
                " float: left;\n" +
                "}\n" +
                "li a {\n" +
                " display: block;\n" +
                " color: white;\n" +
                " text-align: center;\n" +
                " padding: 14px 16px;\n" +
                " text-decoration: none;\n" +
                "}\n" +
                "li a:hover:not(.active) {\n" +
                " background-color: turquoise;\n" +
                "}\n" +
                ".active {\n" +
                " background-color: steelblue;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h3> Horizontal Navigation Bar </h3>\n" +
                "<p>In this example, Active class is\n" +
                "in a Steelblue background color and\n" +
                "a white text.</p>\n" +
                "<ul>\n" +
                "<li><a class=\"active\" href=\"#home\">\n" +
                "Home</a></li>\n" +
                "<li><a href=\"#news\">Content</a>\n" +
                "</li>\n" +
                "<li><a href=\"#contact\">Contact</a>\n" +
                "</li>\n" +
                "<li><a href=\"#about\">About</a>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView7 = rootView.findViewById(R.id.html_fhnav_code);
        codeView7.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "body {margin:0;}\n" +
                "ul {\n" +
                " list-style-type: none;\n" +
                " margin: 0;\n" +
                " padding: 0;\n" +
                " overflow: hidden;\n" +
                " background-color: #333;\n" +
                " position: fixed;\n" +
                " top: 0;\n" +
                " width: 100%;\n" +
                "}\n" +
                "li {\n" +
                " float: left;\n" +
                "}\n" +
                "li a {\n" +
                " display: block;\n" +
                " color: white;\n" +
                " text-align: center;\n" +
                " padding: 14px 16px;\n" +
                " text-decoration: none;\n" +
                "}\n" +
                "li a:hover:not(.active) {\n" +
                " background-color: turquoise;\n" +
                "}\n" +
                ".active {\n" +
                " background-color: steelblue;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<ul>\n" +
                "<li><a class=\"active\" href=\"#home\">\n" +
                "Home</a></li>\n" +
                "<li><a href=\"#news\">News</a>\n" +
                "</li>\n" +
                "<li><a href=\"#contact\">Contact</a>\n" +
                "</li>\n" +
                "<li><a href=\"#about\">About</a>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<div style=\"padding:20px;margin-top:\n" +
                "30px;background-color:lightgrey;\n" +
                "height:1500px;\">\n" +
                "<h1>Fixed Top Navigation Bar</h1>\n" +
                "<h2>Scroll this page to see the\n" +
                "effect</h2>\n" +
                "<h2> Nav bar will stay at\n" +
                "the top of the page while\n" +
                "scrolling</h2>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "<p>Some text </p>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView8 = rootView.findViewById(R.id.html_dropdown_code);
        codeView8.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                ".dropdown1 {\n" +
                " position: relative;\n" +
                " display: inline-block;\n" +
                "}\n" +
                ".dropdown1-content {\n" +
                "\tdisplay: none;\n" +
                " position: absolute;\n" +
                " background-color: lightgrey;\n" +
                " min-width: 160px;\n" +
                " box-shadow: 0px 8px 16px 0px\n" +
                " rgba(0,0,0,0.2);\n" +
                " padding: 12px 16px;\n" +
                "}\n" +
                ".dropdown1:hover .dropdown1-content {\n" +
                " display: block;\n" +
                "}\n" +
                ".dropbtn {\n" +
                " background-color: steelblue;\n" +
                " color: white;\n" +
                " padding: 16px;\n" +
                " font-size: 16px;\n" +
                " border: none;\n" +
                " cursor: pointer;\n" +
                "}\n" +
                ".dropdown {\n" +
                " position: relative;\n" +
                " display: inline-block;\n" +
                "}\n" +
                ".dropdown-content {\n" +
                " display: none;\n" +
                " position: absolute;\n" +
                " background-color: #f9f9f9;\n" +
                " min-width: 160px;\n" +
                " box-shadow: 0px 8px 16px 0px\n" +
                " rgba(0,0,0,0.2);\n" +
                "}\n" +
                ".dropdown-content a {\n" +
                " color: black;\n" +
                " padding: 12px 16px;\n" +
                " text-decoration: none;\n" +
                " display: block;\n" +
                "}\n" +
                ".dropdown-content a:hover\n" +
                "{background-color: #f1f1f1}\n" +
                ".dropdown:hover .dropdown-content {\n" +
                " display: block;\n" +
                "}\n" +
                ".dropdown:hover .dropbtn {\n" +
                " background-color: turquoise;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Dropdown Menu</h2>\n" +
                "<p>Move the mouse over the button to\n" +
                "open the dropdown menu.</p>\n" +
                "<div class=\"dropdown\">\n" +
                "<button class=\"dropbtn\">Dropdown\n" +
                "</button>\n" +
                "<div class=\"dropdown-content\">\n" +
                "<a href=\"#\">Link 1</a>\n" +
                "<a href=\"#\">Link 2</a>\n" +
                "<a href=\"#\">Link 3</a>\n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "<h2>Hoverable Dropdown</h2>\n" +
                "<p>Move the mouse over the text\n" +
                "below to open the dropdown\n" +
                "content.</p>\n" +
                "<div class=\"dropdown1\">\n" +
                " <span>Mouse over me</span>\n" +
                " <div class=\"dropdown1-content\">\n" +
                " <p>Hoverable Dropdown</p>\n" +
                " </div>\n" +
                " </div>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView9 = rootView.findViewById(R.id.html_image_gallery_code);
        codeView9.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "div.img {\n" +
                " margin: 10px;\n" +
                " border: 1px solid #ccc;\n" +
                " float: left;\n" +
                " width: 120px;\n" +
                " height : 200px;\n" +
                "} \n" +
                "div.img:hover {\n" +
                " border: 3px solid steelblue;\n" +
                "}\n" +
                "div.img img {\n" +
                " width: 100%;\n" +
                " height: 100px;\n" +
                "}\n" +
                "div.desc {\n" +
                " padding: 15px;\n" +
                " text-align: center;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"img\">\n" +
                "<a target=\"_blank\" href=\n" +
                "\"img_tiger.jpg\">\n" +
                "<img src=\"img_tiger.jpg\" alt=\"tiger\" \n" +
                "width=\"300\" height=\"200\">\n" +
                "</a>\n" +
                "<div class=\"desc\">This is a Tiger\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"img\">\n" +
                "<a target=\"_blank\" href=\n" +
                "\"img_olm.jpg\">\n" +
                "<img src=\"img_olm.jpg\" alt=\"olm\"\n" +
                "width=\"300\" height=\"200\">\n" +
                "</a>\n" +
                "<div class=\"desc\">This is a Olm\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"img\">\n" +
                "<a target=\"_blank\" href=\n" +
                "\"img_pygmy.jpg\">\n" +
                "<img src=\"img_pygmy.jpg\" alt=\"pygmy\"\n" +
                "width=\"300\" height=\"200\">\n" +
                "</a>\n" +
                "<div class=\"desc\">This is a Pygmy\n" +
                "Marmoset\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"img\">\n" +
                "<a target=\"_blank\" href=\n" +
                "\"img_tarsier.jpg\">\n" +
                "<img src=\"img_tarsier.jpg\" alt=\n" +
                "\"tarsier\" width=\"300\" height=\"200\">\n" +
                "</a>\n" +
                "<div class=\"desc\">This is Tarsier\n" +
                "</div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView10 = rootView.findViewById(R.id.html_form_code);
        codeView10.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "<!-- This is for Padded field -->\n" +
                "input[type=text] {\n" +
                " width: 100%;\n" +
                " padding: 12px 20px;\n" +
                " margin: 8px 0;\n" +
                " box-sizing: border-box;\n" +
                "}\n" +
                "<!-- This is for Bordered Field -->\n" +
                "input[type=text1] {\n" +
                "width: 100%;\n" +
                "padding: 12px 20px;\n" +
                "margin: 8px 0;\n" +
                "box-sizing: border-box;\n" +
                "border: 4px solid steelblue;\n" +
                "border-radius: 4px;\n" +
                "}\n" +
                "<!-- This is for image Field -->\n" +
                "input[type=text2] {\n" +
                "width: 100%;\n" +
                "box-sizing: border-box;\n" +
                "border: 2px solid #ccc;\n" +
                "border-radius: 4px;\n" +
                "font-size: 16px;\n" +
                "background-color: white;\n" +
                "background-image: url\n" +
                "('sicon.png');\n" +
                "background-position: 10px 10px; \n" +
                "background-repeat: no-repeat;\n" +
                "padding: 12px 20px 12px 40px;\n" +
                "}\n" +
                "<!-- This is for Animated Field -->\n" +
                "input[type=text3] {\n" +
                "\n" +
                "width: 130px;\n" +
                "box-sizing: border-box;\n" +
                "border: 3px solid steelblue;\n" +
                "border-radius: 4px;\n" +
                "font-size: 16px;\n" +
                "background-color: white;\n" +
                "background-image: url('sicon.png');\n" +
                "background-position: 10px 10px;\n" +
                "background-repeat: no-repeat;\n" +
                "padding: 12px 20px 12px 40px;\n" +
                "-webkit-transition: width 0.4s\n" +
                "ease-in-out;\n" +
                "transition: width 0.4s ease-in-out;\n" +
                "}\n" +
                "input[type=text3]:focus {\n" +
                "\twidth: 60%;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h3>Padded Text fields:</h3>\n" +
                "<form>\n" +
                "<label for=\"fname\">First Name\n" +
                "</label>\n" +
                "<input type=\"text\" id=\"fname\"\n" +
                "name=\"fname\">\n" +
                "<label for=\"fname\">Last Name</label>\n" +
                "<input type=\"text\" id=\"lname\"\n" +
                "name=\"lname\">\n" +
                "</form>\n" +
                "<h3> Bordered Text Fields</h3>\n" +
                "<form>\n" +
                "<label for=\"fname\">First Name</label>\n" +
                "<input type=\"text1\" id=\"fname\"\n" +
                "name=\"fname\">\n" +
                "<label for=\"lname\">Last Name</label>\n" +
                "<input type=\"text1\" id=\"lname\"\n" +
                "name=\"lname\">\n" +
                "</form>\n" +
                "<h3>Text Fields with icon/image </h3>\n" +
                "<form>\n" +
                "<input type=\"text2\" name=\"search\"\n" +
                "placeholder=\"Search..\">\n" +
                "</form>\n" +
                "<h3> Animated Text Field </h3>\n" +
                "<form>\n" +
                " <input type=\"text3\" name=\"search\"\n" +
                "placeholder=\"Search..\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView11 = rootView.findViewById(R.id.html_styling_code);
        codeView11.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "select {\n" +
                "\twidth: 60%;\n" +
                " padding: 16px 20px;\n" +
                " border: 3px solid steelblue;\n" +
                " background-color: turquoise;\n" +
                "}\n" +
                "textarea {\n" +
                " width: 60%;\n" +
                " height: 150px;\n" +
                " padding: 12px 20px;\n" +
                " box-sizing: border-box;\n" +
                " border: 3px solid steelblue;\n" +
                " border-radius: 10px;\n" +
                " background-color: #f8f8f8;\n" +
                " font-size: 16px;\n" +
                " resize: none;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h3>Styled Select Menu</h3>\n" +
                "<form>\n" +
                "<select id=\"country\" name=\"country\">\n" +
                "<option value=\"ind\">India</option>\n" +
                "<option value=\"ind\">China</option>\n" +
                "<option value=\"ind\">Italy</option>\n" +
                "</select>\n" +
                "</form>\n" +
                "<h3> Styling Text Area </h3>\n" +
                "<form>\n" +
                "<textarea>\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "some text ..\n" +
                "</textarea>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView12 = rootView.findViewById(R.id.html_animation_code);
        codeView12.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "div {\n" +
                "width: 200px;\n" +
                "height: 150px;\n" +
                "background-color: steelblue;\n" +
                "position: relative;\n" +
                "-webkit-animation-name: example;\n" +
                "-webkit-animation-duration: 4s;\n" +
                "-webkit-animation-iteration-count:3;\n" +
                "animation-name: example;\n" +
                "animation-duration: 4s;\n" +
                "animation-iteration-count: 3;\n" +
                "}\n" +
                "@-webkit-keyframes example {\n" +
                "0% {background-color:steelblue;\n" +
                "left:0px; top:0px;}\n" +
                "25% {background-color:yellow;\n" +
                "left:200px; top:0px;}\n" +
                "50% {background-color:blue;\n" +
                "left:200px; top:200px;}\n" +
                "75% {background-color:green;\n" +
                "left:0px; top:200px;}\n" +
                "100% {background-color:orange;\n" +
                "left:0px; top:0px;}\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p><h3>ANIMATION</h3> </p>\n" +
                "<div></div>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView13 = rootView.findViewById(R.id.html_transition_code);
        codeView13.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "#a {\n" +
                " width: 100px;\n" +
                " height: 100px;\n" +
                " background: steelblue;\n" +
                " -webkit-transition: width 2s;\n" +
                " transition: width 2s;\n" +
                "}\n" +
                "#a:hover {\n" +
                "\twidth: 400px;\n" +
                "}\n" +
                "#b {\n" +
                "width: 100px;\n" +
                "height: 100px;\n" +
                "background: turquoise;\n" +
                "-webkit-transition: width 2s,\n" +
                "height 2s, -webkit-transform 2s;\n" +
                "transition: width 2s, height 2s,\n" +
                "transform 2s;\n" +
                "}\n" +
                "#b:hover {\n" +
                "width: 300px;\n" +
                "height: 300px;\n" +
                "-webkit-transform: rotate(180deg);\n" +
                "transform: rotate(180deg);\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h3> Transition </h3>\n" +
                "<div id =\"a\">\n" +
                "</div>\n" +
                "<p>Hover over the div element above,\n" +
                "to see the transition effect.</p>\n" +
                "<div id =\"b\">\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

        Button button = rootView.findViewById(R.id.try_now_button);
        button.setOnClickListener(v -> tryNow());

        return rootView;

    }


    private void tryNow() {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.details_container_frame, new TryYourselfFragment())
                .commit();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Try Yourself Editor");
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
