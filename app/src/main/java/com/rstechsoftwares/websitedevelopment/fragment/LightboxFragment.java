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

public class LightboxFragment extends Fragment {
    AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_lightbox, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        CodeView codeView3 = rootView.findViewById(R.id.lightboxcode);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<meta name=\"viewport\" content=\"width=\n" +
                "device-width, initial-scale=1\">\n" +
                "<style>\n" +
                "body {\n" +
                "font-family: Verdana, sans-serif;\n" +
                "margin: 0;\n" +
                "}\n" +
                "* {\n" +
                "box-sizing: border-box;\n" +
                "}\n" +
                ".row > .column {\n" +
                "padding: 0 8px;\n" +
                "}\n" +
                ".row:after {\n" +
                "content: \"\";\n" +
                "display: table;\n" +
                "clear: both;\n" +
                "}\n" +
                ".column {\n" +
                "float: left;\n" +
                "width: 25%;\n" +
                "}\n" +
                "\n" +
                "/* This is for modal background */\n" +
                ".modal {\n" +
                "display: none;\n" +
                "position: fixed;\n" +
                "z-index: 1;\n" +
                "padding-top: 100px;\n" +
                "left: 0;\n" +
                "top: 0;\n" +
                "width: 100%;\n" +
                "height: 100%;\n" +
                "overflow: auto;\n" +
                "background-color: #b0d7c5;\n" +
                "}\n" +
                "\n" +
                ".modal-content {\n" +
                "position: relative;\n" +
                "background-color: #fefefe;\n" +
                "margin: auto;\n" +
                "padding: 0;\n" +
                "width: 90%;\n" +
                "max-width: 1200px;\n" +
                "}\n" +
                "\n" +
                "/* This is for close button */\n" +
                ".close {\n" +
                "color: white;\n" +
                "position: absolute;\n" +
                "top: 10px;\n" +
                "right: 25px;\n" +
                "font-size: 35px;\n" +
                "font-weight: bold;\n" +
                "}\n" +
                ".close:hover,\n" +
                ".close:focus {\n" +
                "color: #999;\n" +
                "text-decoration: none;\n" +
                "cursor: pointer;\n" +
                "}\n" +
                ".mySlides {\n" +
                "display: none;\n" +
                "}\n" +
                ".cursor {\n" +
                "cursor: pointer\n" +
                "}\n" +
                "\n" +
                "/* This is for next & prev buttons */\n" +
                ".prev,\n" +
                ".next {\n" +
                "cursor: pointer;\n" +
                "position: absolute;\n" +
                "top: 50%;\n" +
                "width: auto;\n" +
                "padding: 16px;\n" +
                "margin-top: -50px;\n" +
                "color: white;\n" +
                "font-weight: bold;\n" +
                "font-size: 20px;\n" +
                "\n" +
                "transition: 0.6s ease;\n" +
                "border-radius: 0 3px 3px 0;\n" +
                "user-select: none;\n" +
                "-webkit-user-select: none;\n" +
                "}\n" +
                "\n" +
                ".next {\n" +
                "right: 0;\n" +
                "border-radius: 3px 0 0 3px;\n" +
                "}\n" +
                "\n" +
                ".prev:hover,\n" +
                ".next:hover {\n" +
                "background-color:rgba(0, 0, 0, 0.8);\n" +
                "}\n" +
                "\n" +
                ".numbertext {\n" +
                "color: #f2f2f2;\n" +
                "font-size: 12px;\n" +
                "padding: 8px 12px;\n" +
                "position: absolute;\n" +
                "top: 0;\n" +
                "}\n" +
                "img {\n" +
                "margin-bottom: -4px;\n" +
                "}\n" +
                ".caption-container {\n" +
                "text-align: center;\n" +
                "background-color: #00b867;\n" +
                "padding: 2px 16px;\n" +
                "color: white;\n" +
                "}\n" +
                ".demo {\n" +
                "opacity: 0.6;\n" +
                "}\n" +
                ".active,\n" +
                ".demo:hover {\n" +
                "opacity: 1;\n" +
                "}\n" +
                "img.hover-shadow {\n" +
                "transition: 0.3s\n" +
                "}\n" +
                "\n" +
                ".hover-shadow:hover {\n" +
                "box-shadow: 0 4px 8px 0 rgba\n" +
                "(0, 0, 0, 0.2),0 6px 20px 0 rgba\n" +
                "(0, 0, 0, 0.19)\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<h2 style=\"text-align:center\">\n" +
                "Lightbox Example</h2>\n" +
                "<div class=\"row\">\n" +
                "<div class=\"column\">\n" +
                "<img src=\"tiger1.jpg\"style=\"width:100%\"\n" +
                "onclick=\"openModal();currentSlide(1)\"\n" +
                "class=\"hover-shadow cursor\">\n" +
                "</div>\n" +
                "<div class=\"column\">\n" +
                "<img src=\"tiger2.jpg\"style=\"width:100%\"\n" +
                "onclick=\"openModal();currentSlide(2)\"\n" +
                "class=\"hover-shadow cursor\">\n" +
                "</div>\n" +
                "<div class=\"column\">\n" +
                "<img src=\"tiger3.jpg\"style=\"width:100%\"\n" +
                "onclick=\"openModal();currentSlide(3)\"\n" +
                "class=\"hover-shadow cursor\">\n" +
                "</div>\n" +
                "</div>\n" +
                "/* Unicode character for Sign\n" +
                "\"×\" is '&times' */\n" +
                "<div id=\"myModal\" class=\"modal\">\n" +
                "<span class=\"close cursor\"\n" +
                "onclick=\"closeModal()\">&times;</span>\n" +
                "<div class=\"modal-content\">\n" +
                "\n" +
                "<div class=\"mySlides\">\n" +
                "<div class=\"numbertext\">1 / 3</div>\n" +
                "<img src=\"tiger1.jpg\"style=\"width:100%\">\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"mySlides\">\n" +
                "<div class=\"numbertext\">2 / 3</div>\n" +
                "<img src=\"tiger2.jpg\"style=\"width:100%\">\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"mySlides\">\n" +
                "<div class=\"numbertext\">3 / 3</div>\n" +
                "<img src=\"tiger3.jpg\"style=\"width:100%\">\n" +
                "</div>\n" +
                "\n" +
                "/* Unicode character for \"prev\" sign\n" +
                "\" \" is '&#10094' */ ❮\" is '&#10094' */\n" +
                "<a class=\"prev\" onclick=\"plusSlides\n" +
                "(-1)\">&#10094;</a>\n" +
                "/* Unicode character for \"next\" sign\n" +
                "\" \" is '&#10095' */ ❯\" is '&#10095' */\n" +
                "<a class=\"next\" onclick=\"plusSlides\n" +
                "(1)\">&#10095;</a>\n" +
                "<div class=\"caption-container\">\n" +
                "<p id=\"caption\"></p>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"column\">\n" +
                "<img class=\"demo cursor\"\n" +
                "src=\"tiger1.jpg\" style=\"width:100%\"\n" +
                "onclick=\"currentSlide(1)\" alt=\"Tiger1\">\n" +
                "</div>\n" +
                "<div class=\"column\">\n" +
                "<img class=\"demo cursor\"\n" +
                "src=\"tiger2.jpg\" style=\"width:100%\"\n" +
                "onclick=\"currentSlide(2)\" alt=\"Tiger2\">\n" +
                "</div>\n" +
                "<div class=\"column\">\n" +
                "<img class=\"demo cursor\"\n" +
                "src=\"tiger3.jpg\" style=\"width:100%\"\n" +
                "onclick=\"currentSlide(3)\" alt=\"Tiger3\">\n" +
                "</div>\n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "<script>\n" +
                "function openModal() {\n" +
                "\n" +
                "document.getElementById('myModal')\n" +
                ".style.display = \"block\";\n" +
                "}\n" +
                "function closeModal() {\n" +
                "document.getElementById('myModal')\n" +
                ".style.display = \"none\";\n" +
                "}\n" +
                "var slideIndex = 1;\n" +
                "showSlides(slideIndex);\n" +
                "function plusSlides(n) {\n" +
                "showSlides(slideIndex += n);\n" +
                "}\n" +
                "function currentSlide(n) {\n" +
                "showSlides(slideIndex = n);\n" +
                "}\n" +
                "\n" +
                "function showSlides(n) {\n" +
                "var i;\n" +
                "var slides = document\n" +
                ".getElementsByClassName(\"mySlides\");\n" +
                "var dots = document\n" +
                ".getElementsByClassName(\"demo\");\n" +
                "var captionText = document\n" +
                ".getElementById(\"caption\");\n" +
                "if (n > slides.length)\n" +
                "{slideIndex = 1}\n" +
                "if (n < 1) {slideIndex =\n" +
                "slides.length}\n" +
                "for (i = 0; i < slides.length; i++) {\n" +
                "slides[i].style.display = \"none\";\n" +
                "}\n" +
                "for (i = 0; i < dots.length; i++) {\n" +
                "dots[i].className = dots[i].className\n" +
                ".replace(\" active\",\"\");\n" +
                "}\n" +
                "slides[slideIndex-1].style.display =\n" +
                "\"block\";\n" +
                "\n" +
                "dots[slideIndex-1].className +=\n" +
                "\" active\";\n" +
                "captionText.innerHTML =\n" +
                "dots[slideIndex-1].alt;\n" +
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
