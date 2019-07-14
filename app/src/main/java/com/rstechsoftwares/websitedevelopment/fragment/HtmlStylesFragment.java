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

public class HtmlStylesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_styles, container, false);
        CodeView codeView = rootView.findViewById(R.id.html_back_code);
        codeView.setCode("<!DOCTYPE html>\n<html>\n<body style=\"background-color: \nlightgrey\"> \n<h1>Background color</h1>\n<p>Background color changed.</p>\n</body>\n</html>");
        CodeView codeView1 = rootView.findViewById(R.id.html_text_code);
        codeView1.setCode("<!DOCTYPE html>\n<html>\n<body>\n<h1 style=\"color:RoyalBlue\"> \nThis is a heading</h1>\n<p style=\"color:SteelBlue\"> \nThis is a paragraph.</p>\n</body>\n</html>");
        CodeView codeView2 = rootView.findViewById(R.id.html_font_code);
        codeView2.setCode("<!DOCTYPE html>\n<html>\n<body>\n<h1 style=\"font-family:courier\"> \nHeading in courier font</h1>\n<p style=\"font-family:PT Serif\"> \nparagraph in PT Serif font.</p>\n</body>\n</html>");
        CodeView codeView3 = rootView.findViewById(R.id.html_size_code);
        codeView3.setCode("<!DOCTYPE html>\n<html>\n<body>\n<p style=\"font-size:180%\"> \nfont size is 180%</p>\n<p style=\"font-size:120%\"> \nfont size is 120%</p>\n</body>\n</html>");
        CodeView codeView4 = rootView.findViewById(R.id.html_align_code);
        codeView4.setCode("<!DOCTYPE html>\n<html>\n<body>\n<h1 style=\"text-align:center\"> \nHeading is Centered</h1>\n<p>This is a paragraph.</p>\n</body>\n</html>");

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
