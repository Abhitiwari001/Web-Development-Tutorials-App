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

public class AngularJsFiltersFragment extends Fragment {
    private InterstitialAd mInterstitialAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_angular_js_filters, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });

        CodeView codeView = rootView.findViewById(R.id.filter_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID1\" ng-app=\"firstAPP\"\n" +
                "ng-controller=\"Ctrl1\">\n" +
                "<p>The uppercase filter format strings\n" +
                "to upper case.</p>\n" +
                "<p>The name is {{ lastName | uppercase }}\n" +
                "</p>\n" +
                "<p>The lowercase filter format strings to\n" +
                "lower case.</p>\n" +
                "<p>The name is {{ lastName | lowercase }}\n" +
                "</p>\n" +
                "\n" +
                "</div>\n" +
                "<script>\n" +
                "angular.module('firstAPP',[]).controller\n" +
                "('Ctrl1', function($scope) {\n" +
                "$scope.firstName = \"Tom\",\n" +
                "$scope.lastName = \"Jerry\"\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID1\"), ['firstAPP']);\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.filter_code2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id = \"ID2\" ng-app=\"secondAPP\"\n" +
                "ng-controller=\"Ctrl2\">\n" +
                "<ul>\n" +
                "<li ng-repeat=\"x in names | filter:'e'\">\n" +
                "{{ x }}\n" +
                "</li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "\n" +
                "<script>\n" +
                "angular.module('secondAPP',[]).\n" +
                "controller('Ctrl2',function($scope) {\n" +
                "$scope.names = [\n" +
                "'Tiger',\n" +
                "'Cheetah',\n" +
                "'BlueWhale',\n" +
                "'Dugong',\n" +
                "'Orca',\n" +
                "'Elephant',\n" +
                "'Bison',\n" +
                "'Bear',\n" +
                "'Deer'\n" +
                "];\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID2\"), ['secondAPP']);\n" +
                "</script>\n" +
                "<p>This example displays only the names\n" +
                "containing the letter \"e\".</p>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView3 = rootView.findViewById(R.id.filter_code3);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID3\" ng-app=\"thirdAPP\"\n" +
                "ng-controller=\"Ctrl3\">\n" +
                "\n" +
                "<p>Type a letter in the input field:\n" +
                "</p>\n" +
                "<p><input type=\"text\" ng-model=\"test\">\n" +
                "</p>\n" +
                "<ul>\n" +
                "<li ng-repeat=\"x in names | filter:test\">\n" +
                "{{ x }}\n" +
                "</li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<script>\n" +
                "angular.module('thirdAPP',[]).controller\n" +
                "('Ctrl3', function($scope) {\n" +
                "$scope.names = [\n" +
                "'Lion',\n" +
                "'Cheetah',\n" +
                "'Shark',\n" +
                "'Dugong',\n" +
                "'Orca',\n" +
                "'Elephant',\n" +
                "'Bison',\n" +
                "'Bear',\n" +
                "'Deer'\n" +
                "];\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID3\"), ['thirdAPP']);\n" +
                "</script>\n" +
                "<p>The list will only consists of names\n" +
                "matching the filter.</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView4 = rootView.findViewById(R.id.filter_code4);
        codeView4.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID4\" ng-app=\"fourthAPP\"\n" +
                "ng-controller=\"Ctrl4\">\n" +
                "<ul>\n" +
                "<li ng-repeat=\"x in names\">\n" +
                "{{x | myFilter}}\n" +
                "</li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('fourthAPP',[]);\n" +
                "app.filter('myFilter', function() {\n" +
                "return function(x) {\n" +
                "var i, c, txt = \"\";\n" +
                "for (i = 0; i < x.length; i++) {\n" +
                "c = x[i];\n" +
                "if (i % 2 == 0) {\n" +
                "c = c.toUpperCase();\n" +
                "}\n" +
                "txt += c;\n" +
                "}\n" +
                "return txt;\n" +
                "};\n" +
                "});\n" +
                "app.controller('Ctrl4', function($scope)\n" +
                "{\n" +
                "$scope.names = [\n" +
                "'Lion',\n" +
                "'Cheetah',\n" +
                "'Shark',\n" +
                "'Dugong',\n" +
                "'Orca',\n" +
                "'Elephant',\n" +
                "'Bison',\n" +
                "\n" +
                "'Bear',\n" +
                "'Deer'\n" +
                "];\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID4\"), ['fourthAPP']);\n" +
                "</script>\n" +
                "<p>Make your own filters.</p>\n" +
                "<p> This filter, called \"myFilter\", will\n" +
                "uppercase every other character.</p>\n" +
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
