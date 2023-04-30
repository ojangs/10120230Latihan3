package com.example.a10120230latihan3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val namaPgl = findViewById<EditText>(R.id.nama_kamu)
        val btnNext = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.next)
        btnNext.setOnClickListener {
            val panggilan = namaPgl.text.toString()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("PANGGILAN_KAMU",panggilan)
            startActivity(intent)
        }
    }
}
//<!--NAMA : MUHAMMAD HILMAN RAHMAT-->
//<!--NIM  : 10120230-->
//<!--KELAS: IF6-->
//<!--TANGGAL PENGERJAAN : 29 APRIL 2023-->