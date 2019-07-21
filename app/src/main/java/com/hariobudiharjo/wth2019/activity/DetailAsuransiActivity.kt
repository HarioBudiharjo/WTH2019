package com.hariobudiharjo.wth2019.activity

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hariobudiharjo.wth2019.R
import kotlinx.android.synthetic.main.activity_detail_asuransi.*

class DetailAsuransiActivity : AppCompatActivity() {

    var mana = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_asuransi)

        cv_satu.setOnClickListener {
            change(true)
        }

        cv_dua.setOnClickListener {
            change(false)
        }

        btn_dapatkan_perlindungan.setOnClickListener {
            goToDetail()
        }
    }

    fun goToDetail() {
        val intent = Intent(this, DetailDataActivity::class.java)
        startActivity(intent)
    }

    fun change(mana: Boolean) {
        if(mana){
            cv_satu.setCardBackgroundColor(resources.getColor(R.color.colorPrimary))
            cv_dua.setCardBackgroundColor(Color.WHITE)
        }else{
            cv_satu.setCardBackgroundColor(Color.WHITE)
            cv_dua.setCardBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
    }
}
