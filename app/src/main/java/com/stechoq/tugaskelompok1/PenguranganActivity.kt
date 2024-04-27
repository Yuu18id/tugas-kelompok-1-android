package com.stechoq.tugaskelompok1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText

class PenguranganActivity : AppCompatActivity() {

    private lateinit var angka1: AppCompatEditText
    private lateinit var angka2: AppCompatEditText
    private lateinit var tombolkurang: Button
    private lateinit var hasil: TextView

    private fun initComponents() {
        angka1 = findViewById(R.id.kurangeditTextNum1)
        angka2 = findViewById(R.id.kurangeditTextNum2)
        tombolkurang = findViewById(R.id.kurangbuttonResult)
        hasil = findViewById(R.id.kurangtextResult)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengurangan)
        initComponents()

        tombolkurang.setOnClickListener {
            val angka1Value = angka1.text.toString().toDouble()
            val angka2Value = angka2.text.toString().toDouble()
            val hasilValue = angka1Value - angka2Value
            hasil.text = hasilValue.toString()
        }
    }
}