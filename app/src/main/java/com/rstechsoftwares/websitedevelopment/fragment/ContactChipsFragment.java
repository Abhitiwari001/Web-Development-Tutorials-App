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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class ContactChipsFragment extends Fragment {
    AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_contact_chips, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        CodeView codeView = rootView.findViewById(R.id.contactchipcode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                ".chip {\n" +
                "display: inline-block;\n" +
                "padding: 0 25px;\n" +
                "height: 50px;\n" +
                "font-size: 16px;\n" +
                "line-height: 50px;\n" +
                "border-radius: 25px;\n" +
                "background-color: #f1f1f1;\n" +
                "}\n" +
                ".chip img {\n" +
                "float: left;\n" +
                "margin: 0 10px 0 -25px;\n" +
                "height: 50px;\n" +
                "width: 50px;\n" +
                "border-radius: 50%;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"chip\">\n" +
                "<img src=\"img_chip.png\" alt=\"Person\"\n" +
                "width=\"96\" height=\"96\">\n" +
                "Peter\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView2 = rootView.findViewById(R.id.contactchipcode2);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                ".chip {\n" +
                "display: inline-block;\n" +
                "padding: 0 25px;\n" +
                "height: 50px;\n" +
                "font-size: 18px;\n" +
                "line-height: 50px;\n" +
                "border-radius: 25px;\n" +
                "background-color: #f1f1f1;\n" +
                "}\n" +
                ".chip img {\n" +
                "float: left;\n" +
                "margin: 0 10px 0 -25px;\n" +
                "height: 50px;\n" +
                "width: 50px;\n" +
                "border-radius: 50%;\n" +
                "}\n" +
                ".closebtn {\n" +
                "padding-left: 10px;\n" +
                "color: #888;\n" +
                "font-weight: bold;\n" +
                "float: right;\n" +
                "font-size: 20px;\n" +
                "cursor: pointer;\n" +
                "}\n" +
                ".closebtn:hover {\n" +
                "color: #000;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2> Closable Contact Chips </h2>\n" +
                "<p>Click on the \"x\" symbol to delete\n" +
                "the contact.</p>\n" +
                "\n" +
                "<div class=\"chip\">\n" +
                "<img src=\"img_chip.png\" alt=\"Person\"\n" +
                "width=\"96\" height=\"96\">\n" +
                "peter\n" +
                "<span class=\"closebtn\"\n" +
                "onclick=\"this.parentElement.style\n" +
                ".display='none'\"> &times; </span>\n" +
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
}
