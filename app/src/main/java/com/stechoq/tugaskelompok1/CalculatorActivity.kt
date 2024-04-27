package com.stechoq.tugaskelompok1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val buttonToPenjumlahan: Button = findViewById(R.id.buttonNavigateToPenjumlahan)
        val buttonToPengurangan: Button = findViewById(R.id.buttonNavigateToPengurangan)
        val buttonToPerkalian: Button = findViewById(R.id.buttonNavigateToPerkalian)
        val buttonToPembagian: Button = findViewById(R.id.buttonNavigateToPembagian)

        buttonToPenjumlahan.setOnClickListener(View.OnClickListener {
            val toPenjumlahanActivity = Intent(this, PenjumlahanActivity::class.java)
            startActivity(toPenjumlahanActivity)
        })

        buttonToPengurangan.setOnClickListener(View.OnClickListener {
            val toPenguranganActivity = Intent(this, PenguranganActivity::class.java)
            startActivity(toPenguranganActivity)
        })

        buttonToPerkalian.setOnClickListener(View.OnClickListener {
            val toPerkalianActivity = Intent(this, PerkalianActivity::class.java)
            startActivity(toPerkalianActivity)
        })

        buttonToPembagian.setOnClickListener(View.OnClickListener {
            val toPembagianActivity = Intent(this, PembagianActivity::class.java)
            startActivity(toPembagianActivity)
        })
    }
}