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

public class HtmlFormattingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_formatting, container, false);
        CodeView codeView = rootView.findViewById(R.id.html_bold_code);
        codeView.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Bold Formatting</title>\n</head>\n<body>\n<p>The following word uses a\n<b>bold</b> typeface.</p>\n</body>\n</html>");
        CodeView codeView1 = rootView.findViewById(R.id.html_italic_code);
        codeView1.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Italic Text Example</title>\n</head>\n<body>\n<p>The following word uses a\n<i>italicized</i> typeface.</p>\n</body>\n</html>");
        CodeView codeView2 = rootView.findViewById(R.id.html_under_code);
        codeView2.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Underlined and Strike \nText Example</title>\n</head>\n<body>\n<p>The following word uses a\n<u>underlined</u> typeface.</p>\n<p>The following word uses a\n<strike>strikethrough</strike> \ntypeface.</p>\n</body>\n</html>");
        CodeView codeView3 = rootView.findViewById(R.id.html_marked_code);
        codeView3.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title> Marked & Deleted </title>\n</head>\n<body>\n<p> This is <mark>Marked</mark></p>\n<p> This is <del>Deleted</del> </p>\n</body>\n</html>");
        CodeView codeView4 = rootView.findViewById(R.id.html_text_code);
        codeView4.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Larger Text Example</title>\n</head>\n<body>\n<p>The following word is in\n<big>LARGE</big> typeface.</p>\n<p>The following word is in\n<small>SMALL</small> typeface.</p>\n</body>\n</html>");
        CodeView codeView5 = rootView.findViewById(R.id.html_group_code);
        codeView5.setCode("<!DOCTYPE html>\n<html>\n<body>\n<div style=\"color:steelblue\">\n<h3>This is a heading in a \ndiv element</h3>\n<p>This is some text in a \ndiv element.</p>\n</div>\n<p>This is the example of\n<span style=\"color:steelblue\"> \nspan tag</span>\n</body>\n</html>");
        CodeView codeView6 = rootView.findViewById(R.id.html_sub_code);
        codeView6.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Super & Subscript Example\n</title>\n</head>\n<body>\n<p>The following word uses a\n<sup>superscript</sup> typeface</p>\n<p>The following word uses a\n<sub>subscript</sub> typeface</p>\n</body>\n</html>");
        Button button = rootView.findViewById(R.id.try_now_button);
        button.setOnClickListener(v -> tryNow());
        TextView textView = rootView.findViewById(R.id.html_bold_tv);
        textView.setText("Bold formatting property changes the element to bold format,anything that appears within <b>........</b> element,is displayed in bold .");
        TextView textView1 = rootView.findViewById(R.id.html_italic_tv);
        textView1.setText("Italic formatting property changes the element to bold format anything that appears within <i>...</i> element is displayed in italicized");
        TextView textView2 = rootView.findViewById(R.id.html_under_tv);
        textView2.setText("Underlined and Strike format property changes the element to underlined and strikethrough,anything that appears within <u>........</u> element is displayed with underline and Anything that appears within <strike>..</strike> element is displayed with strikethrough.");
        TextView textView3 = rootView.findViewById(R.id.html_marked_tv);
        textView3.setText("Marked and Deleted format property changes the element to Marked and deleted , anything that appears within <mark>.....</mark> element is displayed as marked text and Anything that appears within <del>.....</del> element is displayed as deleted text.");
        TextView textView4 = rootView.findViewById(R.id.html_text_tv);
        textView4.setText("Large and Small format property changes the element to Larger and small text . The content of the <big>...</big> element is displayed one font size larger than the rest of the text surrounding it . The content of the <small>...</small> element is displayed one font size smaller than the rest of the text surrounding it .");
        TextView textView5 = rootView.findViewById(R.id.html_group_tv);
        textView5.setText("The <div> and <span> elements allow you to group together several elements to create sections or subsections of a page.The <div> tag defines a division or a section in an HTML document.The <span> element can be used to group inline elements only . So , if you have a part of a sentence or paragraph which you want to group together, you could use the <span> element .");
        TextView textView6 = rootView.findViewById(R.id.html_sub_tv);
        textView6.setText("Superscript and Subscript format property changes the element to Superscript and Subscript . The content of the <sup> ....... </sup> element is displayed in superscript format . The content of the <sub>...</sub> element is displayed in subscript format .");
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
