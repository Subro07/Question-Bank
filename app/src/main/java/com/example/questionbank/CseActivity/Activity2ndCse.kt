package com.example.questionbank.CseActivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.questionbank.R

class Activity2ndCse : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val webView = findViewById<WebView>(R.id.wv1)

        webView.webViewClient = WebViewClient()
        webView.getSettings().setSupportZoom(true)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.loadUrl("https://docs.google.com/document/d/1-o6LOd_8b3WfgeK_lxfzpuE_zjVvTBZ_9euaTzWkmR0/edit?usp=sharing" + "https://pdfurl.com/file.pdf")

    }
}