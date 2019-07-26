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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class HtmlIFramesFragment extends Fragment {
    private InterstitialAd mInterstitialAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_iframes, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        TextView textView = rootView.findViewById(R.id.iframe_syntax);
        textView.setText("Syntax :\n" +
                "<iframe src=\"URL\"></iframe>");
        CodeView codeView = rootView.findViewById(R.id.iframe_height_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<iframe src=\"example_iframe.htm\"\n" +
                "width=\"200\" height=\"200\"></iframe>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView1 = rootView.findViewById(R.id.iframe_border_code);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<iframe src=\"edit_exiframe.htm\"\n" +
                "style=\"border:4px outset red\">\n" +
                "</iframe>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.iframe_target_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<iframe width=\"100%\" height=\"300px\"\n" +
                "src=\"d_iframe.htm\" name=\"iframe_ex\">\n" +
                "</iframe>\n" +
                "<a href=\"http://www.html12app.com\n" +
                "/demo12\" target=\"iframe_ex\">\n" +
                "IFRAME-TARGET</a>\n" +
                "<p>When the target of a link matches\n" +
                "the name of an iframe, the link will\n" +
                "open in the iframe.</p>\n" +
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
