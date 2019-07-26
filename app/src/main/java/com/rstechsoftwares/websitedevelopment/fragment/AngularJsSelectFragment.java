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

public class AngularJsSelectFragment extends Fragment {
AdView   mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_angular_js_select, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        CodeView codeView = rootView.findViewById(R.id.ngoption);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "> </script>\n" +
                "<body>\n" +
                "<div id = \"ID1\" ng-app=\"firstAPP\"\n" +
                "ng-controller=\"Ctrl1\">\n" +
                "<select ng-model=\"selectedName\"\n" +
                "ng-options=\"x for x in names\">\n" +
                "</select>\n" +
                "\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('firstAPP',[]);\n" +
                "app.controller('Ctrl1', function($scope)\n" +
                "{\n" +
                "$scope.names = [\"Tiger\", \"Lion\",\n" +
                "\"Puma\"];\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID1\"), ['firstAPP']);\n" +
                "</script>\n" +
                "<p>This example shows how to fill a\n" +
                "dropdown list using the ng-options\n" +
                "directive.</p>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.ngoption2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID2\" ng-app=\"secondAPP\"\n" +
                "ng-controller =\"Ctrl2\">\n" +
                "<select>\n" +
                "<option ng-repeat=\"x in names\">{{x}}\n" +
                "</option>\n" +
                "</select>\n" +
                "\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('secondAPP', []);\n" +
                "app.controller('Ctrl2', function($scope) {\n" +
                "$scope.names = [\"Tiger\", \"Lion\",\n" +
                "\"Puma\"];\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID2\"), ['secondAPP']);\n" +
                "</script>\n" +
                "<p>This example shows how to fill a\n" +
                "dropdown list using the ng-repeat\n" +
                "\n" +
                "directive.\n" +
                "</p>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView3 = rootView.findViewById(R.id.ngoption3);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID3\" ng-app=\"thirdAPP\"\n" +
                "ng-controller=\"Ctrl3\">\n" +
                "<b>Select a car:</b>\n" +
                "<select ng-model=\"selectedCar\"\n" +
                "ng-options=\"y.brand\n" +
                "for (x, y) in cars\">\n" +
                "</select>\n" +
                "<h1>You selected:{{selectedCar.brand}}\n" +
                "</h1>\n" +
                "<h2>Model: {{selectedCar.model}}</h2>\n" +
                "<h3>Color: {{selectedCar.color}}</h3>\n" +
                "<p>The visible text inside the dropdown\n" +
                "list can also be a property of the value\n" +
                "object.</p>\n" +
                "\n" +
                "<hr>\n" +
                "\n" +
                "<b>Select a car:</b>\n" +
                "<select ng-model=\"selectedCar1\"\n" +
                "ng-options=\"x for\n" +
                "(x, y) in cars\">\n" +
                "</select>\n" +
                "<h1>You selected: {{selectedCar1.brand}}\n" +
                "</h1>\n" +
                "<h2>Model: {{selectedCar1.model}}</h2>\n" +
                "<h3>Color: {{selectedCar1.color}}</h3>\n" +
                "<p>Note that the selected value\n" +
                "represents an object.</p>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('thirdAPP', []);\n" +
                "app.controller('Ctrl3', function($scope) {\n" +
                "$scope.cars = {\n" +
                "car01 : {brand : \"Tesla\", model :\"Model S\",\n" +
                "color : \"red\"},\n" +
                "car02 : {brand : \"Ford\", model :\"GT\",\n" +
                "color : \"blue\"},\n" +
                "car03 : {brand : \"Volvo\", model :\"S90\",\n" +
                "color : \"black\"}\n" +
                "}\n" +
                "});\n" +
                "\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID3\"), ['thirdAPP']);\n" +
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