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

public class ProgressBarFragment extends Fragment {
    AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_progress_bar, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        CodeView codeView = rootView.findViewById(R.id.progressbarcode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "#myProgress {\n" +
                "position: relative;\n" +
                "width: 100%;\n" +
                "height: 30px;\n" +
                "background-color: #ddd;\n" +
                "}\n" +
                "#myBar {\n" +
                "position: absolute;\n" +
                "width: 5%;\n" +
                "height: 100%;\n" +
                "background-color: #48d1cc;\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<h1>Simple Progress Bar</h1>\n" +
                "<div id=\"myProgress\">\n" +
                "<div id=\"myBar\"></div>\n" +
                "</div>\n" +
                "<br>\n" +
                "<button onclick=\"move()\">Click Here\n" +
                "</button>\n" +
                "<script>\n" +
                "function move() {\n" +
                "var elem = document.getElementById\n" +
                "(\"myBar\");\n" +
                "var width = 1;\n" +
                "\n" +
                "var id = setInterval(frame, 10);\n" +
                "function frame() {\n" +
                "if (width >= 100) {\n" +
                "clearInterval(id);\n" +
                "} else {\n" +
                "width++;\n" +
                "elem.style.width = width + '%';\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.progressbarcode2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "#myProgress {\n" +
                "position: relative;\n" +
                "width: 100%;\n" +
                "height: 30px;\n" +
                "background-color: #ddd;\n" +
                "}\n" +
                "#myBar {\n" +
                "position: absolute;\n" +
                "width: 10%;\n" +
                "height: 100%;\n" +
                "background-color: #48d1cc;\n" +
                "}\n" +
                "#label {\n" +
                "text-align: center;\n" +
                "\n" +
                "line-height: 30px;\n" +
                "color: white;\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<h1>Progress Bar With Label</h1>\n" +
                "<div id=\"myProgress\">\n" +
                "<div id=\"myBar\">\n" +
                "<div id=\"label\">10%</div>\n" +
                "</div>\n" +
                "</div>\n" +
                "<br>\n" +
                "<button onclick=\"move()\">Click Here\n" +
                "</button>\n" +
                "<script>\n" +
                "function move() {\n" +
                "var elem = document.getElementById\n" +
                "(\"myBar\");\n" +
                "var width = 10;\n" +
                "var id = setInterval(frame, 10);\n" +
                "function frame() {\n" +
                "if (width >= 100) {\n" +
                "clearInterval(id);\n" +
                "} else {\n" +
                "width++;\n" +
                "elem.style.width = width + '%';\n" +
                "document.getElementById(\"label\")\n" +
                ".innerHTML = width * 1 + '%';\n" +
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

