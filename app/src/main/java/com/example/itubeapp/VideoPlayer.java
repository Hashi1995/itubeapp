package com.example.itubeapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class VideoPlayer extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_player);

        webView = findViewById(R.id.webView);

        String videoUrl = getIntent().getStringExtra("video_url");
        String embedUrl = "";

        if (videoUrl != null && videoUrl.contains("v=")) {
            String videoId = videoUrl.split("v=")[1].split("&")[0];
            embedUrl = "https://www.youtube.com/embed/" + videoId;
        } else {
            embedUrl = "https://www.youtube.com/embed/dQw4w9WgXcQ";
        }

        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl(embedUrl);
    }
}
