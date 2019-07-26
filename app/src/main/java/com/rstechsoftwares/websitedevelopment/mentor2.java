package com.rstechsoftwares.websitedevelopment;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class mentor2 extends AppCompatActivity {
    private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor2);
        wv=findViewById(R.id.webview);
        WebSettings webSettings=wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("https://docs.google.com/forms/d/16AgiF80sshzQ-30yhoOqXTlR5-hauONoPlBro-qSgFs/edit?usp=sharing");
        wv.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(wv.canGoBack()){
            wv.goBack();
        }else {
            super.onBackPressed();
        }


    }



    }

