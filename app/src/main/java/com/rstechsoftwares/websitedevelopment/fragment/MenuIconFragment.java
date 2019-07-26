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

public class MenuIconFragment extends Fragment {
    AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_menu_icon, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        TextView textView = rootView.findViewById(R.id.menuicon1);
        textView.setText("The Menu icon is the three horizontal lines you see at the top of many screens and webpages, either\n" +
                "on the far left or the far right. It's an icon, actually. By touching, tapping or clicking on the icon, it\n" +
                "opens up a side menu with a selection of options or additional pages.\n" +
                "In the example below the width and the height property specifies the width and height of each bar.\n" +
                "We have added a black background-color to the bar, and the top and bottom margin is used to create\n" +
                "some distance between each bar.");
        TextView textView2 = rootView.findViewById(R.id.menuicon2);
        textView2.setText("In the Animated menu icon example, the container element is used to show a pointer symbol when\n" +
                "the user moves the mouse over the divs (bars). When it is clicked on, it will execute a JavaScript\n" +
                "function that adds a new class name to it, which will change the styles of each horizontal bar, the\n" +
                "first and the last bar is transformed and rotated to the letter \"x\". The bar in the middle fades out and\n" +
                "becomes invisible.");
        CodeView codeView = rootView.findViewById(R.id.menuiconcode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "div {\n" +
                "width: 35px;\n" +
                "height: 5px;\n" +
                "background-color: black;\n" +
                "margin: 6px 0;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Menu Icon </h2>\n" +
                "<div></div>\n" +
                "<div></div>\n" +
                "<div></div>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.menuiconcode2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                ".container {\n" +
                "display: inline-block;\n" +
                "cursor: pointer;\n" +
                "}\n" +
                ".bar1, .bar2, .bar3 {\n" +
                "width: 35px;\n" +
                "height: 5px;\n" +
                "background-color: #333;\n" +
                "margin: 6px 0;\n" +
                "transition: 0.4s;\n" +
                "}\n" +
                "/* This is to rotate first bar */\n" +
                ".change .bar1 {\n" +
                "-webkit-transform: rotate(-45deg)\n" +
                "translate(-9px, 6px) ;\n" +
                "transform: rotate(-45deg)\n" +
                "translate(-9px, 6px) ;\n" +
                "}\n" +
                "\n" +
                "/* This is to fade out second bar */\n" +
                ".change .bar2 {opacity: 0;}\n" +
                "/* This is to rotate last bar */\n" +
                ".change .bar3 {\n" +
                "-webkit-transform: rotate(45deg)\n" +
                "translate(-8px, -8px) ;\n" +
                "transform: rotate(45deg)\n" +
                "translate(-8px, -8px) ;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<h2>Example for Animated Menu Icon</h2>\n" +
                "<p>Click on the Menu Icon to\n" +
                "transform it to \"X\":</p>\n" +
                "<div class=\"container\"\n" +
                "onclick=\"myFunction(this)\">\n" +
                "<div class=\"bar1\"></div>\n" +
                "<div class=\"bar2\"></div>\n" +
                "<div class=\"bar3\"></div>\n" +
                "</div>\n" +
                "<script>\n" +
                "function myFunction(x) {\n" +
                "x.classList.toggle(\"change\");\n" +
                "}\n" +
                "</script>\n" +
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

