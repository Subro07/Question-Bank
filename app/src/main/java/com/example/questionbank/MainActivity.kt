package com.example.questionbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.questionbank.CeActivity.CeActivity
import com.example.questionbank.CseActivity.CseActivity
import com.example.questionbank.EceActivity.EceActivity
import com.example.questionbank.EeActivity.EeActivity
import com.example.questionbank.MeActivity.MeActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val buttonCSE = findViewById<Button>(R.id.button1)
        buttonCSE.setOnClickListener{
            intent = Intent(this, CseActivity::class.java)
            startActivity(intent)
        }
        val buttonECE = findViewById<Button>(R.id.button2)
        buttonECE.setOnClickListener{
            intent = Intent(this, EceActivity::class.java)
            startActivity(intent)
        }
        val buttonCE = findViewById<Button>(R.id.button3)
        buttonCE.setOnClickListener{
            intent = Intent(this, CeActivity::class.java)
            startActivity(intent)
        }
        val buttonEE = findViewById<Button>(R.id.button4)
        buttonEE.setOnClickListener{
            intent = Intent(this, EeActivity::class.java)
            startActivity(intent)
        }
        val buttonME = findViewById<Button>(R.id.button5)
        buttonME.setOnClickListener{
            intent = Intent(this, MeActivity::class.java)
            startActivity(intent)
        }
    }
}