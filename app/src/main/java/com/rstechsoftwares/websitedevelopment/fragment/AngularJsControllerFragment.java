package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class AngularJsControllerFragment extends Fragment {
AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_angular_js_controller, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView textView = rootView.findViewById(R.id.cont1);
        textView.setText("The AngularJS application is defined by ng-app = \" \". The application runs inside the <div>.");

        TextView textView2 = rootView.findViewById(R.id.cont2);
        textView2.setText("The ng-controller = \" \" attribute is an AngularJS directive. It defines a controller.");


        CodeView codeView = rootView.findViewById(R.id.cont_code1);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id = \"ID1\" ng-app=\"firstAPP\"\n" +
                "ng-controller=\"myCtrl1\">\n" +
                "First Name: <input type=\"text\"\n" +
                "ng-model=\"firstName\">\n" +
                "<br>\n" +
                "Last Name: <input type=\"text\"\n" +
                "ng-model=\"lastName\">\n" +
                "<br>\n" +
                "Full Name: {{firstName + \" \" + lastName}}\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('firstAPP',[]);\n" +
                "app.controller('myCtrl1',function($scope)\n" +
                "{\n" +
                "$scope.firstName = \"Tom\"\n" +
                "$scope.lastName = \"Jerry\";\n" +
                "\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID1\"), ['firstAPP']);\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.cont_code2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id = \"ID2\" ng-app=\"secondAPP\"\n" +
                "ng-controller=\"Ctrl2\">\n" +
                "First Name: <input type=\"text\"\n" +
                "ng-model=\"firstName\">\n" +
                "<br>\n" +
                "Last Name: <input type=\"text\"\n" +
                "ng-model=\"lastName\">\n" +
                "<br>\n" +
                "Full Name: {{fullName()}}\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('secondAPP',[]);\n" +
                "app.controller('Ctrl2', function($scope)\n" +
                "{\n" +
                "$scope.firstName = \"Elon\";\n" +
                "\n" +
                "$scope.lastName = \"Musk\";\n" +
                "$scope.fullName = function() {\n" +
                "return $scope.firstName + \" \" + $scope.\n" +
                "lastName;\n" +
                "};\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID2\"),\n" +
                "['secondAPP']);\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView3 = rootView.findViewById(R.id.cont_code3);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com/\n" +
                "ajax/libs/angularjs/1.6.9/angular.min.js\">\n" +
                "</script>\n" +
                "<body>\n" +
                "<div id =\"ID3\" ng-app=\"thirdAPP\"\n" +
                "ng-controller=\"Ctrl3\">\n" +
                "<h1 ng-click=\"changeName()\">\n" +
                "{{firstname}}</h1>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('thirdAPP',[]);\n" +
                "app.controller('Ctrl3', function($scope) {\n" +
                "$scope.firstname = \"Steve\";\n" +
                "$scope.changeName = function() {\n" +
                "$scope.firstname = \"Peter\";\n" +
                "}\n" +
                "});\n" +
                "\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID3\"), ['thirdAPP']);\n" +
                "</script>\n" +
                "<p>Click on the header to run the\n" +
                "\"changeName\"function.</p>\n" +
                "<p>This example demonstrates how to use\n" +
                "the controller to change model data.</p>\n" +
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
