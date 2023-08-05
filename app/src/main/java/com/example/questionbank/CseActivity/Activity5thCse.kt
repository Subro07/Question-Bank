package com.example.questionbank.CseActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.questionbank.R

class Activity5thCse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val webView = findViewById<WebView>(R.id.wv1)

        webView.webViewClient = WebViewClient()
        webView.getSettings().setSupportZoom(true)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.loadUrl("https://docs.google.com/document/d/1AttYhka-JUsfRud37g4Nc35Ouf3wL1jmkhU_cn_xVqg/edit?usp=sharing" + "https://pdfurl.com/file.pdf")

    }
}