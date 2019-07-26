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
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class ToggleSwitchFragment extends Fragment {
AdView mAdView;
    private InterstitialAd mInterstitialAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_toggle_switch, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        CodeView codeView3 = rootView.findViewById(R.id.toggleswitchcode);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "/* The switch - the box around the\n" +
                "slider */\n" +
                ".switch {\n" +
                "position: relative;\n" +
                "display: inline-block;\n" +
                "width: 60px;\n" +
                "height: 34px;\n" +
                "}\n" +
                ".switch input {display:none;}\n" +
                ".slider {\n" +
                "position: absolute;\n" +
                "cursor: pointer;\n" +
                "top: 0;\n" +
                "left: 0;\n" +
                "right: 0;\n" +
                "bottom: 0;\n" +
                "background-color: #ccc;\n" +
                "-webkit-transition: .4s;\n" +
                "transition: .4s;\n" +
                "}\n" +
                ".slider:before {\n" +
                "position: absolute;\n" +
                "content: \"\";\n" +
                "height: 26px;\n" +
                "width: 26px;\n" +
                "left: 4px;\n" +
                "bottom: 4px;\n" +
                "background-color: white;\n" +
                "-webkit-transition: .4s;\n" +
                "transition: .4s;\n" +
                "}\n" +
                "input:checked + .slider {\n" +
                "background-color: #2196F3;\n" +
                "}\n" +
                "\n" +
                "input:focus + .slider {\n" +
                "box-shadow: 0 0 1px #2196F3;\n" +
                "}\n" +
                "input:checked + .slider:before {\n" +
                "-webkit-transform: translateX(26px);\n" +
                "-ms-transform: translateX(26px);\n" +
                "transform: translateX(26px);\n" +
                "}\n" +
                "/* Rounded sliders */\n" +
                ".slider.round {\n" +
                "border-radius: 34px;\n" +
                "}\n" +
                ".slider.round:before {\n" +
                "border-radius: 50%;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Toggle Switch</h2>\n" +
                "<!-- Rectangular switch -->\n" +
                "<label class=\"switch\">\n" +
                "<input type=\"checkbox\">\n" +
                "<div class=\"slider\"></div>\n" +
                "</label>\n" +
                "<label class=\"switch\">\n" +
                "<input type=\"checkbox\" checked>\n" +
                "<div class=\"slider\"></div>\n" +
                "</label><br><br>\n" +
                "\n" +
                "<!-- Rounded switch -->\n" +
                "<label class=\"switch\">\n" +
                "<input type=\"checkbox\">\n" +
                "<div class=\"slider round\"></div>\n" +
                "</label>\n" +
                "<label class=\"switch\">\n" +
                "<input type=\"checkbox\" checked>\n" +
                "<div class=\"slider round\"></div>\n" +
                "</label>\n" +
                "\n" +
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





