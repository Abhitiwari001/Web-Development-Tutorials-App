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

public class AngularJsApiFragment extends Fragment {
    private InterstitialAd mInterstitialAd;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_angular_js_api, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });

        CodeView codeView = rootView.findViewById(R.id.api);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id = \"ID1\" ng-app=\"firstAPP\"\n" +
                "ng-controller =\"Ctrl1\">\n" +
                "<h2>angular.lowercase()</h2>\n" +
                "<p>{{ x1 }}</p>\n" +
                "<p>{{ x2 }}</p>\n" +
                "\n" +
                "<h2>angular.uppercase()</h2>\n" +
                "<p>{{ x3 }}</p>\n" +
                "<p>{{ x4 }}</p>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('firstAPP',[]);\n" +
                "app.controller('Ctrl1', function($scope)\n" +
                "{\n" +
                "$scope.x1 =\"TOMMY\";\n" +
                "$scope.x2 =angular.lowercase($scope.x1);\n" +
                "\n" +
                "$scope.x3 =\"peter\";\n" +
                "$scope.x4 =angular.uppercase($scope.x3);\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID1\"), ['firstAPP']);\n" +
                "\n" +
                "</script>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.api2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID2\" ng-app=\"secondAPP\"\n" +
                "ng-controller =\"Ctrl2\">\n" +
                "<h2>angular.isString()</h2>\n" +
                "<p>{{ x1 }}</p>\n" +
                "<p>{{ x2 }}</p>\n" +
                "\n" +
                "<h2>angular.isNumber()</h2>\n" +
                "<p>{{ x3 }}</p>\n" +
                "<p>{{ x4 }}</p>\n" +
                "\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('secondAPP',[]);\n" +
                "app.controller('Ctrl2', function($scope)\n" +
                "{\n" +
                "$scope.x1 =\"JOHN\";\n" +
                "$scope.x2 =angular.isString($scope.x1);\n" +
                "$scope.x3 =24;\n" +
                "$scope.x4 =angular.isNumber($scope.x3);\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID2\"), ['secondAPP']);\n" +
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
