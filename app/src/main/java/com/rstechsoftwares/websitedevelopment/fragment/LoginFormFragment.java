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

public class LoginFormFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_login_form, container, false);
        CodeView codeView2 = rootView.findViewById(R.id.logincode);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "/* Full-width input fields */\n" +
                "input[type=text],\n" +
                "input[type=password] {\n" +
                "width: 100%;\n" +
                "padding: 12px 20px;\n" +
                "margin: 8px 0;\n" +
                "display: inline-block;\n" +
                "border: 1px solid #ccc;\n" +
                "box-sizing: border-box;\n" +
                "}\n" +
                "/* Set a style for all buttons */\n" +
                "button {\n" +
                "background-color: #48d1cc;\n" +
                "color: white;\n" +
                "padding: 14px 20px;\n" +
                "margin: 8px 0;\n" +
                "border: none;\n" +
                "cursor: pointer;\n" +
                "width: 100%;\n" +
                "}\n" +
                ".cancelbtn {\n" +
                "width: auto;\n" +
                "padding: 10px 18px;\n" +
                "background-color: #4682b4;\n" +
                "}\n" +
                "/* Center the image and position\n" +
                "the close button */\n" +
                ".imgcontainer {\n" +
                "text-align: center;\n" +
                "margin: 24px 0 12px 0;\n" +
                "position: relative;\n" +
                "}\n" +
                "img.avatar {\n" +
                "\n" +
                "width: 40%;\n" +
                "border-radius: 50%;\n" +
                "}\n" +
                ".container {\n" +
                "padding: 16px;\n" +
                "}\n" +
                "span.psw {\n" +
                "float: right;\n" +
                "padding-top: 16px;\n" +
                "}\n" +
                "/* The Modal (background) */\n" +
                ".modal {\n" +
                "display: none;\n" +
                "position: fixed;\n" +
                "z-index: 1;\n" +
                "left: 0;\n" +
                "top: 0;\n" +
                "width: 100%;\n" +
                "height: 100%;\n" +
                "overflow: auto;\n" +
                "background-color: rgb(0,0,0);\n" +
                "background-color: rgba(0,0,0,0.4);\n" +
                "padding-top: 60px;\n" +
                "}\n" +
                "\n" +
                ".modal-content {\n" +
                "background-color: #fefefe;\n" +
                "margin: 5% auto 15% auto;\n" +
                "border: 1px solid #888;\n" +
                "width: 80%;\n" +
                "}\n" +
                "/* The Close Button (x) */\n" +
                ".close {\n" +
                "position: absolute;\n" +
                "right: 25px;\n" +
                "top: 0;\n" +
                "color: #000;\n" +
                "font-size: 35px;\n" +
                "font-weight: bold;\n" +
                "}\n" +
                ".close:hover,\n" +
                ".close:focus {\n" +
                "color: red;\n" +
                "cursor: pointer;\n" +
                "\n" +
                "}\n" +
                "/* Add Zoom Animation */\n" +
                ".animate {\n" +
                "-webkit-animation: animatezoom 0.6s;\n" +
                "animation: animatezoom 0.6s\n" +
                "}\n" +
                "@-webkit-keyframes animatezoom {\n" +
                "from {-webkit-transform: scale(0)}\n" +
                "to {-webkit-transform: scale(1)}\n" +
                "}\n" +
                "@keyframes animatezoom {\n" +
                "from {transform: scale(0)}\n" +
                "to {transform: scale(1)}\n" +
                "}\n" +
                "/* Change styles for span and cancel\n" +
                "button on extra small screens */\n" +
                "@media screen and(max-width: 300px){\n" +
                "span.psw {\n" +
                "display: block;\n" +
                "float: none;\n" +
                "}\n" +
                ".cancelbtn {\n" +
                "width: 100%;\n" +
                "}\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<h2> Modal Login Form</h2>\n" +
                "<button onclick=\"document.\n" +
                "getElementById('id01')\n" +
                ".style.display='block'\"\n" +
                "style=\"width:auto;\">Login\n" +
                "</button>\n" +
                "<div id=\"id01\" class=\"modal\">\n" +
                "<form class=\"modal-content animate\"\n" +
                "action=\"action_page.php\">\n" +
                "<div class=\"imgcontainer\">\n" +
                "<span onclick=\"document\n" +
                ".getElementById('id01')\n" +
                ".style.display='none'\"\n" +
                "\n" +
                "class=\"close\" title=\"Close Modal\">\n" +
                "&times;</span>\n" +
                "<img src=\"img_profile.png\"\n" +
                "alt=\"Avatar\"\n" +
                "class=\"avatar\">\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "<label><b>Username</b></label>\n" +
                "<input type=\"text\" placeholder=\n" +
                "\"Enter Username\"\n" +
                "name=\"uname\" required>\n" +
                "\n" +
                "<label><b>Password</b></label>\n" +
                "<input type=\"password\" placeholder=\n" +
                "\"Enter Password\" name=\"psw\" required>\n" +
                "<button type=\"submit\">Login</button>\n" +
                "<input type=\"checkbox\"\n" +
                "checked=\"checked\">\n" +
                "Remember me\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"container\"\n" +
                "style=\"background-color:#f1f1f1\">\n" +
                "<button type=\"button\"\n" +
                "onclick=\"document.getElementById\n" +
                "('id01').style.\n" +
                "display='none'\" class=\"cancelbtn\">\n" +
                "Cancel</button>\n" +
                "<span class=\"psw\">Forgot\n" +
                "<a href=\"#\">password?\n" +
                "</a></span>\n" +
                "</div>\n" +
                "</form>\n" +
                "</div>\n" +
                "<script>\n" +
                "// Get the modal\n" +
                "var modal = document.getElementById\n" +
                "('id01');\n" +
                "// When the user clicks anywhere\n" +
                "\n" +
                "outside of the modal, close it\n" +
                "window.onclick = function(event) {\n" +
                "if (event.target == modal) {\n" +
                "modal.style.display = \"none\";\n" +
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

