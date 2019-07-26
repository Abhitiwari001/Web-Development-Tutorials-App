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

public class AccordionFragment extends Fragment {
    private InterstitialAd mInterstitialAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_accordion, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        CodeView codeView = rootView.findViewById(R.id.accordiancode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "button.accordion {\n" +
                "background-color: #eee;\n" +
                "color: #444;\n" +
                "cursor: pointer;\n" +
                "padding: 18px;\n" +
                "width: 100%;\n" +
                "border: none;\n" +
                "text-align: left;\n" +
                "outline: none;\n" +
                "font-size: 15px;\n" +
                "transition: 0.4s;\n" +
                "}\n" +
                "\n" +
                "button.accordion.active,\n" +
                "button.accordion:hover {\n" +
                "background-color: #ddd;\n" +
                "}\n" +
                "\n" +
                "button.accordion:after {\n" +
                "/* Unicode character for \"plus\" sign\n" +
                "(+) is '\\02795' */\n" +
                "content: '\\02795';\n" +
                "font-size: 13px;\n" +
                "color: #777;\n" +
                "float: right;\n" +
                "margin-left: 5px;\n" +
                "}\n" +
                "\n" +
                "button.accordion.active:after {\n" +
                "/* Unicode character for \"minus\" sign\n" +
                "(-) is '\\2796' */\n" +
                "\n" +
                "content: \"\\2796\";\n" +
                "}\n" +
                "\n" +
                "div.panel {\n" +
                "padding: 0 18px;\n" +
                "background-color: white;\n" +
                "max-height: 0;\n" +
                "overflow: hidden;\n" +
                "transition: 0.6s ease-in-out;\n" +
                "opacity: 0;\n" +
                "}\n" +
                "div.panel.show {\n" +
                "opacity: 1;\n" +
                "max-height: 500px;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Accordion Example</h2>\n" +
                "<p>In this example we have added a\n" +
                "\"plus\" sign to each button. When the\n" +
                "user clicks on the button,the \"plus\"\n" +
                "sign is replaced with\"minus\"sign.</p>\n" +
                "<button class=\"accordion\">Tiger\n" +
                "</button>\n" +
                "<div class=\"panel\">\n" +
                "<p>The tiger is the largest cat\n" +
                "species, most recognisable for their\n" +
                "pattern of dark vertical stripes on\n" +
                "reddish-orange fur with a lighter\n" +
                "underside.</p>\n" +
                "</div>\n" +
                "<button class=\"accordion\">Lion</button>\n" +
                "<div class=\"panel\">\n" +
                "<p>The lion is one of the big cats\n" +
                "in the genus Panthera and a member of\n" +
                "the family Felidae.The commonly used\n" +
                "term African lion collectively denotes\n" +
                "the several subspecies in Africa.</p>\n" +
                "\n" +
                "</div>\n" +
                "<button class=\"accordion\">Cheetah\n" +
                "</button>\n" +
                "<div class=\"panel\">\n" +
                "<p>The cheetah, also known as the\n" +
                "hunting leopard, is a big cat that\n" +
                "occurs mainly in easternand southern\n" +
                "Africa and a few parts of Iran</p>\n" +
                "</div>\n" +
                "<script>\n" +
                "var acc = document\n" +
                ".getElementsByClassName(\"accordion\");\n" +
                "var i;\n" +
                "for (i = 0; i < acc.length; i++) {\n" +
                "acc[i].onclick = function(){\n" +
                "this.classList.toggle(\"active\");\n" +
                "this.nextElementSibling.classList\n" +
                ".toggle(\"show\");\n" +
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
