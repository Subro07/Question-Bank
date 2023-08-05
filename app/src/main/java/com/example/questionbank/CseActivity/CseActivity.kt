package com.example.questionbank.CseActivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.questionbank.R

class CseActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cse)

        val button1st = findViewById<Button>(R.id.button1st)
        button1st.setOnClickListener {
            intent = Intent(this, Activity1stCse::class.java)
            startActivity(intent)

        }
        val button2nd = findViewById<Button>(R.id.button2nd)
        button2nd.setOnClickListener {
            intent = Intent(this, Activity2ndCse::class.java)
            startActivity(intent)
        }
        val button3rd = findViewById<Button>(R.id.button3rd)
        button3rd.setOnClickListener {
            intent = Intent(this, Activity3rdCse::class.java)
            startActivity(intent)
        }
        val button4th = findViewById<Button>(R.id.button4th)
        button4th.setOnClickListener{

            intent = Intent(this,Activity4thCse::class.java)
            startActivity(intent)
        }
        val button5th = findViewById<Button>(R.id.button5th)
        button5th.setOnClickListener {
            intent = Intent(this, Activity5thCse::class.java)
            startActivity(intent)
        }
        val button6th = findViewById<Button>(R.id.button6th)
        button6th.setOnClickListener {
            intent = Intent(this, Activity5thCse::class.java)
            startActivity(intent)
        }
        val button7th = findViewById<Button>(R.id.button7th)
        button7th.setOnClickListener {
            intent = Intent(this, Activity5thCse::class.java)
            startActivity(intent)
        }
        val button8th = findViewById<Button>(R.id.button8th)
        button8th.setOnClickListener {
            intent = Intent(this, Activity5thCse::class.java)
            startActivity(intent)
        }
    }
}