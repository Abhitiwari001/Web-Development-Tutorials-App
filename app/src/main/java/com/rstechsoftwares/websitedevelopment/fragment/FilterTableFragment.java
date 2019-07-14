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

public class FilterTableFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_filter_table, container, false);
        CodeView codeView = rootView.findViewById(R.id.filtertablecode);
        codeView.setCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "#myInput {\n" +
                "background-image:\n" +
                "url('/img/search.png');\n" +
                "background-position: 5px 10px;\n" +
                "background-size:40px;\n" +
                "background-repeat: no-repeat;\n" +
                "width: 100%;\n" +
                "box-sizing: border-box;\n" +
                "font-size: 16px;\n" +
                "padding: 12px 20px 12px 40px;\n" +
                "border: 1px solid #ddd;\n" +
                "margin-bottom: 12px;\n" +
                "}\n" +
                "\n" +
                "#myTable {\n" +
                "border-collapse: collapse;\n" +
                "width: 100%;\n" +
                "border: 1px solid #ddd;\n" +
                "font-size: 18px;\n" +
                "}\n" +
                "\n" +
                "#myTable th, #myTable td {\n" +
                "text-align: left;\n" +
                "padding: 12px;\n" +
                "}\n" +
                "\n" +
                "#myTable tr {\n" +
                "border-bottom: 1px solid #ddd;\n" +
                "}\n" +
                "\n" +
                "#myTable tr.header, #myTable tr:hover{\n" +
                "background-color: #f1f1f1;\n" +
                "}\n" +
                "\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>NATIONAL ANIMALS</h2>\n" +
                "<input type=\"text\" id=\"myInput\"\n" +
                "onkeyup=\"myFunction()\" placeholder=\n" +
                "\"Search by Country....\"\n" +
                "title=\"Type in a name\">\n" +
                "<table id=\"myTable\">\n" +
                "<tr class=\"header\">\n" +
                "<th style=\"width:60%;\">Country</th>\n" +
                "<th style=\"width:40%;\">National Animals</th>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>India</td>\n" +
                "<td>Bengal Tiger</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Nepal</td>\n" +
                "<td>Cow</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Peru</td>\n" +
                "<td>Vicuña</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Philippines</td>\n" +
                "<td>Carabao</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td> Romania</td>\n" +
                "<td>Lynx</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Rwanda</td>\n" +
                "<td>Leopard</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Spain</td>\n" +
                "\n" +
                "<td>Bull</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Thailand</td>\n" +
                "<td>Elephant</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Turkey</td>\n" +
                "<td>Greywolf</td>\n" +
                "</tr>\n" +
                "</table>\n" +
                "<script>\n" +
                "function myFunction() {\n" +
                "var input, filter, table, tr, td, i;\n" +
                "input=document.getElementById(\"myInput\");\n" +
                "filter=input.value.toUpperCase();\n" +
                "table=document.getElementById(\"myTable\");\n" +
                "tr=table.getElementsByTagName(\"tr\");\n" +
                "for (i = 0; i < tr.length; i++) {\n" +
                "td = tr[i].getElementsByTagName(\"td\")[0];\n" +
                "if (td) {\n" +
                "if (td.innerHTML.toUpperCase()\n" +
                ".indexOf(filter) > -1) {\n" +
                "tr[i].style.display = \"\";\n" +
                "} else {\n" +
                "tr[i].style.display = \"none\";\n" +
                "}\n" +
                "}\n" +
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
