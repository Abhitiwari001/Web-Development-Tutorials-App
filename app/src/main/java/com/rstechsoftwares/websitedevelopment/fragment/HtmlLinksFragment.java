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

public class HtmlLinksFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_links, container, false);

        CodeView codeView = rootView.findViewById(R.id.html_link_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Hyperlink Example</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>Click following link</p>\n" +
                "<a href=\"http://www.html12app.com\"\n" +
                "target=\"_self\">HTML LEARN</a>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView1 = rootView.findViewById(R.id.html_base_code);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Base Link Example</title>\n" +
                "<base href=\"http://www.html12.com/\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>Click following link</p>\n" +
                "<a href=\"/html/index.htm\" target=\n" +
                "\"_blank\">LEARN HTML</a>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView2 = rootView.findViewById(R.id.html_attribute_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Attributes Example</title>\n" +
                "<base href=\n" +
                "\"http://www.HTML12app.com/\">\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<p>Click the following links</p>\n" +
                "<a href=\"/html/index.htm\" target=\n" +
                "\"_blank\">Opens in New tab</a>\n" +
                "<a href=\"/html/index.htm\" target=\n" +
                "\"_self\">Opens in Self frame</a>\n" +
                "<a href=\"/html/index.htm\" target=\n" +
                "\"_parent\">Opens in Parent frame</a>\n" +
                "<a href=\"/html/index.htm\" target=\n" +
                "\"_top\">Opens in full Body</a>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView3 = rootView.findViewById(R.id.html_imlink_code);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Image link Example</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>Click following link</p>\n" +
                "<a href=\"http://www.html12app.com\"\n" +
                "target=\"_self\">\n" +
                "<img src=\"/images/logo.png\"\n" +
                "alt=\"LEARN HTML\" border=\"0\"/>\n" +
                "</a>\n" +
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
