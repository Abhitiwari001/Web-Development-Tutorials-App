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

public class IconBarFragment extends Fragment {
    AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_icon_bar, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        TextView textView = rootView.findViewById(R.id.iconbar);
        textView.setText("An Icon Bar provides a menu to quickly navigate a Website. Icon Bar can be horizontal or vertical,\n" +
                "with the labels below the icons or to the right.\n" +
                "In the example below \" fa fa- \" is the code for the icons.");
        CodeView codeView2 = rootView.findViewById(R.id.iconbarcode);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<meta name=\"viewport\" content=\"width=\n" +
                "device-width, initial-scale=1\">\n" +
                "<!-- This is icon library -->\n" +
                "<link rel=\"stylesheet\" href=\"https://\n" +
                "\n" +
                "cdnjs.cloudflare.com/ajax/libs/font-\n" +
                "awesome/4.6.3/css/font-awesome.min.css\">\n" +
                "\n" +
                "<style>\n" +
                "body {margin:0}\n" +
                ".icon-bar {\n" +
                "width: 90px;\n" +
                "text-align: center;\n" +
                "background-color: #555;\n" +
                "}\n" +
                ".icon-bar a {\n" +
                "padding: 16px;\n" +
                "display: block;\n" +
                "transition: all 0.3s ease;\n" +
                "color: white;\n" +
                "font-size: 36px;\n" +
                "}\n" +
                ".icon-bar a:hover {\n" +
                "background-color: #000;\n" +
                "}\n" +
                ".active {\n" +
                "background-color: #48d1cc\n" +
                "!important;\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"icon-bar\">\n" +
                "<a class=\"active\" href=\"#\">\n" +
                "<i class=\"fa fa-home\"></i></a>\n" +
                "<a href=\"#\"><i class=\"fa fa-search\">\n" +
                "</i></a>\n" +
                "<a href=\"#\"><i class=\"fa fa-photo\">\n" +
                "</i></a>\n" +
                "<a href=\"#\"><i class=\"fa fa-globe\">\n" +
                "</i></a>\n" +
                "<a href=\"#\"><i class=\"fa fa-trash\">\n" +
                "</i></a>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView3 = rootView.findViewById(R.id.iconbarcode2);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<meta name=\"viewport\" content=\"width=\n" +
                "device-width, initial-scale=1\">\n" +
                "<link rel=\"stylesheet\" href=\"https://\n" +
                "\n" +
                "cdnjs.cloudflare.com/ajax/libs/font-\n" +
                "awesome/4.6.3/css/font-awesome.min.css\">\n" +
                "\n" +
                "<style>\n" +
                ".icon-bar {\n" +
                "width: 100%;\n" +
                "text-align: center;\n" +
                "background-color: #555;\n" +
                "overflow: auto;\n" +
                "}\n" +
                "\n" +
                ".icon-bar a {\n" +
                "width: 20%;\n" +
                "padding: 12px 0;\n" +
                "float: left;\n" +
                "transition: all 0.3s ease;\n" +
                "color: white;\n" +
                "font-size: 36px;\n" +
                "}\n" +
                ".icon-bar a:hover {\n" +
                "background-color: #000;\n" +
                "}\n" +
                ".active {\n" +
                "background-color: #48d1cc\n" +
                "!important;\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<div class=\"icon-bar\">\n" +
                "<a class=\"active\" href=\"#\">\n" +
                "<i class=\"fa fa-home\"></i></a>\n" +
                "<a href=\"#\"><i class=\"fa fa-search\">\n" +
                "</i></a>\n" +
                "<a href=\"#\"><i class=\"fa fa-photo\">\n" +
                "</i></a>\n" +
                "<a href=\"#\"><i class=\"fa fa-globe\">\n" +
                "</i></a>\n" +
                "<a href=\"#\"><i class=\"fa fa-trash\">\n" +
                "</i></a>\n" +
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

