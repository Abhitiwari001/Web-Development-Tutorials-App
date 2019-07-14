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

public class HtmlTablesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_html_tables, container, false);

        TextView textView = rootView.findViewById(R.id.table_desc);
        textView.setText("The HTML tables allows to arrange data like text, images, links, other tables, etc. into rows and\n" +
                "columns of cells.\n" +
                "1. Tables are defined with the <table> tag.\n" +
                "2. Tables are divided into table rows with the <tr> tag.\n" +
                "3. Table rows are divided into table data with the <td> tag.\n" +
                "4. A table row can also be divided into table headings with the <th>.");

        CodeView codeView = rootView.findViewById(R.id.html_table_code);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table, th, td {\n" +
                " border: 1px solid black;\n" +
                " border-collapse: collapse;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table style=\"width:50%\">\n" +
                " <tr>\n" +
                " <th>Country</th>\n" +
                " <th>capital</th>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>India</td>\n" +
                " <td>New delhi</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>Germany</td>\n" +
                " <td>Berlin</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>New zealand</td>\n" +
                " <td>Wellington</td>\n" +
                "\n" +
                " </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView1 = rootView.findViewById(R.id.html_padding_code);
        codeView1.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table, th, td {\n" +
                " border: 1px solid black;\n" +
                " border-collapse: collapse;\n" +
                "}\n" +
                "th, td {\n" +
                " padding: 15px;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table style=\"width:50%\">\n" +
                " <tr>\n" +
                " <th>Country</th>\n" +
                " <th>capital</th>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>India</td>\n" +
                " <td>New delhi</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>Germany</td>\n" +
                " <td>Berlin</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>New zealand</td>\n" +
                " <td>Wellington</td>\n" +
                "\n" +
                " </tr>\n" +
                "</table>\n" +
                "<p>The cell padding is set\n" +
                "to 15px.</p>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView2 = rootView.findViewById(R.id.html_spacing_code);
        codeView2.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table, th, td {\n" +
                " border: 1px solid black;\n" +
                " padding: 5px;\n" +
                "}\n" +
                "table {\n" +
                " border-spacing: 15px;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table style=\"width:50%\">\n" +
                "\t<tr>\n" +
                " <th>Country</th>\n" +
                " <th>capital</th>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>India</td>\n" +
                " <td>New delhi</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>Germany</td>\n" +
                " <td>Berlin</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>New zealand</td>\n" +
                " <td>Wellington</td>\n" +
                "\n" +
                " </tr>\n" +
                "</table>\n" +
                "<p> border-spacing is set\n" +
                "to 15px.</p>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView3 = rootView.findViewById(R.id.html_span_code);
        codeView3.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table, th, td {\n" +
                "\tborder: 1px solid black;\n" +
                " border-collapse: collapse;\n" +
                "}\n" +
                "th, td {\n" +
                " padding: 5px;\n" +
                " text-align: left;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Cell that spans two columns:</h2>\n" +
                "<table style=\"width:100%\">\n" +
                " <tr>\n" +
                " <th>Name</th>\n" +
                " <th colspan=\"2\">Telephone</th>\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>xyz</td>\n" +
                " <td>044 67 154</td>\n" +
                " <td>91 72 455</td>\n" +
                " </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView4 = rootView.findViewById(R.id.html_row_span_code);
        codeView4.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table, th, td {\n" +
                " border: 1px solid black;\n" +
                " border-collapse: collapse;\n" +
                "}\n" +
                "th, td {\n" +
                " padding: 5px;\n" +
                " text-align: left;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Cell that spans two rows:</h2>\n" +
                "<table style=\"width:100%\">\n" +
                " <tr>\n" +
                " <th>Name:</th>\n" +
                " <td>xyz</td>\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <th rowspan=\"2\">Telephone:</th>\n" +
                " <td>044 17 674</td>\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>91 12 6785</td>\n" +
                " </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView5 = rootView.findViewById(R.id.html_caption_code);
        codeView5.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table, th, td {\n" +
                " border: 1px solid black;\n" +
                " border-collapse: collapse;\n" +
                "}\n" +
                "th, td {\n" +
                " padding: 5px;\n" +
                " text-align: left;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table style=\"width:50%\">\n" +
                "<caption> CAPITALS </caption>\n" +
                " <tr>\n" +
                " <th>Country</th>\n" +
                " <th>capital</th>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>India</td>\n" +
                " <td>New delhi</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>Germany</td>\n" +
                " <td>Berlin</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>New zealand</td>\n" +
                " <td>Wellington</td>\n" +
                "\n" +
                " </tr>\n" +
                "</table>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView6 = rootView.findViewById(R.id.html_styles_code);
        codeView6.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table {\n" +
                " width:50%;\n" +
                "}\n" +
                "table, th, td {\n" +
                " border: 1px solid black;\n" +
                " border-collapse: collapse;\n" +
                "}\n" +
                "th, td {\n" +
                " padding: 5px;\n" +
                " text-align: left;\n" +
                "}\n" +
                "table#t01 tr:nth-child(even) {\n" +
                " background-color: #6B9BC3;\n" +
                "}\n" +
                "table#t01 tr:nth-child(odd) {\n" +
                " background-color:#6DDAD6 ;\n" +
                "}\n" +
                "table#t01 th {\n" +
                " background-color: #6DDAD6 ;\n" +
                " color: black;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table id=\"t01\">\n" +
                " <tr>\n" +
                " <th>First Name</th>\n" +
                " <th>Last Name</th>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>jack</td>\n" +
                " <td>jck</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>Eve</td>\n" +
                " <td>Adam</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>John</td>\n" +
                " <td>wee</td> \n" +
                "  </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");

        CodeView codeView7 = rootView.findViewById(R.id.html_color_code);
        codeView7.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table, td, th {\n" +
                " border: 1px solid steelblue;\n" +
                "}\n" +
                "th {\n" +
                " background-color: #6DDAD6;\n" +
                " color: black;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table>\n" +
                " <tr>\n" +
                " <th>First Name</th>\n" +
                " <th>Last Name</th>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>jack</td>\n" +
                " <td>jck</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>Eve</td>\n" +
                " <td>Adam</td>\n" +
                "\n" +
                " </tr>\n" +
                " <tr>\n" +
                " <td>John</td>\n" +
                " <td>wee</td>\n" +
                "\n" +
                " </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");

        Button button = rootView.findViewById(R.id.try_now_button);
        button.setOnClickListener(v -> tryNow());

        TextView textView1 = rootView.findViewById(R.id.caption_desc);
        textView1.setText("To add a caption to a table, use the <caption> tag.");

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
