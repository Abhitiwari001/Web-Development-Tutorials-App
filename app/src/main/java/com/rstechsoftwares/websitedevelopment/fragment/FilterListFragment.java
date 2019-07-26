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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class FilterListFragment extends Fragment {
    AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_filter_list, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        CodeView codeView = rootView.findViewById(R.id.filterlistcode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "#myInput {\n" +
                "background-image:\n" +
                "url('/img/search.png');\n" +
                "background-position: 10px 12px;\n" +
                "background-repeat: no-repeat;\n" +
                "box-sizing: border-box;\n" +
                "width: 100%;\n" +
                "font-size: 16px;\n" +
                "padding: 12px 20px 12px 40px;\n" +
                "border: 1px solid #ddd;\n" +
                "margin-bottom: 12px;\n" +
                "}\n" +
                "#myUL {\n" +
                "list-style-type: none;\n" +
                "padding: 0;\n" +
                "margin: 0;\n" +
                "}\n" +
                "#myUL li a {\n" +
                "border: 1px solid #ddd;\n" +
                "margin-top: -1px;\n" +
                "background-color: #f6f6f6;\n" +
                "padding: 12px;\n" +
                "text-decoration: none;\n" +
                "font-size: 18px;\n" +
                "color: black;\n" +
                "display: block\n" +
                "}\n" +
                "#myUL li a.header {\n" +
                "background-color: #e2e2e2;\n" +
                "cursor: default;\n" +
                "}\n" +
                "#myUL li a:hover:not(.header) {\n" +
                "background-color: #eee;\n" +
                "}\n" +
                "\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>ANIMALS</h2>\n" +
                "<input type=\"text\" id=\"myInput\"\n" +
                "onkeyup=\"myFunction()\" placeholder=\n" +
                "\"Search Here..\"title=\"Type in a name\">\n" +
                "<ul id=\"myUL\">\n" +
                "<li><a href=\"#\" class=\"header\">A</a></li>\n" +
                "<li><a href=\"#\">Alligator</a></li>\n" +
                "<li><a href=\"#\">Albatross</a></li>\n" +
                "<li><a href=\"#\">Antelope</a></li>\n" +
                "<li><a href=\"#\" class=\"header\">B</a></li>\n" +
                "<li><a href=\"#\">Baboon</a></li>\n" +
                "<li><a href=\"#\">Blue Whale</a></li>\n" +
                "<li><a href=\"#\" class=\"header\">C</a></li>\n" +
                "<li><a href=\"#\">Cheetah</a></li>\n" +
                "<li><a href=\"#\">Chimpanzee</a></li>\n" +
                "<li><a href=\"#\">Camel</a></li>\n" +
                "</ul>\n" +
                "<script>\n" +
                "/* Declare variables */\n" +
                "function myFunction() {\n" +
                "var input, filter, ul, li, a, i;\n" +
                "input=document.getElementById(\"myInput\");\n" +
                "filter = input.value.toUpperCase();\n" +
                "ul = document.getElementById(\"myUL\");\n" +
                "li = ul.getElementsByTagName(\"li\");\n" +
                "/* Loop through all list items, and hide\n" +
                "those who don't match the search query */\n" +
                "for (i = 0; i < li.length; i++) {\n" +
                "a = li[i].getElementsByTagName(\"a\")[0];\n" +
                "if (a.innerHTML.toUpperCase()\n" +
                ".indexOf(filter) > -1) {\n" +
                "\n" +
                "li[i].style.display = \"\";\n" +
                "} else {\n" +
                "li[i].style.display = \"none\";\n" +
                "}\n" +
                "}\n" +
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
