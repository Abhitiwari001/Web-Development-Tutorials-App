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

public class HtmlBlocksFragment extends Fragment implements RewardedVideoAdListener {
    private RewardedVideoAd mRewardedVideoAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_blocks, container, false);
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        TextView textView = rootView.findViewById(R.id.html_block);
        textView.setText("HTML elements are defined as block level elements or inline elements.\n" +
                "Block level elements normally start and end with a new line, when displayed in a browser.\n" +
                "Examples: <h1>, <p>, <ul>, <table>, <ol>, <dl>, <pre>>, <hr />\n" +
                "Inline elements are normally displayed without line breaks.\n" +
                "Examples: <b>, <td>, <img>, <big>, <small>, <li>, <ins>, <del> .");
        TextView textView1 = rootView.findViewById(R.id.block_desc);
        textView1.setText("The <div> element is a block level element that can be used as a container for other HTML " +
                "elements , style and class are common attributes , <div> tag can be used to create webpage layout to " +
                "define different parts of the page using <div> tag .");
        CodeView codeView = rootView.findViewById(R.id.block_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                ".ani {\n" +
                "background-color:steelblue;\n" +
                "color:white;\n" +
                "margin:20px;\n" +
                "padding:20px;\n" +
                "border:5px solid mediumturquoise;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"ani\">\n" +
                "<h2>TIGER</h2>\n" +
                "<p> The tiger (Panthera tigris)\n" +
                "is the largest cat species,\n" +
                "reaching a total body length\n" +
                "of up to 3.38 m (11.1 ft) over\n" +
                "curves and weighing up to 388.7\n" +
                "kg (857 lb) in the wild. with\n" +
                "most remaining populations\n" +
                "occurring in small pockets\n" +
                "isolated from each other, of\n" +
                "which about 2,000 exist on the\n" +
                "Indian subcontinent. </p>\n" +
                "<img src=\"http://Tiger.jpg\"\n" +
                "alt=\"TIGER\" style=\"width:250px;\n" +
                "height:200px\">\n" +
                "</div>\n" +
                "<div class=\"ani\">\n" +
                "<h2>LION</h2>\n" +
                "<p>The lion (Panthera leo) is one\n" +
                "of the five big cats in the genus\n" +
                "Panthera and a member of the family\n" +
                "Felidae , it is the second-largest\n" +
                "living cat after the tiger . lions\n" +
                "live for 1014 years in the wild,\n" +
                "although in captivity they can live\n" +
                "more than 20 years.</p>\n" +
                "<img src=\"http://lion.jpg\"alt=\"LION\"\n" +
                "style=\"width:250px;height:200px\">\n" +
                "</body>\n" +
                "</html>");
        TextView textView2 = rootView.findViewById(R.id.inline_desc);
        textView2.setText("The HTML <span> element is an inline element that can be used as a container for text , style and " +
                "class are common attributes.The difference between the <span> tag and the <div> tag is that the " +
                "<span> tag is used with inline elements where as the <div> tag is used with block-level elements.");
        CodeView codeView1 = rootView.findViewById(R.id.inline_code);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "span.steel {\n" +
                " color:steelblue;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>This is <span class=\"steel\">\n" +
                "INLINE</span> Element</h1>\n" +
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
