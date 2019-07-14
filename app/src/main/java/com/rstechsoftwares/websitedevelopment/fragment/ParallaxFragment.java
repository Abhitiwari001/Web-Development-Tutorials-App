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

public class ParallaxFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_parallax, container, false);
        CodeView codeView2 = rootView.findViewById(R.id.parallaxcode);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "body, html {\n" +
                "height: 100%;\n" +
                "}\n" +
                ".parallax {\n" +
                "/* The image used */\n" +
                "background-image: url\n" +
                "('img_parallax.jpg');\n" +
                "/* Full height */\n" +
                "height: 100%;\n" +
                "/* Create the parallax scrolling\n" +
                "effect */\n" +
                "background-attachment: fixed;\n" +
                "background-position: center;\n" +
                "background-repeat: no-repeat;\n" +
                "background-size: cover;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"parallax\"></div>\n" +
                "<div style=\"height:1000px;\n" +
                "background-color:#48d1cc;font-size:\n" +
                "36px\">\n" +
                "Scroll Up and Down this page to see\n" +
                "the parallax scrolling effect.\n" +
                "This div is just here to enable\n" +
                "scrolling.\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"parallax\"></div>\n" +
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
