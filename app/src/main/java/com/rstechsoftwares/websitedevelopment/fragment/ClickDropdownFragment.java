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

public class ClickDropdownFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_click_dropdown, container, false);
        CodeView codeView = rootView.findViewById(R.id.clickdropcode1);
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
                ".dropbtn:hover, .dropbtn:focus {\n" +
                "background-color: #7effa5;\n" +
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
                "overflow: auto;\n" +
                "box-shadow: 0px 8px 16px 0px\n" +
                "rgba(0,0,0,0.2);\n" +
                "}\n" +
                ".dropdown-content a {\n" +
                "color: black;\n" +
                "padding: 12px 16px;\n" +
                "text-decoration: none;\n" +
                "display: block;\n" +
                "}\n" +
                ".dropdown a:hover\n" +
                "{background-color: #f1f1f1}\n" +
                ".show {display:block;}\n" +
                "\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Clickable Dropdown Example</h2>\n" +
                "<p>Click on the button to open\n" +
                "the dropdown menu.</p>\n" +
                "<div class=\"dropdown\">\n" +
                "<button onclick=\"myFunction()\"\n" +
                "class=\"dropbtn\">Dropdown</button>\n" +
                "<div id=\"myDropdown\"\n" +
                "class=\"dropdown-content\">\n" +
                "<a href=\"#home\">Home</a>\n" +
                "<a href=\"#about\">About</a>\n" +
                "<a href=\"#contact\">Contact</a>\n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "<script>\n" +
                "function myFunction() {\n" +
                "document.getElementById(\"myDropdown\")\n" +
                ".classList.toggle(\"show\");\n" +
                "}\n" +
                "window.onclick = function(event) {\n" +
                "if(!event.target.matches('.dropbtn')){\n" +
                "var dropdowns = document\n" +
                ".getElementsByClassName\n" +
                "(\"dropdown-content\");\n" +
                "var i;\n" +
                "for(i=0; i < dropdowns.length; i++) {\n" +
                "var openDropdown = dropdowns[i];\n" +
                "if (openDropdown.classList.contains\n" +
                "('show')) {\n" +
                "openDropdown.classList.remove('show');\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.clickdropcode2);
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
                ".dropbtn:hover, .dropbtn:focus {\n" +
                "background-color: #7effa5;\n" +
                "}\n" +
                ".dropdown {\n" +
                "float: right;\n" +
                "position: relative;\n" +
                "display: inline-block;\n" +
                "}\n" +
                ".dropdown-content {\n" +
                "display: none;\n" +
                "position: absolute;\n" +
                "background-color: #f9f9f9;\n" +
                "min-width: 160px;\n" +
                "overflow: auto;\n" +
                "box-shadow: 0px 8px 16px 0px\n" +
                "rgba(0,0,0,0.2);\n" +
                "right: 0;\n" +
                "}\n" +
                "\n" +
                ".dropdown-content a {\n" +
                "color: black;\n" +
                "padding: 12px 16px;\n" +
                "text-decoration: none;\n" +
                "display: block;\n" +
                "}\n" +
                ".dropdown a:hover\n" +
                "{background-color: #f1f1f1}\n" +
                ".show {display:block;}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Aligned Dropdown Content\n" +
                "Example</h2>\n" +
                "<p>Use <strong>float: right</strong>\n" +
                "on the dropdown class to float the\n" +
                "dropdown menu to the right,and\n" +
                "<strong>right:0</strong>on the\n" +
                "dropdown-content,if you want the\n" +
                "dropdown content to go from\n" +
                "right to left.</p>\n" +
                "<div class=\"dropdown\">\n" +
                "<button onclick=\"myFunction()\"\n" +
                "class=\"dropbtn\">Dropdown</button>\n" +
                "<div id=\"myDropdown\"\n" +
                "class=\"dropdown-content\">\n" +
                "<a href=\"#home\">Home</a>\n" +
                "<a href=\"#about\">About</a>\n" +
                "<a href=\"#contact\">Contact</a>\n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "<script>\n" +
                "function myFunction() {\n" +
                "document.getElementById(\"myDropdown\")\n" +
                ".classList.toggle(\"show\");\n" +
                "}\n" +
                "\n" +
                "window.onclick = function(event) {\n" +
                "if(!event.target.matches('.dropbtn')){\n" +
                "var dropdowns = document\n" +
                ".getElementsByClassName\n" +
                "(\"dropdown-content\");\n" +
                "var i;\n" +
                "for(i=0; i < dropdowns.length; i++){\n" +
                "var openDropdown = dropdowns[i];\n" +
                "if (openDropdown.classList.contains\n" +
                "('show')) {\n" +
                "openDropdown.classList.remove('show');\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView3 = rootView.findViewById(R.id.clickdropcode3);
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
                "\n" +
                "li {\n" +
                "float: left;\n" +
                "}\n" +
                "li a, .dropbtn {\n" +
                "display: inline-block;\n" +
                "color: white;\n" +
                "text-align: center;\n" +
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
                ".dropdown-content a:hover\n" +
                "{background-color: #f1f1f1}\n" +
                ".show {display:block;}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<ul>\n" +
                "<li><a href=\"#home\">Home</a></li>\n" +
                "<li><a href=\"#news\">About Us</a></li>\n" +
                "<li class=\"dropdown\">\n" +
                "\n" +
                "<a href=\"javascript:void(0)\"\n" +
                "class=\"dropbtn\"\n" +
                "onclick=\"myFunction()\">Dropdown</a>\n" +
                "<div class=\"dropdown-content\"\n" +
                "id=\"myDropdown\">\n" +
                "<a href=\"#\">Link 1</a>\n" +
                "<a href=\"#\">Link 2</a>\n" +
                "<a href=\"#\">Link 3</a>\n" +
                "</div>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3>Dropdown Menu inside a\n" +
                "Navigation Bar</h3>\n" +
                "<p>Click on the \"Dropdown\" link to\n" +
                "see the dropdown menu.</p>\n" +
                "<script>\n" +
                "function myFunction() {\n" +
                "document.getElementById(\"myDropdown\")\n" +
                ".classList.toggle(\"show\");\n" +
                "}\n" +
                "\n" +
                "window.onclick = function(e) {\n" +
                "if (!e.target.matches('.dropbtn')) {\n" +
                "var dropdowns = document\n" +
                ".getElementsByClassName\n" +
                "(\"dropdown-content\");\n" +
                "for (var d = 0; d < dropdowns\n" +
                ".length; d++) {\n" +
                "var openDropdown = dropdowns[d];\n" +
                "if(openDropdown.classList.contains\n" +
                "('show')){\n" +
                "openDropdown.classList.remove('show');\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "</script>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView4 = rootView.findViewById(R.id.clickdropcode4);
        codeView4.setCode("<!DOCTYPE html>\n" +
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
                ".dropbtn:hover, .dropbtn:focus {\n" +
                "background-color: #7effa5;\n" +
                "}\n" +
                "#myInput {\n" +
                "border-box: box-sizing;\n" +
                "background-image:url('search.png');\n" +
                "background-position: 14px 12px;\n" +
                "background-repeat: no-repeat;\n" +
                "font-size: 16px;\n" +
                "padding: 14px 20px 12px 45px;\n" +
                "border: none;\n" +
                "}\n" +
                ".dropdown {\n" +
                "position: relative;\n" +
                "display: inline-block;\n" +
                "}\n" +
                "\n" +
                ".dropdown-content {\n" +
                "display: none;\n" +
                "position: absolute;\n" +
                "background-color: #f6f6f6;\n" +
                "min-width: 230px;\n" +
                "overflow: auto;\n" +
                "box-shadow: 0px 8px 16px 0px\n" +
                "rgba(0,0,0,0.2);\n" +
                "}\n" +
                ".dropdown-content a {\n" +
                "color: black;\n" +
                "padding: 12px 16px;\n" +
                "text-decoration: none;\n" +
                "display: block;\n" +
                "}\n" +
                ".dropdown a:hover\n" +
                "{background-color: #ddd}\n" +
                ".show {display:block;}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Search/Filter Dropdown Example</h2>\n" +
                "<p>Click on the button to open the\n" +
                "dropdown menu,and use the input field\n" +
                "to search for a specific\n" +
                "dropdown link.</p>\n" +
                "<div class=\"dropdown\">\n" +
                "<button onclick=\"myFunction()\"\n" +
                "class=\"dropbtn\">Dropdown</button>\n" +
                "<div id=\"myDropdown\"\n" +
                "class=\"dropdown-content\">\n" +
                "<input type=\"text\"\n" +
                "placeholder=\"Search..\"\n" +
                "id=\"myInput\"onkeyup=\"filterFunction()\">\n" +
                "<a href=\"#about\">About</a>\n" +
                "<a href=\"#base\">Base</a>\n" +
                "<a href=\"#blog\">Blog</a>\n" +
                "<a href=\"#contact\">Contact</a>\n" +
                "<a href=\"#custom\">Custom</a>\n" +
                "<a href=\"#support\">Support</a>\n" +
                "<a href=\"#tools\">Tools</a>\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<script>\n" +
                "function myFunction() {\n" +
                "document.getElementById(\"myDropdown\")\n" +
                ".classList.toggle(\"show\");\n" +
                "}\n" +
                "function filterFunction() {\n" +
                "var input, filter, ul, li, a, i;\n" +
                "input = document.getElementById\n" +
                "(\"myInput\");\n" +
                "filter = input.value.toUpperCase();\n" +
                "div = document.getElementById\n" +
                "(\"myDropdown\");\n" +
                "a = div.getElementsByTagName(\"a\");\n" +
                "for (i = 0; i < a.length; i++) {\n" +
                "if (a[i].innerHTML.toUpperCase()\n" +
                ".indexOf(filter) > -1) {\n" +
                "a[i].style.display = \"\";\n" +
                "} else {\n" +
                "a[i].style.display=\"none\";\n" +
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

