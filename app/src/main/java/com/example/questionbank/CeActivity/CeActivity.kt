package com.example.questionbank.CeActivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.questionbank.R

class CeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me)

        val button1st = findViewById<Button>(R.id.btn1me)
        button1st.setOnClickListener {
            intent = Intent(this, Activity1stCe::class.java)
            startActivity(intent)

        }
        val button2nd = findViewById<Button>(R.id.btn2me)
        button2nd.setOnClickListener {
            intent = Intent(this, Activity2ndCe::class.java)
            startActivity(intent)
        }
        val button3rd = findViewById<Button>(R.id.btn3me)
        button3rd.setOnClickListener {
            intent = Intent(this, Activity3rdCe::class.java)
            startActivity(intent)
        }
        val button4th = findViewById<Button>(R.id.btn4me)
        button4th.setOnClickListener {
            intent = Intent(this, Activity4thCe::class.java)
            startActivity(intent)
        }
        val button5th = findViewById<Button>(R.id.btn5me)
        button5th.setOnClickListener {
            intent = Intent(this, Activity5thCe::class.java)
            startActivity(intent)
        }
        val button6th = findViewById<Button>(R.id.btn6me)
        button6th.setOnClickListener {
            intent = Intent(this, Activity5thCe::class.java)
            startActivity(intent)
        }
        val button7th = findViewById<Button>(R.id.btn7me)
        button7th.setOnClickListener {
            intent = Intent(this, Activity5thCe::class.java)
            startActivity(intent)
        }
        val button8th = findViewById<Button>(R.id.btn8me)
        button8th.setOnClickListener {
            intent = Intent(this, Activity5thCe::class.java)
            startActivity(intent)
        }
    }
}