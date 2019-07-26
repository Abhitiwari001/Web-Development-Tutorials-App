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

public class AngularJsExpressionsFragment extends Fragment {
AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_angular_js_expressions, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView textView = rootView.findViewById(R.id.angjs_exp);
        textView.setText("AngularJS expressions can be written inside double braces: {{ expression }}.\n" +
                "AngularJS expressions can also be written inside a directive: ng-bind=\"expression\".\n" +
                "AngularJS will resolve the expression, and return the result exactly where the expression is written.\n" +
                "AngularJS expressions are much like JavaScript expressions: They can contain literals, operators,\n" +
                "and variables.\n" +
                "Example {{ 5 + 5 }} or {{ firstName + \" \" + lastName }}");
        CodeView codeView = rootView.findViewById(R.id.angjs_expcode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.\n" +
                "com/ajax/libs/angularjs/1.6.9/angular.\n" +
                "min.js\"></script>\n" +
                "<body>\n" +
                "<div ng-app>\n" +
                "<p>Expression With Directive:{{ 6 + 6 }}\n" +
                "</p>\n" +
                "</div>\n" +
                "\n" +
                "<p> If you remove the ng-app directive,\n" +
                "HTML will display the expression as it\n" +
                "is, without solving it.\n" +
                "As you can see below.</p>\n" +
                "\n" +
                "<div>\n" +
                "<p>Expression Without Directive:{{6 + 6}}\n" +
                "</p>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView1 = rootView.findViewById(R.id.angjs_no);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com/\n" +
                "ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div ng-app=\"\" ng-init=\"quantity=2;\n" +
                "cost=5\">\n" +
                "\n" +
                "<p>Total Amount: {{ quantity * cost }}\n" +
                "</p>\n" +
                "\n" +
                "<p> The same example using ng-bind below.\n" +
                "</p>\n" +
                "\n" +
                "<p>Total Amount: <span ng-bind=\"quantity\n" +
                "* cost\">\n" +
                "</span></p>\n" +
                "\n" +
                "<div/>\n" +
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
