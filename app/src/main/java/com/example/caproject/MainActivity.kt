package com.example.caproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aans1=findViewById<Button>(R.id.ans1);
        val aans2 = findViewById<Button>(R.id.ans2);

        aans1.setOnClickListener(){
            var intent = Intent(this, ans1::class.java)
            startActivity(intent)
        }

        aans2.setOnClickListener(){
            var intent = Intent(this, ans2::class.java)
            startActivity(intent)
        }
    }
}