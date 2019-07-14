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

public class AngularJsModelFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_angular_js_model, container, false);
        CodeView codeView = rootView.findViewById(R.id.angmodelcode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.\n" +
                "js\"></script>\n" +
                "<body>\n" +
                "<div id =\"ID1\" ng-app=\"firstApp\"\n" +
                "ng-controller=\"myCtrl1\">\n" +
                "Name: <input ng-model=\"name\">\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('firstApp',[]);\n" +
                "app.controller('myCtrl1', function\n" +
                "($scope) {\n" +
                "$scope.name = \"Dangerous Dave \";\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID1\"), ['firstAPP']);\n" +
                "</script>\n" +
                "<p>Use the ng-model directive to bind\n" +
                "the value of the input field to a\n" +
                "property made in the controller.\n" +
                "</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.angmodelcode2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID2\" ng-app=\"secondAPP\"\n" +
                "ng-controller=\"myCtrl2\">\n" +
                "Name: <input ng-model=\"name\">\n" +
                "<h1>You entered: {{name}}</h1>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('secondAPP',[]);\n" +
                "app.controller('myCtrl2', function($scope)\n" +
                "{\n" +
                "$scope.name = \"Tom Jerry\";\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID2\"), ['secondAPP']);\n" +
                "</script>\n" +
                "\n" +
                "<p>Change the name inside the input\n" +
                "field,and you will see the name in the\n" +
                "header changes accordingly.\n" +
                "</p>");
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
