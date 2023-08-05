package com.example.questionbank.CeActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.questionbank.R

class Activity3rdCe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val webView = findViewById<WebView>(R.id.wv1)
        webView.settings.setSupportZoom(true)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://docs.google.com/document/d/1AttYhka-JUsfRud37g4Nc35Ouf3wL1jmkhU_cn_xVqg/edit?usp=sharing" + "https://pdfurl.com/file.pdf")

    }
}