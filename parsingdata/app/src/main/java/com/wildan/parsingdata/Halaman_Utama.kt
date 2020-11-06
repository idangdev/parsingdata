package com.wildan.parsingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman__utama.*

class Halaman_Utama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman__utama)

        val getData = intent.getParcelableExtra<Formulir>("Gerbang03")
        utama.text = "${getData.nama}\n" + "${getData.alamat}\n" +"${getData.ttl}\n" + "${getData.jenis}\n" + "${getData.no}\n" + "${getData.motto}\n" + "${getData.pengalaman}\n" + "${getData.penyakit}\n"+ "${getData.alasan}\n"

    }
}