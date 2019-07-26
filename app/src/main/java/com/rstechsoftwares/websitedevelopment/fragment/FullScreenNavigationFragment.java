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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class FullScreenNavigationFragment extends Fragment {
    private InterstitialAd mInterstitialAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_full_screen_navigation, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        TextView t=rootView.findViewById(R.id.fsnav1);
        t.setText("In the example below \"&times\" is used to display the close \"x\" symbol and \"&#9776;\" is used to\n" +
                "display the menu bar icon \" \" ☰\"");
        CodeView codeView = rootView.findViewById(R.id.fsnavcode1);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "body {\n" +
                "margin: 1;\n" +
                "font-family: 'Lato', sans-serif;\n" +
                "}\n" +
                ".overlay {\n" +
                "height: 100%;\n" +
                "width: 0;\n" +
                "position: fixed;\n" +
                "z-index: 1;\n" +
                "top: 0;\n" +
                "left: 0;\n" +
                "background-color: rgb(0,0,0);\n" +
                "background-color: rgba(0,0,0,0.9);\n" +
                "overflow-x: hidden;\n" +
                "transition: 0.5s;\n" +
                "}\n" +
                ".overlay-content {\n" +
                "position: relative;\n" +
                "top: 25%;\n" +
                "width: 100%;\n" +
                "text-align: center;\n" +
                "margin-top: 30px;\n" +
                "}\n" +
                ".overlay a {\n" +
                "padding: 8px;\n" +
                "text-decoration: none;\n" +
                "font-size: 36px;\n" +
                "color: #818181;\n" +
                "display: block;\n" +
                "transition: 0.3s;\n" +
                "}\n" +
                ".overlay a:hover, .overlay a:focus {\n" +
                "color: #f1f1f1;\n" +
                "}\n" +
                "\n" +
                ".overlay .closebtn {\n" +
                "position: absolute;\n" +
                "top: 20px;\n" +
                "right: 45px;\n" +
                "font-size: 60px;\n" +
                "}\n" +
                "/* When the height of the screen is less than\n" +
                "450 pixels, this will change the font-size of\n" +
                "the links and position the close button again,\n" +
                "so they don't overlap */\n" +
                "@media screen and (max-height:450px){\n" +
                ".overlay a {font-size: 20px}\n" +
                ".overlay .closebtn {\n" +
                "font-size: 40px;\n" +
                "top: 15px;\n" +
                "right: 35px;\n" +
                "}\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<div id=\"myNav\" class=\"overlay\">\n" +
                "<a href=\"javascript:void(0)\" class=\n" +
                "\"closebtn\"\n" +
                "onclick=\"closeNav()\">&times;</a>\n" +
                "<div class=\"overlay-content\">\n" +
                "<a href=\"#\">About</a>\n" +
                "<a href=\"#\">Services</a>\n" +
                "<a href=\"#\">Careers</a>\n" +
                "<a href=\"#\">Contact</a>\n" +
                "</div>\n" +
                "</div>\n" +
                "<h2>Slide Right Fullscreen Overlay Nav\n" +
                "Example</h2>\n" +
                "<p>Click on element below to open the\n" +
                "fullscreen overlay navigation menu.</p>\n" +
                "<p>In this example,the navigation menu\n" +
                "will slide in, from left to right:</p>\n" +
                "<span style=\"font-size:30px;cursor:\n" +
                "pointer\"\n" +
                "onclick=\"openNav()\">&#9776;\n" +
                "Open</span>\n" +
                "\n" +
                "<script>\n" +
                "function openNav() {\n" +
                "document.getElementById(\"myNav\")\n" +
                ".style.width = \"100%\";\n" +
                "}\n" +
                "function closeNav() {\n" +
                "document.getElementById(\"myNav\")\n" +
                ".style.width = \"0%\";\n" +
                "}\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.fsnavcode2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "body {\n" +
                "margin: 1;\n" +
                "font-family: 'Lato', sans-serif;\n" +
                "}\n" +
                ".overlay {\n" +
                "height: 0%;\n" +
                "width: 100%;\n" +
                "position: fixed;\n" +
                "z-index: 1;\n" +
                "top: 0;\n" +
                "left: 0;\n" +
                "background-color: rgb(0,0,0);\n" +
                "background-color: rgba(0,0,0,0.9);\n" +
                "overflow-y: hidden;\n" +
                "\n" +
                "transition: 0.5s;\n" +
                "}\n" +
                ".overlay-content {\n" +
                "position: relative;\n" +
                "top: 25%;\n" +
                "width: 100%;\n" +
                "text-align: center;\n" +
                "margin-top: 30px;\n" +
                "}\n" +
                ".overlay a {\n" +
                "padding: 8px;\n" +
                "text-decoration: none;\n" +
                "font-size: 36px;\n" +
                "color: #818181;\n" +
                "display: block;\n" +
                "transition: 0.3s;\n" +
                "}\n" +
                ".overlay a:hover, .overlay a:focus {\n" +
                "color: #f1f1f1;\n" +
                "}\n" +
                ".overlay .closebtn {\n" +
                "position: absolute;\n" +
                "top: 20px;\n" +
                "right: 45px;\n" +
                "font-size: 60px;\n" +
                "}\n" +
                "@media screen and (max-height: 450px){\n" +
                ".overlay {overflow-y: auto;}\n" +
                ".overlay a {font-size: 20px}\n" +
                ".overlay .closebtn {\n" +
                "font-size: 40px;\n" +
                "top: 15px;\n" +
                "right: 35px;\n" +
                "}\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<div id=\"myNav\" class=\"overlay\">\n" +
                "<a href=\"javascript:void(0)\"\n" +
                "class=\"closebtn\"\n" +
                "onclick=\"closeNav()\">×</a>\n" +
                "<div class=\"overlay-content\">\n" +
                "<a href=\"#\">About</a>\n" +
                "<a href=\"#\">Services</a>\n" +
                "<a href=\"#\">Careers</a>\n" +
                "\n" +
                "<a href=\"#\">Contact</a>\n" +
                "</div>\n" +
                "</div>\n" +
                "<h2> Slide Down Fullscreen Overlay Nav\n" +
                "Example</h2>\n" +
                "<p>Click on the element below to open\n" +
                "the fullscreen overlay navigation menu.\n" +
                "</p>\n" +
                "<p>In this example, the navigation\n" +
                "menu will slide downwards from the top.\n" +
                "</p>\n" +
                "<span style=\"font-size:30px;cursor:\n" +
                "pointer\"\n" +
                "onclick=\"openNav()\">&#9776; open</span>\n" +
                "<script>\n" +
                "function openNav() {\n" +
                "document.getElementById(\"myNav\")\n" +
                ".style.height=\"100%\";\n" +
                "}\n" +
                "function closeNav() {\n" +
                "document.getElementById(\"myNav\")\n" +
                ".style.height = \"0%\";\n" +
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

