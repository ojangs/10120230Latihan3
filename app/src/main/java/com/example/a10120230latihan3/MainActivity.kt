package com.example.a10120230latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMulai = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.mulai)
        btnMulai.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
        }
    }
}
//<!--NAMA : MUHAMMAD HILMAN RAHMAT-->
//<!--NIM  : 10120230-->
//<!--KELAS: IF6-->
//<!--TANGGAL PENGERJAAN : 29 APRIL 2023-->