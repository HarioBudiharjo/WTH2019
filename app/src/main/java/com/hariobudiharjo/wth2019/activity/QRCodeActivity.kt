package com.hariobudiharjo.wth2019.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hariobudiharjo.wth2019.R
import android.graphics.Bitmap
import android.widget.EditText
import android.os.Environment
import android.widget.Button
import android.widget.ImageView


class QRCodeActivity : AppCompatActivity() {
    var TAG = "GenerateQRCode"
    var edtValue: EditText? = null
    var qrImage: ImageView? = null
    var start: Button? = null
    var save:Button? = null
    var inputValue: String? = null
    var savePath = Environment.getExternalStorageDirectory().path + "/QRCode/"
    var bitmap: Bitmap? = null
//    var qrgEncoder: QRGEncoder? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode)

        qrImage =  findViewById(R.id.QR_Image);
        edtValue =  findViewById(R.id.edt_value);
        start =  findViewById(R.id.start);
        save =  findViewById(R.id.save);
    }
}
