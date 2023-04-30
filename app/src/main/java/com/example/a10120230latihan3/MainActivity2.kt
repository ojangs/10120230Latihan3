package com.example.a10120230latihan3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnMasuk = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.masuk)
        btnMasuk.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}
//<!--NAMA : MUHAMMAD HILMAN RAHMAT-->
//<!--NIM  : 10120230-->
//<!--KELAS: IF6-->
//<!--TANGGAL PENGERJAAN : 29 APRIL 2023-->