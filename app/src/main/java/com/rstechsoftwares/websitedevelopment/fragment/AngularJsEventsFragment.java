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

public class AngularJsEventsFragment extends Fragment {
AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_angular_js_events, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView textView = rootView.findViewById(R.id.t);
        textView.setText("You can pass the $event object as an argument when calling the function. The $event object\n" +
                "contains the browser's event object:");

        CodeView codeView = rootView.findViewById(R.id.angevent);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID1\" ng-app=\"firstAPP\"\n" +
                "ng-controller=\"Ctrl1\">\n" +
                "<b>Increase the count variable when the\n" +
                "mouse moves over the H1 element:</b>\n" +
                "<h1 ng-mousemove=\"count = count + 1\"\n" +
                ">Mouse Over Me!\n" +
                "</h1>\n" +
                "<h2>{{ count }}</h2>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('firstAPP', []);\n" +
                "app.controller('Ctrl1', function($scope) {\n" +
                "$scope.count = 0;\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID1\"), ['firstAPP']);\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView1 = rootView.findViewById(R.id.angevent2);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id = \"ID2\" ng-app=\"secondAPP\"\n" +
                "ng-controller =\"Ctrl2\">\n" +
                "<button ng-click=\"count = count + 1\">\n" +
                "Click Me!\n" +
                "</button>\n" +
                "<p>{{ count }}</p>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('secondAPP',[]);\n" +
                "app.controller('Ctrl2', function($scope)\n" +
                "{\n" +
                "$scope.count = 0;\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID2\"), ['secondAPP']);\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.angevent3);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "> </script>\n" +
                "<body>\n" +
                "<div id = \"ID3\" ng-app=\"thirdAPP\"\n" +
                "ng-controller=\"Ctrl3\">\n" +
                "<button ng-click=\"myFunc()\">Click Me!\n" +
                "</button>\n" +
                "<div ng-show=\"show\">\n" +
                "<h1>Animals:</h1>\n" +
                "<div>Tiger</div>\n" +
                "<div>Lion</div>\n" +
                "<div>Cheetah</div>\n" +
                "</div>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('thirdAPP',[]);\n" +
                "app.controller('Ctrl3', function($scope)\n" +
                "{\n" +
                "$scope.show = false;\n" +
                "$scope.myFunc = function() {\n" +
                "$scope.show = !$scope.show;\n" +
                "}\n" +
                "});\n" +
                "\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID3\"), ['thirdAPP']);\n" +
                "</script>\n" +
                "<p>Click the button to show/hide the\n" +
                "menu.</p>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView3 = rootView.findViewById(R.id.angevent4);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID4\" ng-app=\"fourthAPP\"\n" +
                "ng-controller=\"Ctrl4\">\n" +
                "<h1 ng-mousemove=\"myFunc($event)\">\n" +
                "Mouse Over Me!\n" +
                "</h1>\n" +
                "<p>Coordinates: {{x + ', ' + y}}</p>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('fourthAPP',[]);\n" +
                "app.controller('Ctrl4', function($scope)\n" +
                "{\n" +
                "$scope.myFunc = function(myE) {\n" +
                "$scope.x = myE.clientX;\n" +
                "$scope.y = myE.clientY;\n" +
                "}\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID4\"), ['fourthAPP']);\n" +
                "</script>\n" +
                "<p>Mouse over the heading to display the\n" +
                "value of clientX and clientY from the\n" +
                "event object.</p>\n" +
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
