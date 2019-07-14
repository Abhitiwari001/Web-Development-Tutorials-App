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

public class HtmlListsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_lists, container, false);

        TextView textView = rootView.findViewById(R.id.list_desc);
        textView.setText("1.Unordered list: This can be created using <ul> tag,this will list items using plain bullets.\n" +
                "2.Ordered list: This can be created usingn<ol> tag,this will use different schemes of numbers to list\n" +
                "items.\n" +
                "3.Definition list: This can be created using <dl> tag,this arranges your items in the same way as\n" +
                "they are arranged.");

        TextView textView1 = rootView.findViewById(R.id.ullist_desc);
        textView1.setText("An unordered list is a collection of items that have no special order or sequence.This list is created\n" +
                "by using HTML<ul> tag and each list starts with <li> tag , each item in the list is marked with a\n" +
                "bullet .");

        CodeView codeView = rootView.findViewById(R.id.html_ullist_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Unordered List</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<ul>\n" +
                "<li>Tiger</li>\n" +
                "<li>cheetah</li>\n" +
                "<li>jaguar</li>\n" +
                "<li>Lion</li>\n" +
                "</ul>\n" +
                "</body>\n" +
                "</html>");

        TextView textView2 = rootView.findViewById(R.id.ultype_desc);
        textView2.setText("You can use type attribute for <ul> tag to specify the type of bullet you like,by default it is a disc\n" +
                "the options are circle , square , none .\n1. <ul type=\"square\">\n" +
                "2. <ul type=\"disc\">\n" +
                "3. <ul type=\"circle\">\n" +
                "4. <ul type=\"none\">");

        CodeView codeView1 = rootView.findViewById(R.id.html_ultype_code);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>TYPE ATTRIBUTE</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h4>Square attribute example </h4>\n" +
                " <ul type=\"square\">\n" +
                " <li>Tiger</li>\n" +
                " <li>Lion</li>\n" +
                "\n" +
                " </ul>\n" +
                "<h4>Disc attribute example </h4>\n" +
                "<ul type=\"disc\">\n" +
                " <li>Tiger</li>\n" +
                " <li>Lion</li>\n" +
                "\n" +
                " </ul>\n" +
                "<h4>circle attribute example </h4>\n" +
                "<ul type=\"circle\">\n" +
                " <li>Tiger</li>\n" +
                " <li>Lion</li>\n" +
                "\n" +
                " </ul>\n" +
                "<h4>none attribute example </h4>\n" +
                "<ul type=\"none\">\n" +
                " <li>Tiger</li>\n" +
                " <li>Lion</li>\n" +
                "\n" +
                " </ul>\n" +
                " </body>\n" +
                "</html>");

        TextView textView3 = rootView.findViewById(R.id.olist_desc);
        textView3.setText("An Ordered list is a list of items in a numbered list.This list is created by using <ol> tag. The\n" +
                "numbering starts at one and is incremented by one for each successive ordered list element tagged\n" +
                "with <li>.");

        CodeView codeView2 = rootView.findViewById(R.id.html_olist_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Ordered List</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<ol>\n" +
                "<li>Tiger</li>\n" +
                "<li>cheetah</li>\n" +
                "<li>jaguar</li>\n" +
                "<li>Lion</li>\n" +
                "</ol>\n" +
                "</body>\n" +
                "</html>");

        TextView textView4 = rootView.findViewById(R.id.olisttype_desc);
        textView4.setText("Type attribute can be used for <ol> tag to specify the type of numbering by default it is a number .\n" +
                "1. <ol type=\"1\"> - Default Numerals.\n" +
                "2. <ol type=\"I\"> - Upper-Case Numerals.\n" +
                "3. <ol type=\"i\"> - Lower-Case Numerals.\n" +
                "4. <ol type=\"a\"> - Lower-Case Letters.\n" +
                "5. <ol type=\"A\"> - Upper-Case Letters.");

        CodeView codeView3 = rootView.findViewById(R.id.html_olistattr_code);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>HTML Ordered List</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h4> Default Numerals </h4>\n" +
                " <ol type=\"1\">\n" +
                " <li>Tiger</li>\n" +
                " <li>Lion</li>\n" +
                " </ol>\n" +
                "<h4>Upper-Case Numerals</h4>\n" +
                "<ol type=\"I\">\n" +
                " <li>Tiger</li>\n" +
                " <li>Lion</li>\n" +
                " </ol>\n" +
                "<h4> Lower-Case Numerals </h4>\n" +
                "<ol type=\"i\">\n" +
                " <li>Tiger</li>\n" +
                " <li>Lion</li>\n" +
                " </ol>\n" +
                "<h4>Lower-Case Letters </h4>\n" +
                "<ol type=\"a\">\n" +
                " <li>Tiger</li>\n" +
                " <li>Lion</li>\n" +
                " </ol>\n" +
                "<h4>Upper-Case Letters </h4>\n" +
                "<ol type=\"A\">\n" +
                " <li>Tiger</li>\n" +
                " <li>Lion</li>\n" +
                " </ol>\n" +
                " </body>\n" +
                "</html>");

        TextView textView5 = rootView.findViewById(R.id.dlist_desc);
        textView5.setText("A description list, is a list of items, with a description of each item.\n" +
                "1. The <dl> tag defines a list.\n" +
                "2. The <dt> tag defines the Item name.\n" +
                "3. The <dd> tag defines the description.");

        CodeView codeView4 = rootView.findViewById(R.id.html_dlist_code);
        codeView4.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<h2> Description List</h2>\n" +
                "<dl>\n" +
                "<dt>Tiger</dt>\n" +
                "<dd>Tiger is Endangered</dd>\n" +
                "<dt>Lion</dt>\n" +
                "<dd>Lion is the king of jungle</dd>\n" +
                "</dl>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView5 = rootView.findViewById(R.id.html_hlist_code);
        codeView5.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "ul#list li {\n" +
                " display:inline;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Horizontal List</h2>\n" +
                "<ul id=\"list\">\n" +
                "<li>Tiger</li>\n" +
                "<li>cheetah</li>\n" +
                "<li>jaguar</li>\n" +
                "<li>Lion</li>\n" +
                "</ul>\n" +
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
