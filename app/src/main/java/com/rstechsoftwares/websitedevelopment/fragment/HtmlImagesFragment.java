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

import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class HtmlImagesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_images, container, false);

        TextView textView = rootView.findViewById(R.id.html_image_syntax);
        textView.setText("<img src=\"url\" alt=\"some_text\">\n" +
                "1. In HTML, images are defined with the <img> tag.\n" +
                "2. The src attribute defines the url (location) of the image.\n" +
                "3. The alt attribute specifies an alternate text for an image, if the image cannot be displayed.");
        CodeView codeView = rootView.findViewById(R.id.html_image_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<h2>PICTURES OF PENGUINS</h2>\n" +
                "<img src=\"penguins.jpg\"\n" +
                "alt=\"Penguins\">\n" +
                "</body>\n" +
                "</html> ");
        CodeView codeView1 = rootView.findViewById(R.id.html_imageh_code);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>Set Image Width and Height\n" +
                "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>Setting image width & height</p>\n" +
                "<img src=\"penguins.jpg\" alt=\"TestImage\"\n" +
                "width=\"200\" height=\"100\">\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView2 = rootView.findViewById(R.id.html_imagel_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>IMAGE LOCATION</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>IMAGE LOCATION</p>\n" +
                "<img src=\"pic/penguins.png\"\n" +
                "alt=\"PENGUINS\" >\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView3 = rootView.findViewById(R.id.html_imagea_code);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Image Alignment</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>Setting image Alignment</p>\n" +
                "<img src=\"penguins.jpg\"\n" +
                "alt=\"ImageAlignment\" align=\"right\">\n" +
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
