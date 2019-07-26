package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class ResponsiveTableFragment extends Fragment {
    private InterstitialAd mInterstitialAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_responsive_table, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        CodeView codeView2 = rootView.findViewById(R.id.responsivetablecode);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta name=\"viewport\" content=\"width=\n" +
                "device-width, initial-scale=1.0\">\n" +
                "<style>\n" +
                "* {\n" +
                "box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                "/* Creates three columns of equal\n" +
                "width */\n" +
                ".columns {\n" +
                "float: left;\n" +
                "width: 33.3%;\n" +
                "padding: 8px;\n" +
                "}\n" +
                ".price {\n" +
                "list-style-type: none;\n" +
                "border: 1px solid #eee;\n" +
                "margin: 0;\n" +
                "padding: 0;\n" +
                "-webkit-transition: 0.3s;\n" +
                "transition: 0.3s;\n" +
                "}\n" +
                "\n" +
                "/* Add shadows on hover */\n" +
                ".price:hover {\n" +
                "box-shadow: 0 8px 12px 0\n" +
                "rgba(0,0,0,0.2)\n" +
                "}\n" +
                ".price .header {\n" +
                "background-color: #111;\n" +
                "color: white;\n" +
                "font-size: 25px;\n" +
                "}\n" +
                ".price li {\n" +
                "border-bottom: 1px solid #eee;\n" +
                "\n" +
                "padding: 20px;\n" +
                "text-align: center;\n" +
                "}\n" +
                ".price .grey {\n" +
                "background-color: #eee;\n" +
                "font-size: 20px;\n" +
                "}\n" +
                ".button {\n" +
                "background-color: #48d1cc;\n" +
                "border: none;\n" +
                "color: white;\n" +
                "padding: 10px 25px;\n" +
                "text-align: center;\n" +
                "text-decoration: none;\n" +
                "font-size: 18px;\n" +
                "}\n" +
                "\n" +
                "/* Changes the width of the three\n" +
                "columns to 100% (to stack horizontally\n" +
                "on small screens) */\n" +
                "@media only screen and\n" +
                "(max-width: 600px) {\n" +
                ".columns {\n" +
                "width: 100%;\n" +
                "}\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Responsive Pricing Tables</h2>\n" +
                "<div class=\"columns\">\n" +
                "<ul class=\"price\">\n" +
                "<li class=\"header\">Basic</li>\n" +
                "<li class=\"grey\"> 600 / year</li> ₹ 600 / year</li>\n" +
                "<li>12GB Storage</li>\n" +
                "<li>12 Emails</li>\n" +
                "<li>12 Domains</li>\n" +
                "<li>12GB Bandwidth</li>\n" +
                "<li class=\"grey\"><a href=\"#\"\n" +
                "class=\"button\">\n" +
                "Sign Up</a></li>\n" +
                "\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div class=\"columns\">\n" +
                "<ul class=\"price\">\n" +
                "<li class=\"header\"\n" +
                "style=\"background-color:\n" +
                "#48d1cc\">Pro</li>\n" +
                "<li class=\"grey\"> 1800 / year ₹ 600 / year</li>\n" +
                "</li>\n" +
                "<li>25GB Storage</li>\n" +
                "<li>25 Emails</li>\n" +
                "<li>25 Domains</li>\n" +
                "<li>24GB Bandwidth</li>\n" +
                "<li class=\"grey\"><a href=\"#\"\n" +
                "class=\"button\">\n" +
                "Sign Up</a></li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div class=\"columns\">\n" +
                "<ul class=\"price\">\n" +
                "<li class=\"header\" >Premium</li>\n" +
                "<li class=\"grey\"> 4000 / year ₹ 600 / year</li>\n" +
                "</li>\n" +
                "<li>80GB Storage</li>\n" +
                "<li>80 Emails</li>\n" +
                "<li>80 Domains</li>\n" +
                "<li>40GB Bandwidth</li>\n" +
                "<li class=\"grey\"><a href=\"#\"\n" +
                "class=\"button\">\n" +
                "Sign Up</a></li>\n" +
                "</ul>\n" +
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


}

