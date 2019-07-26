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

public class AngularJsIntroductionFragment extends Fragment {
AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_angular_js_intro, container, false);
        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView textView = rootView.findViewById(R.id.angjs_intro);
        textView.setText("AngularJS is a JavaScript framework. It is a library written in JavaScript, AngularJS is distributed\n" +
                "as a JavaScript file, It can be added to an HTML page with a <script> tag.\n" +
                "<script\n" +
                "src=\"https://ajax.googleapis.com/ajax/libs/ angularjs/1.6.4/angular.min.js\">\n" +
                "</script>");
        TextView textView1 = rootView.findViewById(R.id.tvaji);
        textView1.setText("AngularJS extends HTML attributes with Directives, and binds data to HTML with Expressions.\n" +
                "AngularJS extends HTML with ng-directives.\n" +
                "The ng-app directive defines an AngularJS application.\n" +
                "The ng-model directive binds the value of HTML controls (input, select, textarea) to application\n" +
                "data.\n" +
                "The ng-bind directive binds application data to the HTML view.");
        CodeView codeView2 = rootView.findViewById(R.id.angularinto_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<script src=\"https://ajax.googleapis.com\n" +
                        "/ajax/libs/angularjs/1.6.4/angular.min.js\n" +
                        "\"></script>"+
                "<body>\n" +
                "<div ng-app=\"\">\n" +
                "<! The ng-app directive tells AngularJS\n" +
                "that the <div> element is the \"owner\" of\n" +
                "an AngularJS application.>\n" +
                "<p>Input something in the input box </p>\n" +
                "<p>Name: <input type=\"text\"\n" +
                "ng-model=\"name\"\n" +
                "style=\"border:3px solid MediumTurquoise\"\n" +
                "></p>\n" +
                "<!The ng-model directive binds the\n" +
                "value of the input field to the\n" +
                "application variable name.>\n" +
                "<p ng-bind=\"name\"></p>\n" +
                "<!The ng-bind directive binds the inner\n" +
                "HTML of the<p> element to the application\n" +
                "variable name. >\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>"
               );



        CodeView codeView4 = rootView.findViewById(R.id.angularinto2_code);
        codeView4.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "button.accordion {\n" +
                "background-color: #eee;\n" +
                "color: #444;\n" +
                "cursor: pointer;\n" +
                "padding: 18px;\n" +
                "width: 100%;\n" +
                "border: none;\n" +
                "text-align: left;\n" +
                "outline: none;\n" +
                "font-size: 15px;\n" +
                "transition: 0.4s;\n" +
                "}\n" +
                "\n" +
                "button.accordion.active, button.accordion:\n" +
                "hover {\n" +
                "background-color: #ddd;\n" +
                "}\n" +
                "\n" +
                "button.accordion:after {\n" +
                "/* Unicode character for \"plus\" sign (+)\n" +
                "is '\\02795' */\n" +
                "content: '\\02795';\n" +
                "font-size: 13px;\n" +
                "color: #777;\n" +
                "float: right;\n" +
                "margin-left: 5px;\n" +
                "}\n" +
                "button.accordion.active:after {\n" +
                "\n" +
                "/* Unicode character for \"minus\" sign (-)\n" +
                "is '\\2796' */\n" +
                "content: \"\\2796\";\n" +
                "}\n" +
                "\n" +
                "div.panel {\n" +
                "padding: 0 18px;\n" +
                "background-color: white;\n" +
                "max-height: 0;\n" +
                "overflow: hidden;\n" +
                "transition: 0.6s ease-in-out;\n" +
                "opacity: 0;\n" +
                "}\n" +
                "div.panel.show {\n" +
                "opacity: 1;\n" +
                "max-height: 500px;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Accordion Example</h2>\n" +
                "<p>In this example we have added a \"plus\"\n" +
                "sign to each button. When the user clicks\n" +
                "on the button,the \"plus\" sign is replaced\n" +
                "with a \"minus\" sign.</p>\n" +
                "<button class=\"accordion\">Tiger</button>\n" +
                "<div class=\"panel\">\n" +
                "<p>The tiger is the largest cat species,\n" +
                "most recognisable for their pattern of\n" +
                "dark vertical stripes on reddish-orange\n" +
                "fur with a lighter underside.</p>\n" +
                "</div>\n" +
                "<button class=\"accordion\">Lion</button>\n" +
                "<div class=\"panel\">\n" +
                "<p>The lion is one of the big cats in\n" +
                "the genus Panthera and a member of the family\n" +
                "Felidae.The commonly used term African lion\n" +
                "collectively denotes the several subspecies\n" +
                "in Africa.</p>\n" +
                "</div>\n" +
                "<button class=\"accordion\">Cheetah</button>\n" +
                "\n" +
                "<div class=\"panel\">\n" +
                "<p>The cheetah, also known as the\n" +
                "hunting leopard, is a big cat that occurs\n" +
                "mainly in eastern and southern Africa and\n" +
                "a few parts of Iran</p>\n" +
                "</div>\n" +
                "<script>\n" +
                "var acc = document.getElementsByClassName\n" +
                "(\"accordion\");\n" +
                "var i;\n" +
                "for (i = 0; i < acc.length; i++) {\n" +
                "acc[i].onclick = function(){\n" +
                "this.classList.toggle(\"active\");\n" +
                "this.nextElementSibling.classList.\n" +
                "toggle(\"show\");\n" +
                "}\n" +
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
