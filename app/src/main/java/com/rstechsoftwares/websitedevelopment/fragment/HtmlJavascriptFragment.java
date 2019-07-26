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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class HtmlJavascriptFragment extends Fragment {
    private InterstitialAd mInterstitialAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_javascript, container, false);
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        CodeView codeView = rootView.findViewById(R.id.html_java_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>External Script</title>\n" +
                "<script src=\"/html/External.js\"\n" +
                "type=\"text/javascript\"/>\n" +
                "</script>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Example for External Script</h2>\n" +
                "<input type=\"button\"\n" +
                "onclick=\"External();\n" +
                "\" value=\"Click here\" />\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView1 = rootView.findViewById(R.id.html_javai_code);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Internal Script</title>\n" +
                "<script type=\"text/javascript\">\n" +
                "function internal(){\n" +
                "alert(\"Internal Script\");\n" +
                "}\n" +
                "</script>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Example for Internal script</h2>\n" +
                "<input type=\"button\"\n" +
                "onclick=\"internal();\n" +
                "\"value=\"Click here\" />\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView2 = rootView.findViewById(R.id.html_event_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Event Handlers </title>\n" +
                "<script type=\"text/javascript\">\n" +
                "function EventHandler(){\n" +
                "alert(\"Event Handler Example\");\n" +
                "}\n" +
                "</script>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p onmouseover=\"EventHandler();\">\n" +
                "Bring your mouse here to see\n" +
                "the alert message</p>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView3 = rootView.findViewById(R.id.html_noscript_code);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<p id=\"demo\"></p>\n" +
                "<script>\n" +
                "document.getElementById(\"demo\")\n" +
                ".innerHTML = \"NOSCRIPT TAG!\";\n" +
                "</script>\n" +
                "<noscript> Sorry, your browser\n" +
                "does not support JavaScript!\n" +
                "</noscript>\n" +
                "<p>A browser without support for\n" +
                "JavaScript will show the text\n" +
                "written inside the noscript\n" +
                "element.</p>\n" +
                "</body>\n" +
                "</html>");

        TextView textView = rootView.findViewById(R.id.java_variables);
        textView.setText("JavaScript variables are containers for storing data values. Variable should be assigned some values\n" +
                "The ( = ) equal sign is called assignment operator . In JavaScript, the equal sign (=) is an\n" +
                "\"assignment\" operator, not an \"equal to\" operator, you assign the value of what is on the right side\n" +
                "of the = sign to whatever is on the left side of the = sign, you cannot perform operations with empty\n" +
                "variables.\n" +
                "JavaScript variables can hold numbers like 200 , and text values like \"Tiger\".\n" +
                "In programming, text values are called text strings.\n" +
                "Strings are written inside double or single quotes. Numbers are written without quotes.\n" +
                "If you put quotes around a number, it will be treated as a text string.\n" +
                "JAVASCRIPT IDENTIFIERS\n" +
                "All JavaScript variables must be identified with unique names.\n" +
                "These unique names are called identifiers. Identifiers can be short names (like x and y), or more\n" +
                "descriptive names (age, sum, totalVolume). The general rules for constructing names for variables\n" +
                "(unique identifiers) are:\n" +
                "Names can contain letters, digits, underscores, and dollar signs.\n" +
                "Names must begin with a letter.\n" +
                "Names can also begin with $ and @.\n" +
                "Names are case sensitive (L and l are different variables) Reserved words (like JavaScript\n" +
                "keywords) cannot be used as names.");

        CodeView codeView4 = rootView.findViewById(R.id.html_variables_code);
        codeView4.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<h1>JavaScript Variables</h1>\n" +
                "<p>In this example, L, M, N, O are\n" +
                "variables</p>\n" +
                "<p id=\"sample\"></p>\n" +
                "<script>\n" +
                "var L = 4;\n" +
                "var M = 6;\n" +
                "var N = L + M;\n" +
                "var O = L * M;\n" +
                "document.getElementById(\"sample\")\n" +
                ".innerHTML = O;\n" +
                "</script>\n" +
                "<p>You can declare many variables in\n" +
                "one statement, Start the statement\n" +
                "with var and separate the variables\n" +
                "by comma.</p>\n" +
                "<p id=\"sample 1\"></p>\n" +
                "<script>\n" +
                "var Animal = \"tiger\", weight = 200 ;\n" +
                "document.getElementById(\"sample 1\")\n" +
                ".innerHTML = Animal + \" weight is \"\n" +
                "+ weight + \" kg \";\n" +
                "</script>\n" +
                "</body>\n" +
                "</html> ");

        TextView textView1 = rootView.findViewById(R.id.java_function);
        textView1.setText("A JavaScript function is a block of code designed to perform a particular task ,a JavaScript function\n" +
                "is executed when \"something\" invokes it (calls it).\n" +
                "When JavaScript reaches a return statement, the function will stop executing, if the function was\n" +
                "invoked from a statement, JavaScript will \"return\" to execute the code after the invoking statement." +
                "\nA JavaScript function is defined with the function keyword, followed by a name, followed by\n" +
                "parentheses ().\n" +
                "Function names can contain letters, digits, underscores, and dollar signs .\n" +
                "The parentheses may include parameter names separated by commas: (parameter1, parameter2,\n" +
                "parameter3 ...)\n" +
                "The code to be executed, by the function, is placed inside curly brackets {}");

        CodeView codeView5 = rootView.findViewById(R.id.html_function_code);
        codeView5.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<p>This example calls a function\n" +
                "which performs a calculation,\n" +
                "and returns the result:</p>\n" +
                "<p id=\"sample\"></p>\n" +
                "<script>\n" +
                "function myFunction(L, M) {\n" +
                " return L * M;\n" +
                "}\n" +
                "document.getElementById(\"sample\")\n" +
                ".innerHTML = myFunction(6, 3);\n" +
                "</script>\n" +
                "<p>This example calls a function to\n" +
                "convert from Seconds to Minutes:</p>\n" +
                "<p id=\"sample1\"></p>\n" +
                "<script>\n" +
                "function tominutes(f) {\n" +
                " return f/60+\" minutes \";\n" +
                "}\n" +
                "document.getElementById(\"sample1\")\n" +
                ".innerHTML = tominutes(120);\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");

        TextView textView2 = rootView.findViewById(R.id.bool_tv);
        textView2.setText("The Boolean object represents two values, either \"true\" or \"false\", intended to represent the truth\n" +
                "values of logic, very often in programming, you will need a data type that can only have one of two\n" +
                "values, like YES / NO , ON / OFF , TRUE / FALSE.\n" +
                "Everything with a \"Real\" value is True\n" +
                "Everything without a \"Real\" value is False\n" +
                "The Boolean value of 0 (zero) is false\n" +
                "The Boolean value of -0 (minus zero) is false\n" +
                "The Boolean value of \"\" (empty string) is false\n" +
                "The Boolean value of undefined is false\n" +
                "The Boolean value of null is false\n" +
                "The Boolean value of NaN is false");

        CodeView codeView6 = rootView.findViewById(R.id.html_bool_code);
        codeView6.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<p>Display the value of Boolean\n" +
                "(8 > 3):</p>\n" +
                "<button onclick=\"myBoolean()\">Try it\n" +
                "</button>\n" +
                "<p id=\"sample\"></p>\n" +
                "<script>\n" +
                "function myBoolean() {\n" +
                "document.getElementById(\"sample\")\n" +
                ".innerHTML = Boolean(8 > 3);\n" +
                "}\n" +
                "</script>\n" +
                "<p>Display the Boolean value of 0</p>\n" +
                "<button onclick=\"myboolean()\">Try it\n" +
                "</button>\n" +
                "<p id=\"sample1\"></p>\n" +
                "<script>\n" +
                "function myboolean() {\n" +
                " var x = 0;\n" +
                "\n" +
                "document.getElementById(\"sample1\")\n" +
                ".innerHTML = Boolean(x);\n" +
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
