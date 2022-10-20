package com.example.findage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_age:Button=findViewById(R.id.bt_age)
        val ed_age:EditText=findViewById(R.id.ed_age)
        val tx_age:TextView=findViewById(R.id.tx_age)
  bt_age.setOnClickListener {
      val  YOB = Integer.parseInt(ed_age.text.toString())
      val currentYear = Calendar.getInstance().get(Calendar.YEAR)
      val userAgeInYear = currentYear - YOB
      tx_age.text = "Your Age IS $userAgeInYear Year"
  }

    }
}