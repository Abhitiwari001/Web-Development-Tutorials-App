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

public class TodoListFragment extends Fragment {
    private InterstitialAd mInterstitialAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_todolist, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        CodeView codeView3 = rootView.findViewById(R.id.todolistcode);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "body {\n" +
                "margin: 0;\n" +
                "min-width: 250px;\n" +
                "}\n" +
                "\n" +
                "ul {\n" +
                "margin: 0;\n" +
                "padding: 0;\n" +
                "}\n" +
                "\n" +
                "ul li {\n" +
                "cursor: pointer;\n" +
                "position: relative;\n" +
                "padding: 12px 8px 12px 40px;\n" +
                "background: #eee;\n" +
                "font-size: 18px;\n" +
                "transition: 0.2s;\n" +
                "-webkit-user-select: none;\n" +
                "-moz-user-select: none;\n" +
                "-ms-user-select: none;\n" +
                "user-select: none;\n" +
                "}\n" +
                "\n" +
                "ul li:nth-child(odd) {\n" +
                "background: #f9f9f9;\n" +
                "}\n" +
                "\n" +
                "ul li:hover {\n" +
                "background: #ddd;\n" +
                "}\n" +
                "ul li.checked {\n" +
                "\n" +
                "background: #888;\n" +
                "color: #fff;\n" +
                "text-decoration: line-through;\n" +
                "}\n" +
                "\n" +
                "ul li.checked::before {\n" +
                "content: '';\n" +
                "position: absolute;\n" +
                "border-color: #fff;\n" +
                "border-style: solid;\n" +
                "border-width: 0 2px 2px 0;\n" +
                "top: 10px;\n" +
                "left: 16px;\n" +
                "transform: rotate(45deg);\n" +
                "height: 15px;\n" +
                "width: 7px;\n" +
                "}\n" +
                ".close {\n" +
                "position: absolute;\n" +
                "right: 0;\n" +
                "top: 0;\n" +
                "padding: 12px 16px 12px 16px\n" +
                "}\n" +
                ".close:hover {\n" +
                "background-color: #f44336;\n" +
                "color: white;\n" +
                "}\n" +
                "\n" +
                ".header {\n" +
                "background-color: #00b867;\n" +
                "padding: 30px 40px;\n" +
                "color: white;\n" +
                "text-align: center;\n" +
                "}\n" +
                "\n" +
                ".header:after {\n" +
                "content: \"\";\n" +
                "display: table;\n" +
                "clear: both;\n" +
                "}\n" +
                "\n" +
                "input {\n" +
                "border: none;\n" +
                "\n" +
                "width: 75%;\n" +
                "padding: 10px;\n" +
                "float: left;\n" +
                "font-size: 16px;\n" +
                "box-sizing: border-box;\n" +
                "\n" +
                "}\n" +
                "\n" +
                ".addBtn {\n" +
                "padding: 10px;\n" +
                "box-sizing: border-box;\n" +
                "width: 25%;\n" +
                "background: #d9d9d9;\n" +
                "color: #555;\n" +
                "float: left;\n" +
                "text-align: center;\n" +
                "font-size: 16px;\n" +
                "cursor: pointer;\n" +
                "transition: 0.3s;\n" +
                "}\n" +
                ".addBtn:hover {\n" +
                "background-color: #bbb;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"myDIV\" class=\"header\">\n" +
                "<h2 style=\"margin:5px\"> To Do List\n" +
                "Example</h2>\n" +
                "<input type=\"text\" id=\"myInput\"\n" +
                "placeholder=\"Title...\">\n" +
                "<span onclick=\"newElement()\"\n" +
                "class=\"addBtn\">Add</span>\n" +
                "</div>\n" +
                "\n" +
                "<ul id=\"myUL\">\n" +
                "<li>Hit the gym</li>\n" +
                "<li class=\"checked\">Pay bills</li>\n" +
                "<li>Clean the Car</li>\n" +
                "\n" +
                "<li>Buy Groceries</li>\n" +
                "<li>Read a book</li>\n" +
                "<li>Organize Home</li>\n" +
                "</ul>\n" +
                "\n" +
                "<script>\n" +
                "\n" +
                "var myNodelist = document\n" +
                ".getElementsByTagName(\"LI\");\n" +
                "var i;\n" +
                "for(i=0; i < myNodelist.length;i++){\n" +
                "var span=document.createElement\n" +
                "(\"SPAN\");\n" +
                "var txt=document.createTextNode\n" +
                "(\"\\u00D7\");\n" +
                "span.className = \"close\";\n" +
                "span.appendChild(txt);\n" +
                "myNodelist[i].appendChild(span);\n" +
                "}\n" +
                "\n" +
                "var close = document\n" +
                ".getElementsByClassName(\"close\");\n" +
                "var i;\n" +
                "for(i=0; i < close.length;i++){\n" +
                "close[i].onclick = function() {\n" +
                "var div = this.parentElement;\n" +
                "div.style.display = \"none\";\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "var list=document.querySelector('ul');\n" +
                "list.addEventListener('click',\n" +
                "function(ev) {\n" +
                "if (ev.target.tagName === 'LI') {\n" +
                "ev.target.classList.toggle('checked');\n" +
                "}\n" +
                "}, false);\n" +
                "function newElement() {\n" +
                "var li=document.createElement(\"li\");\n" +
                "\n" +
                "var inputValue=document\n" +
                ".getElementById(\"myInput\").value;\n" +
                "var t = document.createTextNode\n" +
                "(inputValue);\n" +
                "li.appendChild(t);\n" +
                "if (inputValue === '') {\n" +
                "alert(\"You must write something!\");\n" +
                "} else {\n" +
                "document.getElementById(\"myUL\")\n" +
                ".appendChild(li);\n" +
                "}\n" +
                "document.getElementById(\"myInput\")\n" +
                ".value = \"\";\n" +
                "var span=document.createElement\n" +
                "(\"SPAN\");\n" +
                "var txt=document.createTextNode\n" +
                "(\"\\u00D7\");\n" +
                "span.className = \"close\";\n" +
                "span.appendChild(txt);\n" +
                "li.appendChild(span);\n" +
                "for (i = 0; i < close.length; i++) {\n" +
                "close[i].onclick = function() {\n" +
                "var div = this.parentElement;\n" +
                "div.style.display = \"none\";\n" +
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




