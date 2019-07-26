package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class AngularJsScopesFragment extends Fragment implements RewardedVideoAdListener {
    private RewardedVideoAd mRewardedVideoAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_angular_js_scopes, container, false);
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        TextView textView = rootView.findViewById(R.id.scope_tv1);
        textView.setText("The AngularJS application is defined by ng-app = \" \". The application runs inside the <div>.\n" +
                "The ng-controller = \" \" attribute is an AngularJS directive. It defines a controller.");
        CodeView codeView = rootView.findViewById(R.id.scopecode1);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID1\" ng-app=\"firstAPP\"\n" +
                "ng-controller=\"Ctrl1\">\n" +
                "<h1>{{bikename}}</h1>\n" +
                "</div>\n" +
                "<script>\n" +
                "var app = angular.module('firstAPP',[]);\n" +
                "app.controller('Ctrl1', function($scope)\n" +
                "{\n" +
                "$scope.bikename = \"Honda\";\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "\n" +
                "(\"ID1\"), ['firstAPP']);\n" +
                "</script>\n" +
                "<p>The property \"bikename\" was made in\n" +
                "the controller, and can be referred to\n" +
                "in the view by using the {{ }} brackets.\n" +
                "</p>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.scopecode2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.js\"\n" +
                "></script>\n" +
                "<body>\n" +
                "<div id =\"ID2\" ng-app=\"secondAPP\"\n" +
                "ng-controller=\"Ctrl2\">\n" +
                "<ul>\n" +
                "<li ng-repeat=\"x in names\">{{x}}</li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<script>\n" +
                "\n" +
                "var app = angular.module('secondAPP',[]);\n" +
                "app.controller('Ctrl2', function($scope)\n" +
                "{\n" +
                "$scope.names = [\"Mark\", \"Alexander\",\n" +
                "\"Leo\"];\n" +
                "});\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID2\"), ['secondAPP']);\n" +
                "</script>\n" +
                "<p>The variable \"x\" has a different\n" +
                "value for each repetition, proving that\n" +
                "each repetition has its own scope.\n" +
                "</p>\n" +
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
    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }
    @Override
    public void onRewarded(RewardItem reward) {
        Toast.makeText(getContext(), "onRewarded! currency: " + reward.getType() + "  amount: " +
                reward.getAmount(), Toast.LENGTH_SHORT).show();
        // Reward the user.
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {
        Toast.makeText(getContext(), "onRewardedVideoAdLeftApplication",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdClosed() {
        Toast.makeText(getContext(), "onRewardedVideoAdClosed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int errorCode) {
        Toast.makeText(getContext(), "onRewardedVideoAdFailedToLoad", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdLoaded() {
        mRewardedVideoAd.show();
    }

    @Override
    public void onRewardedVideoAdOpened() {
        Toast.makeText(getContext(), "onRewardedVideoAdOpened", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoStarted() {
        Toast.makeText(getContext(), "onRewardedVideoStarted", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoCompleted() {
        Toast.makeText(getContext(), "onRewardedVideoCompleted", Toast.LENGTH_SHORT).show();
    }

}
