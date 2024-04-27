package com.stechoq.tugaskelompok1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText

class PerkalianActivity : AppCompatActivity() {

    private lateinit var angka1: AppCompatEditText
    private lateinit var angka2: AppCompatEditText
    private lateinit var tombolPerkalian: Button
    private lateinit var hasil: TextView

    private fun initComponents() {
        angka1 = findViewById(R.id.editTextNum1)
        angka2 = findViewById(R.id.editTextNum2)
        tombolPerkalian = findViewById(R.id.buttonResult)
        hasil = findViewById(R.id.textResult)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perkalian)
        initComponents()

        tombolPerkalian.setOnClickListener {
            val perkalian = angka1.text.toString().toDouble() * angka2.text.toString().toDouble()
            hasil.text = perkalian.toString()

        }
    }
}