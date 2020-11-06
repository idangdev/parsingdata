package com.wildan.parsingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.wildan.parsingdata.databinding.ActivityMainBinding
import kotlinx.android.parcel.Parcelize

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDaftar.setOnClickListener{
            if (binding.txt1.text.toString() == null || binding.txt2.text.toString() == null ||
                binding.txt3.text.toString() == null || binding.txt4.text.toString() == null ||
                binding.txt5.text.toString() == null || binding.txt6.text.toString() == null ||
                binding.txt70.text.toString() == null || binding.txt8.text.toString() == null ||
                binding.txt9.text.toString() == null ||
                binding.txt1.text.toString().trim() == "" || binding.txt2.text.toString().trim() == "" ||
                binding.txt3.text.toString().trim() == "" || binding.txt4.text.toString().trim() == "" ||
                binding.txt5.text.toString().trim() == "" || binding.txt6.text.toString().trim() == "" ||
                binding.txt70.text.toString().trim() == "" ){

                Toast.makeText(this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()
    }else{
                val formulir = Formulir(nama=binding.txt1.text.toString(), alamat= binding.txt2.text.toString(), ttl=binding.txt3.text.toString(), jenis=binding.txt4.text.toString()
                    ,no = binding.txt5.text.toString(), motto = binding.txt6.text.toString(), pengalaman = binding.txt70.text.toString(), penyakit = binding.txt8.text.toString(), alasan = binding.txt9.text.toString())
                startActivity<Halaman_Utama>("Gerbang03" to formulir)
            }
        }
}
}
@Parcelize
data class Formulir(
    val nama:String,
    val alamat: String,
    val ttl: String,
    val jenis: String,
    val no: String,
    val motto: String,
    val pengalaman: String,
    val penyakit: String,
    val alasan: String
): Parcelable