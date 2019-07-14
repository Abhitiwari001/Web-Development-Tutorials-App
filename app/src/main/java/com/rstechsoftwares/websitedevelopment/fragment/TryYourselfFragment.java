package com.rstechsoftwares.websitedevelopment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rstechsoftwares.websitedevelopment.R;

public class TryYourselfFragment extends Fragment {

    private EditText inputEdittext;
    private WebView outputWebview;
    private Button generateOutputButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_try_yourself, container, false);

        inputEdittext = rootView.findViewById(R.id.edittext_input);
        outputWebview = rootView.findViewById(R.id.web_view_output);
        generateOutputButton = rootView.findViewById(R.id.button_get_output);
        generateOutputButton.setOnClickListener(v -> generateOutput());

        return rootView;

    }

    private void generateOutput() {

        String data = inputEdittext.getText().toString();
        outputWebview.getSettings().setJavaScriptEnabled(true);
        outputWebview.loadDataWithBaseURL("", data, "text/html", "UTF-8", "");

    }
}
