package com.example.questionbank.CseActivity


import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.questionbank.R


class Activity1stCse : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetJavaScriptEnabled")
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

