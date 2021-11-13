package com.example.caproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ans2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ans2)

        val btNext=findViewById<Button>(R.id.next_button)
        val etName=findViewById<EditText>(R.id.etName)

        btNext.setOnClickListener{
            val intent = Intent(this, next::class.java)
            intent.putExtra("name", etName.text.toString())
            startActivity(intent)
        }

    }
}