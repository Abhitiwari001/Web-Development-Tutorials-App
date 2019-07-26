package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public class TooltipFragment extends Fragment  implements RewardedVideoAdListener {
    private RewardedVideoAd mRewardedVideoAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_tool_tip, container, false);
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        CodeView codeView3 = rootView.findViewById(R.id.tooltipcode);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "/* This is for tooltip Container */\n" +
                ".tooltip {\n" +
                "position: relative;\n" +
                "display: inline-block;\n" +
                "border-bottom: 1px dotted black;\n" +
                "}\n" +
                "\n" +
                "/* This is for tooltip text */\n" +
                ".tooltip .tooltiptext {\n" +
                "visibility: hidden;\n" +
                "width: 120px;\n" +
                "background-color: #555;\n" +
                "color: #fff;\n" +
                "text-align: center;\n" +
                "border-radius: 6px;\n" +
                "padding: 5px 0;\n" +
                "position: absolute;\n" +
                "z-index: 1;\n" +
                "bottom: 125%;\n" +
                "left: 50%;\n" +
                "margin-left: -60px;\n" +
                "opacity: 0;\n" +
                "transition: opacity 1s;\n" +
                "}\n" +
                "\n" +
                ".tooltip .tooltiptext::after {\n" +
                "content: \"\";\n" +
                "position: absolute;\n" +
                "top: 100%;\n" +
                "left: 50%;\n" +
                "margin-left: -5px;\n" +
                "border-width: 5px;\n" +
                "border-style: solid;\n" +
                "border-color: #555 transparent;\n" +
                "}\n" +
                "/* Show the tooltip text when you\n" +
                "\n" +
                "mouse over the tooltip container */\n" +
                ".tooltip:hover .tooltiptext {\n" +
                "visibility: visible;\n" +
                "opacity: 1;\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<h2>Tooltip Example</h2>\n" +
                "<p>Move the mouse over the\n" +
                "text below:</p>\n" +
                "<div class=\"tooltip\">Hover over me\n" +
                "<span class=\"tooltiptext\">\n" +
                "This is Tooltip</span>\n" +
                "</div>\n" +
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




