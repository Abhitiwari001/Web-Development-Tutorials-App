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

public class AngularJsAnimationFragment extends Fragment implements RewardedVideoAdListener {
    private RewardedVideoAd mRewardedVideoAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_js_animation, container, false);
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        TextView textView = rootView.findViewById(R.id.anim);
        textView.setText("<script src = \"https://ajax.googleapis.com/ajax/libs/angular js/1.6.9/angular-animate.js\"> </script>");

        TextView textView2 = rootView.findViewById(R.id.anim2);
        textView2.setText("<body ng-app=\"ngAnimate\">");
        CodeView codeView1 = rootView.findViewById(R.id.anim6);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                ".one{\n" +
                "transition: all linear 0.5s;\n" +
                "background-color: turquoise;\n" +
                "height: 100px;\n" +
                "}\n" +
                ".ng-hide {\n" +
                "height: 0;\n" +
                "}\n" +
                "</style>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.\n" +
                "js\"></script>\n" +
                "<script src=\"https://ajax.googleapis.com/\n" +
                "\n" +
                "ajax/libs/angularjs/1.6.9/angular-\n" +
                "animate.js\"></script>\n" +
                "\n" +
                "<body ng-app=\"firstAPP\">\n" +
                "<h1>Hide the DIV: <input type=\"checkbox\"\n" +
                "ng-model=\"myCheck\"></h1>\n" +
                "<div class =\"one\" id =\"ID1\"\n" +
                "ng-hide=\"myCheck\">\n" +
                "</div>\n" +
                "<script>\n" +
                "var app=angular.module('firstAPP',\n" +
                "['ngAnimate']);\n" +
                "angular.bootstrap(document.getElementById\n" +
                "(\"ID1\"), ['firstAPP']);\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.anim7);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "@keyframes myChange {\n" +
                "from {\n" +
                "height: 100px;\n" +
                "} to {\n" +
                "height: 0;\n" +
                "}\n" +
                "}\n" +
                "div{\n" +
                "height: 100px;\n" +
                "background-color: lightblue;\n" +
                "}\n" +
                "div.ng-hide {\n" +
                "animation: 0.5s myChange;\n" +
                "}\n" +
                "</style>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "/ajax/libs/angularjs/1.6.9/angular.min.\n" +
                "js\"></script>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                "\n" +
                "/ajax/libs/angularjs/1.6.9/angular-\n" +
                "animate.js\"></script>\n" +
                "\n" +
                "<body ng-app=\"ngAnimate\">\n" +
                "Hide the DIV: <input type=\"checkbox\"\n" +
                "ng-model=\"myCheck\">\n" +
                "<div ng-hide=\"myCheck\">\n" +
                "</div>\n" +
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
