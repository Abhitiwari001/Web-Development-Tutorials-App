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

public class HovDropdownFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_hov_dropdown, container, false);
        CodeView codeView = rootView.findViewById(R.id.hovdropcode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                ".dropbtn {\n" +
                "background-color: #48d1cc;\n" +
                "color: white;\n" +
                "padding: 16px;\n" +
                "font-size: 16px;\n" +
                "border: none;\n" +
                "cursor: pointer;\n" +
                "}\n" +
                ".dropdown {\n" +
                "position: relative;\n" +
                "display: inline-block;\n" +
                "}\n" +
                ".dropdown-content {\n" +
                "display: none;\n" +
                "position: absolute;\n" +
                "background-color: #f9f9f9;\n" +
                "min-width: 160px;\n" +
                "box-shadow: 0px 8px 16px 0px\n" +
                "rgba(0,0,0,0.2);\n" +
                "}\n" +
                ".dropdown-content a {\n" +
                "color: black;\n" +
                "padding: 12px 16px;\n" +
                "text-decoration: none;\n" +
                "display: block;\n" +
                "}\n" +
                ".dropdown-content\n" +
                "a:hover{background-color:#f1f1f1}\n" +
                ".dropdown:hover .dropdown-content {\n" +
                "display: block;\n" +
                "}\n" +
                ".dropdown:hover .dropbtn {\n" +
                "background-color: #7effa5;\n" +
                "\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Hoverable Dropdown</h2>\n" +
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
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.hovdropcode2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                ".dropbtn {\n" +
                "background-color: #48d1cc;\n" +
                "color: white;\n" +
                "padding: 16px;\n" +
                "font-size: 16px;\n" +
                "border: none;\n" +
                "cursor: pointer;\n" +
                "}\n" +
                ".dropdown {\n" +
                "position: relative;\n" +
                "\n" +
                "display: inline-block;\n" +
                "}\n" +
                ".dropdown-content {\n" +
                "display: none;\n" +
                "position: absolute;\n" +
                "right: 0;\n" +
                "background-color: #f9f9f9;\n" +
                "min-width: 160px;\n" +
                "box-shadow: 0px 8px 16px 0px\n" +
                "rgba(0,0,0,0.2);\n" +
                "}\n" +
                ".dropdown-content a {\n" +
                "color: black;\n" +
                "padding: 12px 16px;\n" +
                "text-decoration: none;\n" +
                "display: block;\n" +
                "}\n" +
                ".dropdown-content\n" +
                "a:hover {background-color:#f1f1f1}\n" +
                ".dropdown:hover .dropdown-content {\n" +
                "display: block;\n" +
                "}\n" +
                ".dropdown:hover .dropbtn {\n" +
                "background-color: #7effa5;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Aligned Dropdown </h2>\n" +
                "<p>This is the example for aligned\n" +
                "dropdown.</p>\n" +
                "<div class=\"dropdown\"\n" +
                "style=\"float:left;\">\n" +
                "<button class=\"dropbtn\">Left</button>\n" +
                "<div class=\"dropdown-content\"\n" +
                "style=\"left:0;\">\n" +
                "<a href=\"#\">Link 1</a>\n" +
                "<a href=\"#\">Link 2</a>\n" +
                "<a href=\"#\">Link 3</a>\n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"dropdown\"\n" +
                "style=\"float:right;\">\n" +
                "<button class=\"dropbtn\">Right</button>\n" +
                "<div class=\"dropdown-content\">\n" +
                "<a href=\"#\">Link 1</a>\n" +
                "<a href=\"#\">Link 2</a>\n" +
                "<a href=\"#\">Link 3</a>\n" +
                "</div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView3 = rootView.findViewById(R.id.hovdropcode3);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "ul {\n" +
                "list-style-type: none;\n" +
                "margin: 0;\n" +
                "padding: 0;\n" +
                "overflow: hidden;\n" +
                "background-color: #333;\n" +
                "}\n" +
                "li {\n" +
                "float: left;\n" +
                "}\n" +
                "li a, .dropbtn {\n" +
                "display: inline-block;\n" +
                "color: white;\n" +
                "text-align: center;\n" +
                "\n" +
                "padding: 14px 16px;\n" +
                "text-decoration: none;\n" +
                "}\n" +
                "li a:hover, .dropdown:hover .dropbtn {\n" +
                "background-color: #48d1cc;\n" +
                "}\n" +
                "li.dropdown {\n" +
                "display: inline-block;\n" +
                "}\n" +
                ".dropdown-content {\n" +
                "display: none;\n" +
                "position: absolute;\n" +
                "background-color: #f9f9f9;\n" +
                "min-width: 160px;\n" +
                "box-shadow: 0px 8px 16px 0px\n" +
                "rgba(0,0,0,0.2);\n" +
                "}\n" +
                ".dropdown-content a {\n" +
                "color: black;\n" +
                "padding: 12px 16px;\n" +
                "text-decoration: none;\n" +
                "display: block;\n" +
                "text-align: left;\n" +
                "}\n" +
                ".dropdown-content\n" +
                "a:hover{background-color:#f1f1f1}\n" +
                ".dropdown:hover .dropdown-content {\n" +
                "display: block;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<ul>\n" +
                "<li><a href=\"#home\">Home</a></li>\n" +
                "<li><a href=\"#news\">About Us</a></li>\n" +
                "<li class=\"dropdown\">\n" +
                "<a href=\"#\"class=\"dropbtn\">Dropdown</a>\n" +
                "<div class=\"dropdown-content\">\n" +
                "<a href=\"#\">Link 1</a>\n" +
                "<a href=\"#\">Link 2</a>\n" +
                "<a href=\"#\">Link 3</a>\n" +
                "\n" +
                "</div>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3>Dropdown Menu inside a Navigation\n" +
                "Bar</h3>\n" +
                "<p>Hover over the \"Dropdown\" link\n" +
                "to see the dropdown menu.</p>\n" +
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
