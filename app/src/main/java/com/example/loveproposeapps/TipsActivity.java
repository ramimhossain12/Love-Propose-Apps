package com.example.loveproposeapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TipsActivity extends AppCompatActivity {


    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        webView= findViewById(R.id.webviewID);


        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://thoughtcatalog.com/lorenzo-jensen-iii/2015/04/50-timeless-pieces-of-advice-about-love-relationships/");




    }

    @Override
    public void onBackPressed() {


        if (webView.canGoBack()){
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }
}