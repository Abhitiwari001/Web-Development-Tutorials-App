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

import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class PopupsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_popups, container, false);
        CodeView codeView2 = rootView.findViewById(R.id.popupscode);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                ".popup {\n" +
                "position: relative;\n" +
                "display: inline-block;\n" +
                "cursor: pointer;\n" +
                "-webkit-user-select: none;\n" +
                "-moz-user-select: none;\n" +
                "-ms-user-select: none;\n" +
                "user-select: none;\n" +
                "}\n" +
                ".popup .popuptext {\n" +
                "visibility: hidden;\n" +
                "width: 160px;\n" +
                "background-color: #555;\n" +
                "color: #fff;\n" +
                "text-align: center;\n" +
                "border-radius: 6px;\n" +
                "padding: 8px 0;\n" +
                "position: absolute;\n" +
                "z-index: 1;\n" +
                "bottom: 125%;\n" +
                "left: 50%;\n" +
                "margin-left: -80px;\n" +
                "}\n" +
                "\n" +
                ".popup .popuptext::after {\n" +
                "content: \"\";\n" +
                "position: absolute;\n" +
                "top: 100%;\n" +
                "left: 50%;\n" +
                "margin-left: -5px;\n" +
                "border-width: 5px;\n" +
                "border-style: solid;\n" +
                "border-color: #555 transparent;\n" +
                "}\n" +
                ".popup .show {\n" +
                "visibility: visible;\n" +
                "-webkit-animation: fadeIn 1s;\n" +
                "animation: fadeIn 1s;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "@-webkit-keyframes fadeIn {\n" +
                "from {opacity: 0;}\n" +
                "to {opacity: 1;}\n" +
                "}\n" +
                "@keyframes fadeIn {\n" +
                "from {opacity: 0;}\n" +
                "to {opacity:1 ;}\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<h2>Popup Example</h2>\n" +
                "<div class=\"popup\"\n" +
                "onclick=\"myFunction()\">\n" +
                "Click me to toggle the popup!\n" +
                "<span class =\"popuptext\"\n" +
                "id = \"myPopup\">Popup Example!</span>\n" +
                "</div>\n" +
                "<script>\n" +
                "function myFunction() {\n" +
                "var popup = document.getElementById\n" +
                "('myPopup');\n" +
                "popup.classList.toggle('show');\n" +
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

