package com.example.a10120230latihan3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val textDone = findViewById<TextView>(R.id.textDone)
        val panggilan = intent.getStringExtra("PANGGILAN_KAMU")
        val messageDone = "Beres! Sekarang $panggilan udah bisa ngecek penggunaan HP mu tiap hari buat bantu $panggilan ngatur waktu "

        textDone.text = messageDone

    }
}
//<!--NAMA : MUHAMMAD HILMAN RAHMAT-->
//<!--NIM  : 10120230-->
//<!--KELAS: IF6-->
//<!--TANGGAL PENGERJAAN : 29 APRIL 2023-->