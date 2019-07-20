package com.hariobudiharjo.wth2019.activity

import android.app.ProgressDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hariobudiharjo.wth2019.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

//    tools:listitem="@layout/rv_list_daily_item_row"

    lateinit var progress: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        progress = ProgressDialog(this)
        progress.setTitle("Loading")
        progress.setMessage("Wait while loading...")
        progress.setCancelable(false)

        btn_login.setOnClickListener {
            progress.show()
            login(edtEmail?.text.toString(), edtPassword?.text.toString())
        }
    }

    fun login(email: String, password: String) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)

    }
}
