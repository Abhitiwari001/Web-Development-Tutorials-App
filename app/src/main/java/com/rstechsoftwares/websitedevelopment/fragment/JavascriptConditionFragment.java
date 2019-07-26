package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class JavascriptConditionFragment extends Fragment implements RewardedVideoAdListener {
    private RewardedVideoAd mRewardedVideoAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_javascript_condition, container, false);
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        CodeView codeView = rootView.findViewById(R.id.if_code);
        codeView.setCode("if (condition) {\n" +
                "code to be executed if the condition is true }");

        CodeView codeView1 = rootView.findViewById(R.id.else_code);
        codeView1.setCode("if (condition) {\n" +
                "code to be executed if the condition is true } else {\n" +
                "code to be executed if the condition is false }");

        CodeView codeView2 = rootView.findViewById(R.id.else_if_code);
        codeView2.setCode("if (condition1) {\n" +
                "code to be executed if condition1 is true } else if (condition2) {\n" +
                "code to be executed if the condition1 is false and condition2 is true }\n" +
                "else {\n" +
                "code to be executed if the condition1 is false and condition2 is false }");

        CodeView codeView3 = rootView.findViewById(R.id.javascript_condition_code);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\t<h3>This is the example of if\n" +
                "Statement </h3>\n" +
                "<p>Click the button to know your\n" +
                "driving eligibility</p>\n" +
                "<button onclick=\"myFunction()\">\n" +
                "Try it</button>\n" +
                "<p id=\"demo\"></p>\n" +
                "<script>\n" +
                "function myFunction() {\n" +
                "var message;\n" +
                "var age = 23 ;\n" +
                "if (age > 19) {\n" +
                "message=\"you are eligible to drive\";\n" +
                "}\n" +
                "document.getElementById(\"demo\")\n" +
                ".innerHTML = message;\n" +
                "}\n" +
                "</script>\n" +
                "<h3>This is the example of else\n" +
                "Statement </h3>\n" +
                "<p>Click the button to know your\n" +
                "driving eligibility</p>\n" +
                "<button onclick=\"myFunction1()\">\n" +
                "Try it</button>\n" +
                "<p id=\"demo1\"></p>\n" +
                "<script>\n" +
                "function myFunction1() {\n" +
                "var message1;\n" +
                "var age = 1;\n" +
                "if (age > 19) {\n" +
                "\tmessage1=\"you are eligible to drive\";\n" +
                "} else {\n" +
                "message1= \"not eligible to drive\";\n" +
                "}\n" +
                "\n" +
                "document.getElementById(\"demo1\")\n" +
                ".innerHTML = message1;\n" +
                "}\n" +
                "</script>\n" +
                "<h3>This is the example of else if\n" +
                "Statement </h3>\n" +
                "<p>Click the button to know your\n" +
                "driving eligibility</p>\n" +
                "<button onclick=\"myFunction2()\">\n" +
                "Try it</button>\n" +
                "<p id=\"demo2\"></p>\n" +
                "<script>\n" +
                "function myFunction2() {\n" +
                "var message2;\n" +
                "var age = 19;\n" +
                "if (age < 19) {\n" +
                "message2 = \"not eligible to drive\";\n" +
                "} else if (age > 19) {\n" +
                "message2=\"you are eliglibe to drive\";\n" +
                "} else {\n" +
                "message2=\"you have just turned 19!\";\n" +
                "}\n" +
                "document.getElementById(\"demo2\")\n" +
                ".innerHTML = message2;\n" +
                "}\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView4 = rootView.findViewById(R.id.switch_syntax);
        codeView4.setCode("switch(expression) {\n" +
                "case n: Code Statment\n" +
                "break;\n" +
                "case n: Code Statment\n" +
                "break;\n" +
                "default: Default Code Statment\n" +
                "}");

        CodeView codeView5 = rootView.findViewById(R.id.javascript_switch_code);
        codeView5.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                " <body>\n" +
                "<h2>Example For JavaScript Switch\n" +
                "</h2>\n" +
                "<h3>Enter your grade to know\n" +
                "your marks</h3>\n" +
                "\n" +
                "<script>\n" +
                "\n" +
                "var grade='U';\n" +
                "document.write(\"GradeMarks Range :\");\n" +
                "switch (grade)\n" +
                "{\n" +
                "\n" +
                "case 'S': document.write\n" +
                "(\" 91 to 100 Marks\");\n" +
                "break;\n" +
                "\n" +
                "case 'A': document.write\n" +
                "(\" 81 to 90 Marks\");\n" +
                "break;\n" +
                "\n" +
                "case 'B': document.write\n" +
                "(\" 71 to 80 Marks\");\n" +
                "break;\n" +
                "\n" +
                "case 'C': document.write\n" +
                "(\" 61 to 70 Marks\");\n" +
                "break;\n" +
                "\n" +
                "case 'U': document.write(\" Failed\");\n" +
                "break;\n" +
                "\n" +
                "default: document.write\n" +
                "(\"Unknown Grade<br />\")\n" +
                "}\n" +
                "\n" +
                "\n" +
                "</script>\n" +
                "\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView6 = rootView.findViewById(R.id.loop_syntax);
        codeView6.setCode("for (statement 1; statement 2; statement 3) {\n" +
                "code to be executed\n" +
                "} " +
                "\nwhile (condition)\n" +
                "{\n" +
                "code to be executed\n" +
                "}");

        CodeView codeView7 = rootView.findViewById(R.id.javascript_for_code);
        codeView7.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<h3> Example for For Loop </h3>\n" +
                "<p>Click the button to loop through\n" +
                "a block of code five times.</p>\n" +
                "<button onclick=\"Function()\">\n" +
                "Try it</button>\n" +
                "<p id=\"Sample\"></p>\n" +
                "<script>\n" +
                "function Function() {\n" +
                "var text = \"\";\n" +
                "var i;\n" +
                "for (i = 1; i < 6; i++) {\n" +
                "text += \"The number is \" +i+ \"<br>\";\n" +
                "}\n" +
                "document.getElementById(\"Sample\")\n" +
                ".innerHTML = text;\n" +
                "}\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView8 = rootView.findViewById(R.id.javascript_for_in_code);
        codeView8.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<h3>Example for For/In Loop </h3>\n" +
                "<p id=\"sample\"></p>\n" +
                "<script>\n" +
                "var txt = \"\";\n" +
                "var person = {name:\"John\",\n" +
                "gender:\"Male\", age:28};\n" +
                "var x;\n" +
                "for (x in person) {\n" +
                " txt += person[x] + \" \";\n" +
                "}\n" +
                "document.getElementById(\"sample\")\n" +
                ".innerHTML = txt;\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView9 = rootView.findViewById(R.id.javascript_do_while_code);
        codeView9.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<h3>Example For Do/While Loop </h3>\n" +
                "<p>Click the button to loop through\n" +
                "a block of code as long as i is\n" +
                "less than 12.</p>\n" +
                "<button onclick=\"Function()\">\n" +
                "Try it</button>\n" +
                "<p id=\"sample\"></p>\n" +
                "<script>\n" +
                "function Function() {\n" +
                "var text = \"\"\n" +
                "var i = 1;\n" +
                "do {\n" +
                "text += \"<br>The number is \" + i;\n" +
                "i++;\n" +
                "}\n" +
                "while (i < 12)\n" +
                "document.getElementById(\"sample\")\n" +
                ".innerHTML = text;\n" +
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
    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }
    @Override
    public void onRewarded(RewardItem reward) {
        Toast.makeText(getContext(), "onRewarded! currency: " + reward.getType() + "  amount: " +
                reward.getAmount(), Toast.LENGTH_SHORT).show();
        // Reward the user.
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {
        Toast.makeText(getContext(), "onRewardedVideoAdLeftApplication",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdClosed() {
        Toast.makeText(getContext(), "onRewardedVideoAdClosed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int errorCode) {
        Toast.makeText(getContext(), "onRewardedVideoAdFailedToLoad", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdLoaded() {
        mRewardedVideoAd.show();
    }

    @Override
    public void onRewardedVideoAdOpened() {
        Toast.makeText(getContext(), "onRewardedVideoAdOpened", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoStarted() {
        Toast.makeText(getContext(), "onRewardedVideoStarted", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoCompleted() {
        Toast.makeText(getContext(), "onRewardedVideoCompleted", Toast.LENGTH_SHORT).show();
    }
}
