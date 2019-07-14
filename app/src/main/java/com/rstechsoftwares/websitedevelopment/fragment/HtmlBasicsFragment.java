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
import com.google.android.gms.ads.MobileAds;
import com.rstechsoftwares.websitedevelopment.R;

import io.github.kbiakov.codeview.CodeView;

public class HtmlBasicsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_basics, container, false);
        //MobileAds.initialize(getContext(),"ca-app-pub-3940256099942544~3347511713");

        CodeView codeView = rootView.findViewById(R.id.code_view_basic);
        codeView.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Title of the page</title>\n</head>\n<body>\n<h1>This is Heading</h1>\n<p>This is paragraph</p>\n</body>\n</html>");
        TextView textView = rootView.findViewById(R.id.html_def);
        textView.setText("1.The DOCTYPE declaration defines the document type to be HTML. \n2.The text between <html> and </html> describes an HTML document. \n3.The text between <head> and </head> provides info about the document. \n4.The text between <title> and </title> provides a title for the document. \n5.The text between <body> and </body> describes the visible page content. \n6.The text between <h1> and </h1> describes a heading. \n7.The text between <p> and </p> describes a paragraph.");
        TextView textView1 = rootView.findViewById(R.id.html_head);
        textView1.setText("Every document will have a heading. HTML has different sizes for headings. which use the following elements <h1>, <h2>, <h3>, <h4>, <h5>, and <h6>. While displaying any heading, browser adds one line before and one line after that heading.");
        CodeView codeView1 = rootView.findViewById(R.id.code_view_head);
        codeView1.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Heading Example</title>\n</head>\n<body>\n<h1>Example for heading h1</h1>\n<h2>Example for heading h2</h2>\n<h3>Example for heading h3</h3>\n<h4>Example for heading h4</h4>\n<h5>Example for heading h5</h5>\n<h6>Example for heading h6</h6>\n</body>\n</html>");
        TextView textView2 = rootView.findViewById(R.id.html_para);
        textView2.setText("In HTML you can structure your text into different paragraphs by using the tag <p>.Each paragraph of text should go in between an opening <p> and a closing </p> tag .");
        CodeView codeView2 = rootView.findViewById(R.id.html_para_code);
        codeView2.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Paragraph Example</title>\n</head>\n<body>\n<p>This is First Paragraph.</p>\n<p>This is Second Paragraph.</p>\n<p>This is Third Paragraph.</p>\n</body>\n</html>");
        TextView textView3 = rootView.findViewById(R.id.html_brk);
        textView3.setText("If you use the <br> tag , anything following it starts from the next line . This tag is an example of an empty element, there is no need for opening and closing tags, as there is nothing to go in between them.");
        CodeView codeView3 = rootView.findViewById(R.id.html_brk_code);
        codeView3.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Example for Line Break\n</title>\n</head>\n<body>\n<p>This<br>\nis an example for<br>\nLine Break</p>\n</body>\n</html>");
        TextView textView4 = rootView.findViewById(R.id.html_center);
        textView4.setText("To center any content in HTML You can use <center> tag this will to put any content inside the tag in the center of the page or any table cell.");
        CodeView codeView4 = rootView.findViewById(R.id.html_center_code);
        codeView4.setCode("<html>\n<head>\n<title>Centering content</title>\n</head>\n<body>\n<p>This is not in the center .</p>\n<center>\n<p>This is in the center.</p>\n</center>\n</body>\n</html>");
        TextView textView5 = rootView.findViewById(R.id.html_format);
        textView5.setText("If want your text to be exact format of how it is written in the HTML document you can use the preformatted tag <pre>. Any text between the opening <pre> tag and the closing </pre> tag will preserve the formatting of the source document.");
        CodeView codeView5 = rootView.findViewById(R.id.html_format_code);
        codeView5.setCode("<!DOCTYPE html>\n<html>\n<head>\n<title>Preserve Formatting</title>\n</head>\n<body>\n<pre>\nThis\nis\nan\nExample for preserve\n</pre>\n</body>\n</html>");
        TextView textView6 = rootView.findViewById(R.id.html_line);
        textView6.setText("To create a horizontal line between a section of document the <hr> tag can be used it creates a line from the current position in the document to the right margin and breaks the line accordingly ");
        CodeView codeView6 = rootView.findViewById(R.id.html_line_code);
        codeView6.setCode("<html>\n<head>\n<title>Horizontal Line </title>\n</head>\n<body>\n<p>This is above the line</p>\n<hr />\n<p>This is below the line</p>\n</body>\n</html>");
        Button button = rootView.findViewById(R.id.try_now_button);
        button.setOnClickListener(v -> tryNow());
        return rootView;

    }

    private void tryNow() {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.details_container_frame, new TryYourselfFragment())
                .commit();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Try Yourself Editor");
    }
}
