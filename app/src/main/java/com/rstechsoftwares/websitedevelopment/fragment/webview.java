package com.rstechsoftwares.websitedevelopment.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.rstechsoftwares.websitedevelopment.R;

public class webview extends AppCompatActivity {
WebView W;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    W=findViewById(R.id.w);
    W.loadUrl("https://docs.google.com/forms/d/16AgiF80sshzQ-30yhoOqXTlR5-hauONoPlBro-qSgFs/edit?usp=sharing");
    }


}
