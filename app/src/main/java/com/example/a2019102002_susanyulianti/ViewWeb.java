package com.example.a2019102002_susanyulianti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ViewWeb extends AppCompatActivity {

    private WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_web);

        view = (WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.loadUrl("https://www.w3schools.com/");
    }

    public class MyBrowser extends WebViewClient {
        public boolean shouldOvverideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}