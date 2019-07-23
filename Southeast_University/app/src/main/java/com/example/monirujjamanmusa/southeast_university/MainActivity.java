package com.example.monirujjamanmusa.southeast_university;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.webViewId);
        webView.loadUrl("http://ums.seu.edu.bd/");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        }


    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        { webView.goBack();
        }
        else {

       super.onBackPressed();
        }

    }
}
