package com.hariobudiharjo.wth2019.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hariobudiharjo.wth2019.R
import kotlinx.android.synthetic.main.activity_detail_pembelian.*

class DetailPembelianActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pembelian)

        button_bayar.setOnClickListener {
            goToDetail()
        }

    }


    fun goToDetail(){
        val intent = Intent(this,KonfirmasiPembelianActivity::class.java)
        startActivity(intent)
    }
}
