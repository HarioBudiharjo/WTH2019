package com.hariobudiharjo.wth2019.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.hariobudiharjo.wth2019.R
import com.hariobudiharjo.wth2019.adapter.HistoryAdapter
import com.hariobudiharjo.wth2019.model.testModel

class ListActivity : AppCompatActivity() {

    var tests = ArrayList<testModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        tests.add(
            testModel(
                "Salad",
                "Salad saat musim kemarau",
                "https://api.my.id/static/bakso.jpg",
                "Oj7WWQz2rNA",
                "tests",
                "kemarau",
                "lotlang"
            )
        )
        tests.add(
            testModel(
                "Yogurt",
                "Yogurt saat musim hujan",
                "https://api.my.id/static/bakso.jpg",
                "cfNlfCaykYw",
                "tests",
                "kemarau",
                "lotlang"
            )
        )
        tests.add(
            testModel(
                "Oatmeal",
                "Oatmeal cocok saat musim hujan",
                "https://api.my.id/static/bakso.jpg",
                "635w3CU-EFE",
                "tests",
                "kemarau",
                "lotlang"
            )
        )
        tests.add(
            testModel(
                "Sayur Sup",
                "Sayur sup cocok saat musim hujan",
                "https://api.my.id/static/bakso.jpg",
                "V8YCccbFa0M",
                "tests",
                "kemarau",
                "lotlang"
            )
        )

        val _recyclerView: RecyclerView = findViewById(R.id.rv_news)
        _recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val adapter = HistoryAdapter(this, tests)
        _recyclerView.adapter = adapter
    }
}
