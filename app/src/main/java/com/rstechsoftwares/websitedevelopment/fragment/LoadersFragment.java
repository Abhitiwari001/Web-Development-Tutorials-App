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

public class LoadersFragment extends Fragment implements RewardedVideoAdListener {
TextView t;
    private RewardedVideoAd mRewardedVideoAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_loaders, container, false);
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        t=rootView.findViewById(R.id.loader1);
        t.setText("Loader is a small animation that indicates that an application or process is busy performing an\n" +
                "operation. It can be displayed in application or a webpage\n" +
                "The border property specifies the border size and the border color of the loader. The border-radius\n" +
                "property transforms the loader into a circle.\n" +
                "The thing that spins around inside the border is specified with the border-top property. You can also\n" +
                "include border-bottom, border-left and/or border-right. The size of the loader is specified with the\n" +
                "width and height properties.\n" +
                "At last, we add an animation that makes it spin forever with a 2 second animation speed.\n" +
                "Note: You should also include -webkit- and -ms- prefixes for browsers that do not support\n" +
                "animation and transform properties.");
        CodeView codeView = rootView.findViewById(R.id.loadercode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                ".loader {\n" +
                "border: 16px solid #f3f3f3;\n" +
                "border-radius: 50%;\n" +
                "border-top: 16px solid #48d1cc;\n" +
                "width: 120px;\n" +
                "height: 120px;\n" +
                "-webkit-animation: spin 2s linear\n" +
                "infinite;\n" +
                "animation: spin 2s linear infinite;\n" +
                "}\n" +
                "@-webkit-keyframes spin {\n" +
                "0% {-webkit-transform: rotate(0deg);}\n" +
                "100% { -webkit-transform:\n" +
                "rotate(360deg); }\n" +
                "}\n" +
                "@keyframes spin {\n" +
                "0% { transform: rotate(0deg); }\n" +
                "100% { transform: rotate(360deg); }\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>How To Create A Loader</h2>\n" +
                "\n" +
                "<p>This is a example for Loader</p>\n" +
                "<div class=\"loader\"></div>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.loadercode2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                ".loader1 {\n" +
                "border: 16px solid #f3f3f3;\n" +
                "border-radius: 50%;\n" +
                "border-top: 16px solid blue;\n" +
                "border-bottom: 16px solid blue;\n" +
                "width: 120px;\n" +
                "height: 120px;\n" +
                "-webkit-animation: spin 2s linear\n" +
                "infinite;\n" +
                "animation: spin 2s linear infinite;\n" +
                "}\n" +
                ".loader-Multicolor {\n" +
                "border: 16px solid #f3f3f3;\n" +
                "border-radius: 50%;\n" +
                "border-top: 16px solid teal;\n" +
                "border-right: 16px solid yellow;\n" +
                "border-bottom: 16px solid turquoise;\n" +
                "border-left: 16px solid cyan;\n" +
                "width: 120px;\n" +
                "height: 120px;\n" +
                "-webkit-animation: spin 2s linear\n" +
                "infinite;\n" +
                "animation: spin 2s linear infinite;\n" +
                "}\n" +
                "\n" +
                "@-webkit-keyframes spin {\n" +
                "0% {-webkit-transform:rotate(0deg);}\n" +
                "100% { -webkit-transform:\n" +
                "rotate(360deg); }\n" +
                "}\n" +
                "@keyframes spin {\n" +
                "0% { transform: rotate(0deg); }\n" +
                "100% { transform: rotate(360deg); }\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Loader with different Style</h2>\n" +
                "<p>This is a example for loaders with\n" +
                "different style</p>\n" +
                "<div class=\"loader1\"></div>\n" +
                "<br>\n" +
                "<br>\n" +
                "<div class=\"loader-Multicolor\"></div>\n" +
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

