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

public class HtmlLayoutFragment extends Fragment {
    AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_layout, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        CodeView codeView = rootView.findViewById(R.id.html_div_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "#header {\n" +
                " background-color:steelblue;\n" +
                " color:white;\n" +
                " text-align:center;\n" +
                " padding:5px;\n" +
                "}\n" +
                "#nav {\n" +
                " line-height:30px;\n" +
                " background-color:#48D1CC;\n" +
                " color:white;\n" +
                " height:350px;\n" +
                " width:110px;\n" +
                " float:left;\n" +
                " padding:5px;\n" +
                "}\n" +
                "#section {\n" +
                " width:350px;\n" +
                " float:left;\n" +
                " padding:10px; \n" +
                " }\n" +
                "#footer {\n" +
                " background-color:steelblue;\n" +
                " color:white;\n" +
                " clear:both;\n" +
                " text-align:center;\n" +
                " padding:5px;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"header\">\n" +
                "<h1>BIG CATS</h1>\n" +
                "</div>\n" +
                "<div id=\"nav\">\n" +
                "Tiger<br>\n" +
                "Lion<br>\n" +
                "Cheetah<br>\n" +
                "</div>\n" +
                "<div id=\"section\">\n" +
                "<h2>Tiger</h2>\n" +
                "<p>\n" +
                "The tiger (Panthera tigris)\n" +
                "is the largest cat species,\n" +
                "reaching a total body length\n" +
                "of up to 3.38 m (11.1 ft) over\n" +
                "curves and weighing up to 388.7\n" +
                "kg (857 lb) in the wild.\n" +
                "<p>\n" +
                "The tiger populations\n" +
                "occurring in small pockets\n" +
                "isolated from each other, of\n" +
                "which about 2,000 exist on the\n" +
                "Indian subcontinent.\n" +
                "</p>\n" +
                "</div>\n" +
                "<div id=\"footer\">\n" +
                "Copyright 2015\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView1 = rootView.findViewById(R.id.html_ltable_code);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Layout using Tables</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table width=\"100%\" border=\"0\">\n" +
                "<tr>\n" +
                "<td colspan=\"2\"bgcolor=\"steelblue\">\n" +
                "<center>\n" +
                "<h1>BIG CATS</h1>\n" +
                "</center>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr valign=\"top\">\n" +
                "<td bgcolor=\"#48D1CC\" width=\"50\">\n" +
                "<b>Main Menu</b><br />\n" +
                "Tiger<br />\n" +
                "Lion<br />\n" +
                "Cheetah\n" +
                "</td>\n" +
                "<td bgcolor=\"#eee\" width=\"100\"\n" +
                "height=\"200\">\n" +
                "The tiger (Panthera tigris)\n" +
                "is the largest cat species\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\"bgcolor=\"steelblue\">\n" +
                "\t<center>\n" +
                "Copyright 2015\n" +
                "</center>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView2 = rootView.findViewById(R.id.html_html5_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "header {\n" +
                " background-color:steelblue;\n" +
                " color:white;\n" +
                " text-align:center;\n" +
                " padding:5px;\n" +
                "}\n" +
                "nav {\n" +
                " line-height:30px;\n" +
                " background-color:#48D1CC;\n" +
                " height:300px;\n" +
                " width:100px;\n" +
                " float:left;\n" +
                " padding:5px;\n" +
                "}\n" +
                "section {\n" +
                " width:350px;\n" +
                " float:left;\n" +
                " padding:10px;\n" +
                "}\n" +
                "footer {\n" +
                " background-color:steelblue;\n" +
                " color:white;\n" +
                " clear:both;\n" +
                " text-align:center;\n" +
                " padding:5px; \n" +
                " }\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<header>\n" +
                "<h1>BIG CATS</h1>\n" +
                "</header>\n" +
                "<nav>\n" +
                "Tiger<br>\n" +
                "Lion<br>\n" +
                "Cheetah<br>\n" +
                "</nav>\n" +
                "<section>\n" +
                "<h1>Tiger</h1>\n" +
                "<p>\n" +
                "The tiger (Panthera tigris) is the\n" +
                "largest cat species, reaching a\n" +
                "total body length of up to 3.38 m\n" +
                "(11.1 ft) over curves and weighing\n" +
                "up to 388.7 kg (857 lb) in the wild.\n" +
                "</p>\n" +
                "</section>\n" +
                "<footer>\n" +
                "Copyright 2015\n" +
                "</footer>\n" +
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
