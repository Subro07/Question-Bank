package com.example.questionbank.EceActivity


import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.questionbank.R


class Activity1stEce : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val webView = findViewById<WebView>(R.id.wv1)
        webView.settings.setSupportZoom(true)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://www.google.com/" + "https://pdfurl.com/file.pdf")
    }
}

