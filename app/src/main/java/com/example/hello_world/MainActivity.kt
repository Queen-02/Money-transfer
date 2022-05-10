package com.example.hello_world

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI : Button
    lateinit var money: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBMI = findViewById(R.id.btnBMI)
        money = findViewById(R.id.btnMoney)

        btnBMI.setOnClickListener {
            val intent = Intent(this, BMI_Calcualtor::class.java)
            startActivity(intent)
        }

        money.setOnClickListener {
            val intent = Intent(this, MoneyTransfer::class.java)
            startActivity(intent)
        }
    }
}