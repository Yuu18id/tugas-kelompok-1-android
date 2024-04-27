package com.stechoq.tugaskelompok1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText

class PembagianActivity : AppCompatActivity() {

    private lateinit var angka1: AppCompatEditText
    private lateinit var angka2: AppCompatEditText
    private lateinit var tombolBagi: Button
    private lateinit var hasil: TextView

    private fun initComponents() {
        angka1 = findViewById(R.id.bagiEditTextNum1)
        angka2 = findViewById(R.id.bagiEditTextNum2)
        tombolBagi = findViewById(R.id.bagiButtonResult)
        hasil = findViewById(R.id.bagiTextResult)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembagian)

        initComponents()

        tombolBagi.setOnClickListener {
            if (angka2.text.toString()!="0") {
                val pembagian = angka1.text.toString().toDouble() / angka2.text.toString().toDouble()
                hasil.text = pembagian.toString()
            } else {
                hasil.text = "Tidak bisa dibagi 0"
            }

        }
    }
}