package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class SideNavigationFragment extends Fragment {
    AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_side_navigation, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        TextView textView = rootView.findViewById(R.id.sidenav);
        textView.setText("In the Side navigation, when the menu is clicked the navigation menu will slide out from left or\n" +
                "right side of the page.\n" +
                "In the example below \"&times\" is used to display the close \"x\" symbol and \"&#9776;\" is used to\n" +
                "display the menu bar icon \" \" ☰\"");
        CodeView codeView = rootView.findViewById(R.id.sidenavcode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "body {\n" +
                "font-family: \"Lato\", sans-serif;\n" +
                "}\n" +
                ".sidenav {\n" +
                "height: 100%;\n" +
                "width: 0;\n" +
                "position: fixed;\n" +
                "z-index: 1;\n" +
                "top: 0;\n" +
                "left: 0;\n" +
                "background-color: #111;\n" +
                "overflow-x: hidden;\n" +
                "transition: 0.5s;\n" +
                "padding-top: 60px;\n" +
                "}\n" +
                ".sidenav a {\n" +
                "padding: 8px 8px 8px 32px;\n" +
                "text-decoration: none;\n" +
                "font-size: 25px;\n" +
                "color: #818181;\n" +
                "display: block;\n" +
                "transition: 0.3s\n" +
                "}\n" +
                ".sidenav a:hover, .offcanvas a:focus{\n" +
                "color: #f1f1f1;\n" +
                "}\n" +
                ".sidenav .closebtn {\n" +
                "position: absolute;\n" +
                "top: 0;\n" +
                "right: 25px;\n" +
                "font-size: 36px;\n" +
                "margin-left: 50px;\n" +
                "}\n" +
                "@media screen and (max-height: 450px){\n" +
                ".sidenav {padding-top: 15px;}\n" +
                "\n" +
                ".sidenav a {font-size: 18px;}\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<div id=\"mySidenav\" class=\"sidenav\">\n" +
                "<a href=\"javascript:void(0)\"\n" +
                "class=\"closebtn\"\n" +
                "onclick=\"closeNav()\">&times;</a>\n" +
                "<a href=\"#\">About</a>\n" +
                "<a href=\"#\">Services</a>\n" +
                "<a href=\"#\">Career</a>\n" +
                "<a href=\"#\">Contact</a>\n" +
                "</div>\n" +
                "<h2>Sidenav Example</h2>\n" +
                "<p>Click on the element below to open\n" +
                "the side navigation menu.</p>\n" +
                "<span style=\"font-size:30px;cursor:\n" +
                "pointer\"onclick=\"openNav()\"> open ☰\"\n" +
                "</span>\n" +
                "<script>\n" +
                "/* Set the width of the side navigation to\n" +
                "250px */\n" +
                "function openNav() {\n" +
                "document.getElementById(\"mySidenav\")\n" +
                ".style.width=\"250px\";\n" +
                "}\n" +
                "function closeNav() {\n" +
                "document.getElementById(\"mySidenav\")\n" +
                ".style.width = \"0\";\n" +
                "}\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.sidenavcode2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "body {\n" +
                "font-family: \"Lato\", sans-serif;\n" +
                "}\n" +
                ".sidenav {\n" +
                "height: 100%;\n" +
                "width: 0;\n" +
                "position: fixed;\n" +
                "z-index: 1;\n" +
                "top: 0;\n" +
                "left: 0;\n" +
                "background-color: #111;\n" +
                "overflow-x: hidden;\n" +
                "transition: 0.5s;\n" +
                "padding-top: 60px;\n" +
                "}\n" +
                ".sidenav a {\n" +
                "padding: 8px 8px 8px 32px;\n" +
                "text-decoration: none;\n" +
                "font-size: 25px;\n" +
                "color: #818181;\n" +
                "display: block;\n" +
                "transition: 0.3s\n" +
                "}\n" +
                ".sidenav a:hover, .offcanvas a:focus{\n" +
                "color: #f1f1f1;\n" +
                "}\n" +
                ".sidenav .closebtn {\n" +
                "position: absolute;\n" +
                "top: 0;\n" +
                "right: 25px;\n" +
                "font-size: 36px;\n" +
                "margin-left: 50px;\n" +
                "}\n" +
                "#main {\n" +
                "transition: margin-left .5s;\n" +
                "padding: 16px;\n" +
                "\n" +
                "}\n" +
                "@media screen and (max-height: 450px){\n" +
                ".sidenav {padding-top: 15px;}\n" +
                ".sidenav a {font-size: 18px;}\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<div id=\"mySidenav\" class=\"sidenav\">\n" +
                "<a href=\"javascript:void(0)\"\n" +
                "class=\"closebtn\"\n" +
                "onclick=\"closeNav()\">&times;</a>\n" +
                "<a href=\"#\">About</a>\n" +
                "<a href=\"#\">Services</a>\n" +
                "<a href=\"#\">Careers</a>\n" +
                "<a href=\"#\">Contact</a>\n" +
                "</div>\n" +
                "\n" +
                "<div id=\"main\">\n" +
                "<h2>Sidenav Push Example</h2>\n" +
                "<p>Click on the element below to open\n" +
                "the side navigation menu,and push\n" +
                "this content to the right.</p>\n" +
                "<span style=\"font-size:30px;\n" +
                "cursor:pointer\"\n" +
                "onclick=\"openNav()\">&#9776; open\n" +
                "</span>\n" +
                "</div>\n" +
                "\n" +
                "<script>\n" +
                "/* Set the width of the side navigation to\n" +
                "250px and the left margin of the page content\n" +
                "to 250px */\n" +
                "function openNav() {\n" +
                "document.getElementById(\"mySidenav\n" +
                "style.width=\"250px\";\n" +
                "document.getElementById(\"main\").style\n" +
                ".marginLeft=\"250px\";\n" +
                "}\n" +
                "function closeNav() {\n" +
                "document.getElementById(\"mySidenav\")\n" +
                "\n" +
                ".style.width=\"0\";\n" +
                "document.getElementById(\"main\").style\n" +
                ".marginLeft=\"0\";\n" +
                "}\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView3 = rootView.findViewById(R.id.sidenavcode3);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "body {\n" +
                "font-family: \"Lato\", sans-serif;\n" +
                "transition: background-color .5s;\n" +
                "}\n" +
                ".sidenav {\n" +
                "height: 100%;\n" +
                "width: 0;\n" +
                "position: fixed;\n" +
                "z-index: 1;\n" +
                "top: 0;\n" +
                "left: 0;\n" +
                "background-color: #111;\n" +
                "overflow-x: hidden;\n" +
                "transition: 0.5s;\n" +
                "padding-top: 60px;\n" +
                "}\n" +
                ".sidenav a {\n" +
                "padding: 8px 8px 8px 32px;\n" +
                "text-decoration: none;\n" +
                "font-size: 25px;\n" +
                "color: #818181;\n" +
                "display: block;\n" +
                "transition: 0.3s\n" +
                "}\n" +
                ".sidenav a:hover, .offcanvas a:focus{\n" +
                "color: #f1f1f1;\n" +
                "\n" +
                "}\n" +
                ".sidenav .closebtn {\n" +
                "position: absolute;\n" +
                "top: 0;\n" +
                "right: 25px;\n" +
                "font-size: 36px;\n" +
                "margin-left: 50px;\n" +
                "}\n" +
                "#main {\n" +
                "transition: margin-left .5s;\n" +
                "padding: 16px;\n" +
                "}\n" +
                "@media screen and (max-height: 450px){\n" +
                ".sidenav {padding-top: 15px;}\n" +
                ".sidenav a {font-size: 18px;}\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<div id=\"mySidenav\" class=\"sidenav\">\n" +
                "<a href=\"javascript:void(0)\"\n" +
                "class=\"closebtn\"\n" +
                "onclick=\"closeNav()\">&times;</a>\n" +
                "<a href=\"#\">About</a>\n" +
                "<a href=\"#\">Services</a>\n" +
                "<a href=\"#\">Careers</a>\n" +
                "<a href=\"#\">Contact</a>\n" +
                "</div>\n" +
                "<div id=\"main\">\n" +
                "<h2>Sidenav Push With Opacity</h2>\n" +
                "<p> Click on the element below to open\n" +
                "the side navigation menu, and push\n" +
                "this content to the right. Notice\n" +
                "that we add a black see-through\n" +
                "background-color to body when the\n" +
                "sidenav is opened.</p>\n" +
                "<span style=\"font-size:30px;cursor:\n" +
                "pointer\"\n" +
                "onclick=\"openNav()\">&#9776; open\n" +
                "</span>\n" +
                "</div>\n" +
                "\n" +
                "<script>\n" +
                "/* Set the width of the side navigation to\n" +
                "250px and the left margin of the page content\n" +
                "to 250px and add a black background color to\n" +
                "body */\n" +
                "function openNav() {\n" +
                "document.getElementById(\"mySidenav\")\n" +
                ".style.width=\"250px\";\n" +
                "document.getElementById(\"main\")\n" +
                ".style.marginLeft=\"250px\";\n" +
                "document.body.style.backgroundColor=\n" +
                "\"rgba(0,0,0,0.4)\";\n" +
                "}\n" +
                "function closeNav() {\n" +
                "document.getElementById(\"mySidenav\")\n" +
                ".style.width = \"0\";\n" +
                "document.getElementById(\"main\")\n" +
                ".style.marginLeft= \"0\";\n" +
                "document.body.style.backgroundColor =\n" +
                "\"white\";\n" +
                "}\n" +
                "</script>\n" +
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


}



