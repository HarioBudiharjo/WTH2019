package com.hariobudiharjo.wth2019.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hariobudiharjo.wth2019.R
import kotlinx.android.synthetic.main.activity_konfirmasi_pembelian.*

class KonfirmasiPembelianActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi_pembelian)

        button_masukkan.setOnClickListener {
            goToDetail()
        }
    }


    fun goToDetail(){
        val intent = Intent(this,SucsessActivity::class.java)
        startActivity(intent)
    }
}
