package com.example.caproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import org.w3c.dom.Text

class next : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        var name=intent.getStringExtra("name")
        Toast.makeText(this,"Hello "+name,Toast.LENGTH_SHORT).show();

        val tsgrp=findViewById<RadioGroup>(R.id.tsgrp);
        val tvS=findViewById<TextView>(R.id.tvS);
        val cb1=findViewById<CheckBox>(R.id.cb1)
        if (cb1.isVisible){
            cb1.visibility=View.GONE;
            tvS.visibility=View.GONE;
        }

        cb1.setOnClickListener(){
            if (cb1.isChecked){
                Toast.makeText(this,""+cb1.text+" marks assigned.",Toast.LENGTH_SHORT).show();
            }
        }

        val radioT=findViewById<RadioButton>(R.id.radioT);
        val radioS=findViewById<RadioButton>(R.id.radioS);

        radioT.setOnClickListener(){
            if (radioT.isChecked){
                Toast.makeText(this,""+radioT.text,Toast.LENGTH_SHORT).show();
                cb1.visibility=View.VISIBLE;
                tvS.visibility=View.GONE;
            }
        }
        radioS.setOnClickListener(){
            if (radioS.isChecked){
                Toast.makeText(this,""+radioS.text,Toast.LENGTH_SHORT).show();
                Toast.makeText(this,""+radioS.text+" cannot assign marks",Toast.LENGTH_SHORT).show();
                cb1.visibility=View.GONE;
                tvS.visibility=View.VISIBLE;
            }
        }

    }
}