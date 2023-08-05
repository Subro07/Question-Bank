package com.example.questionbank.CeActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.questionbank.R

class Activity4thCe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val webView = findViewById<WebView>(R.id.wv1)
        webView.settings.setSupportZoom(true)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://stackoverflow.com/questions/44337730/activity-with-webview-crashing-android-studio" + "https://pdfurl.com/file.pdf")

    }
}