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

public class CssResponsiveFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_css_responsive, container, false);

        CodeView codeView = rootView.findViewById(R.id.viewport_code);
        CodeView codeView1 = rootView.findViewById(R.id.not_viewport_code);
        codeView.setCode("<!DOCTYPE html>\n<html>\n<head>\n<meta name=\"viewport\" content= \n\"width=device-width, initial-scale= \n1.0\"> \n<style> \nimg { \nmax-width:100%; \nheight:auto; \n} \ndiv { \nbackground-color: #F9FFFF;\nwidth: 272px;\npadding: 10px;\nborder: 5px solid steelblue;\nmargin: 1px; \n}\n</style>\n</head>\n<body>\n<h3> Tiger </h3>\n<img src=\"Img_tiger.jpg\" \nalt=\"Tiger\" style=\"width:500px; \nheight:450px\"> \n<p> The tiger (Panthera tigris) \nis the largest cat species, \nreaching a total body length \nof up to 3.38 m (11.1 ft) over \ncurves and weighing up to 388.7 \nkg (857 lb) in the wild. with \nmost remaining populations \noccurring in small pockets \nisolated from each other, of \nwhich about 2,000 exist on the \nIndian subcontinent. </p>\n</body>\n</html>");
        codeView1.setCode("<!DOCTYPE html>\n<html>\n<body>\n<h3> Tiger </h3>\n<img src=\"Img_tiger.jpg\" \nalt=\"Basic Html\" style=\"width:500px; \nheight:450px\"> \n<p> The tiger (Panthera tigris) \nis the largest cat species, \nreaching a total body length \nof up to 3.38 m (11.1 ft) over \ncurves and weighing up to 388.7 \nkg (857 lb) in the wild. with \nmost remaining populations \noccurring in small pockets \nisolated from each other, of \nwhich about 2,000 exist on the \nIndian subcontinent. </p>\n</body>\n</html>");
        CodeView codeView2 = rootView.findViewById(R.id.grid_view_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta name=\"viewport\" content=\n" +
                "\"width=device-width, initial-scale=\n" +
                "1.0\">\n" +
                "<style>\n" +
                "* {\n" +
                " box-sizing: border-box;\n" +
                "}\n" +
                ".row:after {\n" +
                " content: \"\";\n" +
                " clear: both;\n" +
                " display: block;\n" +
                "}\n" +
                "[class*=\"col-\"] {\n" +
                " float: left;\n" +
                " padding: 15px;\n" +
                "}\n" +
                ".col-1 {width: 8.33%;}\n" +
                ".col-2 {width: 17.16%;}\n" +
                ".col-3 {width: 25%;}\n" +
                ".col-4 {width: 33.33%;}\n" +
                ".col-5 {width: 41.66%;}\n" +
                ".col-6 {width: 50%;}\n" +
                ".col-7 {width: 58.33%;}\n" +
                ".col-8 {width: 66.66%;}\n" +
                ".col-9 {width: 75%;}\n" +
                ".col-10 {width: 82.33%;}\n" +
                ".col-11 {width: 91.55%;}\n" +
                ".col-12 {width: 100%;}\n" +
                "html {\n" +
                "font-family:\"Lucida Sans\",sans-serif;\n" +
                "}\n" +
                ".header {\n" +
                " background-color: steelblue;\n" +
                " color: white;\n" +
                " padding: 15px;\n" +
                "}\n" +
                ".menu ul {\n" +
                " list-style-type: none;\n" +
                " margin: 0;\n" +
                " padding: 0;\n" +
                "}\n" +
                ".menu li {\n" +
                "padding: 8px;\n" +
                "margin-bottom: 7px;\n" +
                "background-color :turquoise;\n" +
                "color: #ffffff;\n" +
                "box-shadow: 0 1px 3px rgba\n" +
                "(0,0,0,0.12), 0 1px 2px rgba\n" +
                "(0,0,0,0.24);\n" +
                "}\n" +
                ".menu li:hover {\n" +
                " background-color: #0099cc;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"header\">\n" +
                "<h1>Cats</h1>\n" +
                "</div>\n" +
                "<div class=\"row\">\n" +
                "<div class=\"col-3 menu\">\n" +
                "<ul>\n" +
                "<li>Tiger</li>\n" +
                "<li>Cheetah</li>\n" +
                "<li>Puma</li>\n" +
                "<li>panther</li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div class=\"col-9\">\n" +
                "<h1>Tiger</h1>\n" +
                "<p>The tiger (Panthera tigris)\n" +
                "is the largest cat species,\n" +
                "reaching a total body length\n" +
                "of up to 3.38 m (11.1 ft) over\n" +
                "curves and weighing up to 388.7\n" +
                "kg (857 lb) in the wild. with\n" +
                "most remaining populations\n" +
                "occurring in small pockets\n" +
                "isolated from each other, of\n" +
                "which about 2,000 exist on the\n" +
                "Indian subcontinent.</p>\n" +
                "</div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView3 = rootView.findViewById(R.id.media_query_code);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta name=\"viewport\" content=\n" +
                "\"width=device-width, initial-scale=\n" +
                "1.0\">\n" +
                "<style>\n" +
                "* {\n" +
                " box-sizing: border-box;\n" +
                "}\n" +
                ".row:after {\n" +
                " content: \"\";\n" +
                " clear: both;\n" +
                " display: block;\n" +
                "}\n" +
                "[class*=\"col-\"] {\n" +
                " float: left;\n" +
                " padding: 15px;\n" +
                "}\n" +
                "html {\n" +
                "\tfont-family:\"Lucida Sans\",sans-serif;\n" +
                "}\n" +
                ".header {\n" +
                " background-color: #9933cc;\n" +
                " color: #ffffff;\n" +
                " padding: 15px;\n" +
                "}\n" +
                ".menu ul {\n" +
                " list-style-type: none;\n" +
                " margin: 0;\n" +
                " padding: 0;\n" +
                "}\n" +
                ".menu li {\n" +
                "padding: 8px;\n" +
                "margin-bottom: 7px;\n" +
                "background-color :#33b5e5;\n" +
                "color: #ffffff;\n" +
                "box-shadow: 0 1px 3px rgba\n" +
                "(0,0,0,0.12), 0 1px 2px\n" +
                "rgba(0,0,0,0.24);\n" +
                "}\n" +
                ".menu li:hover {\n" +
                "background-color: #0099cc;\n" +
                "}\n" +
                ".aside {\n" +
                " background-color: #33b5e5;\n" +
                "padding: 15px;\n" +
                "color: #ffffff;\n" +
                "text-align: center;\n" +
                "font-size: 14px;\n" +
                "box-shadow: 0 1px 3px rgba\n" +
                "(0,0,0,0.12), 0 1px 2px\n" +
                "rgba(0,0,0,0.24);\n" +
                "}\n" +
                ".footer {\n" +
                " background-color: #0099cc;\n" +
                " color: #ffffff;\n" +
                " text-align: center;\n" +
                " font-size: 12px;\n" +
                " padding: 15px;\n" +
                "}\n" +
                "/* For mobile phones: */\n" +
                "[class*=\"col-\"] {\n" +
                " width: 100%;\n" +
                "}\n" +
                "@media only screen and\n" +
                "(min-width:600px) {\n" +
                " /* For tablets: */\n" +
                " .col-m-1 {width: 8.33%;}\n" +
                " .col-m-2 {width: 16.66%;}\n" +
                " .col-m-3 {width: 25%;}\n" +
                " .col-m-4 {width: 33.33%;}\n" +
                " .col-m-5 {width: 41.66%;}\n" +
                " .col-m-6 {width: 50%;}\n" +
                " .col-m-7 {width: 58.33%;}\n" +
                " .col-m-8 {width: 66.66%;}\n" +
                " .col-m-9 {width: 75%;}\n" +
                " .col-m-10 {width: 83.33%;}\n" +
                " .col-m-11 {width: 91.66%;}\n" +
                " .col-m-12 {width: 100%;}\n" +
                "}\n" +
                "@media only screen and\n" +
                "(min-width: 768px) {\n" +
                " /* For desktop: */\n" +
                " .col-1 {width: 8.33%;}\n" +
                " .col-2 {width: 16.66%;}\n" +
                " .col-3 {width: 25%;}\n" +
                " .col-4 {width: 33.33%;}\n" +
                " .col-5 {width: 41.66%;}\n" +
                " .col-6 {width: 50%;}\n" +
                " .col-7 {width: 58.33%;}\n" +
                " .col-8 {width: 66.66%;}\n" +
                " .col-9 {width: 75%;}\n" +
                " .col-10 {width: 83.33%;}\n" +
                " .col-11 {width: 91.66%;}\n" +
                " .col-12 {width: 100%;}\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"header\">\n" +
                "<h1>Cats</h1>\n" +
                "</div>\n" +
                "<div class=\"row\">\n" +
                "<div class=\"col-3 col-m-3 menu\">\n" +
                "<ul>\n" +
                "<li>Tiger</li>\n" +
                "<li>Cheetah</li>\n" +
                "<li>Panther</li>\n" +
                "<li>Lion</li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div class=\"col-6 col-m-9\">\n" +
                "<h1>Tiger</h1>\n" +
                "<p>The tiger (Panthera tigris)\n" +
                "is the largest cat species,\n" +
                "reaching a total body length\n" +
                "of up to 3.38 m (11.1 ft) over\n" +
                "curves and weighing up to 388.7\n" +
                "kg (857 lb) in the wild. with\n" +
                "most remaining populations\n" +
                "occurring in small pockets\n" +
                "isolated from each other, of\n" +
                "which about 2,000 exist on the\n" +
                "Indian subcontinent.</p>\n" +
                "</div>\n" +
                "<div class=\"col-3 col-m-12\">\n" +
                "<div class=\"aside\">\n" +
                "<h2>Tiger</h2>\n" +
                "<p>Tiger is the largest cat</p>\n" +
                "<h2>Cheetah</h2>\n" +
                "<p>Cheetah is the fastest cat</p>\n" +
                "<h2>Lion</h2>\n" +
                "<p>Lion is the King </p>\n" +
                "</div>\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"footer\">\n" +
                "<p>Resize the browser window to see\n" +
                "how the content respond to the\n" +
                "resizing.</p>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView4 = rootView.findViewById(R.id.resp_video_code);
        codeView4.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta name=\"viewport\" content=\n" +
                "\"width=device-width, initial-scale=\n" +
                "1.0\">\n" +
                "<style>\n" +
                "video {\n" +
                " width: 100%;\n" +
                " height: auto;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<video width=\"400\" controls>\n" +
                "<source src=\"mo.mp4\"\n" +
                "type=\"video/mp4\">\n" +
                "<source src=\"mo.ogg\"\n" +
                "type=\"video/ogg\">\n" +
                "Your browser does not support HTML5\n" +
                "video.\n" +
                "</video>\n" +
                "<p>Resize the browser window to see\n" +
                "how the size of the video player\n" +
                "will scale.</p>\n" +
                "</body>\n" +
                "</html>\n" +
                "Result for above Example :\n" +
                "Basic Html\n" +
                "This is how the webpage looks in smallscreen devices\n" +
                "Basic Html\n" +
                "Using The Max-Width Property\n" +
                "If the max-width property is set to 100%, the video player will scale down if it has to, but\n" +
                "never scale up to be larger than its original size.\n" +
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta name=\"viewport\" content=\n" +
                "\"width=device-width, initial-scale=\n" +
                "1.0\">\n" +
                "<style>\n" +
                "video {\n" +
                " max-width: 100%;\n" +
                " height: auto;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<video width=\"400\" controls>\n" +
                "<source src=\"mo.mp4\"\n" +
                "type=\"video/mp4\">\n" +
                "<source src=\"mo.ogg\"\n" +
                "type=\"video/ogg\">\n" +
                "Your browser does not support\n" +
                "HTML5 video.\n" +
                "</video>\n" +
                "h3>Max-Width Property</h3>\n" +
                "<p>The video player will scale down\n" +
                "if it has to,but never scale up to\n" +
                "be larger than its original size</p>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView5 = rootView.findViewById(R.id.bootstrap_code);
        codeView5.setCode("<html>\n" +
                "<head>\n" +
                "<meta name=\"viewport\" content=\n" +
                "\"width=device-width, initial-scale=\n" +
                "1.0\">\n" +
                "<link rel=\"stylesheet\" href=\"http:\n" +
                "//maxcdn.bootstrapcdn.com/bootstrap\n" +
                "/3.2.0/css/bootstrap.min.css\">\n" +
                "<style>\n" +
                "body{\n" +
                "color:slateblue;\n" +
                "}\n" +
                ".jumbotron{\n" +
                "\tbackground-color:turquoise;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "<div class=\"jumbotron\">\n" +
                "<h1>Cats</h1>\n" +
                "</div>\n" +
                "<div class=\"row\">\n" +
                "<div class=\"col-md-4\">\n" +
                "<h2>Tiger</h2>\n" +
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
                "</div>\n" +
                "<div class=\"col-md-4\">\n" +
                "<h2>Lion</h2>\n" +
                "<p>The lion (Panthera leo) is one\n" +
                "of the five big cats in the genus\n" +
                "Panthera and a member of the family\n" +
                "Felidae , it is the second-largest\n" +
                "living cat after the tiger . lions\n" +
                "live for 10 14 years in the wild, �14 years in the wild,\n" +
                "although in captivity they can live\n" +
                "more than 20 years.</p>\n" +
                "</div>\n" +
                "<div class=\"col-md-4\">\n" +
                "<h2>Cheetah</h2>\n" +
                "<p>The cheetah (Acinonyx jubatus) is\n" +
                "a big cat in the subfamily Felinae\n" +
                "that inhabits most of Africa and\n" +
                "parts of Iran. It is the only extant\n" +
                "member of the genus Acinonyx. The\n" +
                "cheetah can run as fast as 109.4 to\n" +
                "120.7 km/h (68.0 to 75.0 mph),faster\n" +
                "than any other land animal. </p>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
        CodeView codeView6 = rootView.findViewById(R.id.skeleton_code);
        codeView6.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Skeleton Example</title>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"viewport\" content=\n" +
                "\"width=device-width, initial-scale=\n" +
                "1.0\">\n" +
                "<link rel=\"stylesheet\"\n" +
                "href=\"skeleton.css\">\n" +
                "<link rel=\"stylesheet\"\n" +
                "href=\"normalize.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "<h1>THE CATS</h1>\n" +
                "<div class=\"row\">\n" +
                "<div class=\"one-half column\">Tiger\n" +
                "<p>The tiger (Panthera tigris)\n" +
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
                "</div>\n" +
                "<div class=\"one-half column\">Lion\n" +
                "<p>The lion (Panthera leo) is one\n" +
                "of the five big cats in the genus\n" +
                "Panthera and a member of the family\n" +
                "Felidae , it is the second-largest\n" +
                "living cat after the tiger . lions\n" +
                "live for 10 14 years in the wild, �14 years in the wild,\n" +
                "although in captivity they can live\n" +
                "more than 20 years.</p>\n" +
                "</div>\n" +
                "</div>\n" +
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
