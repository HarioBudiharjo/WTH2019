package com.hariobudiharjo.wth2019.fragment

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

import com.hariobudiharjo.wth2019.R
import com.hariobudiharjo.wth2019.activity.DetailAsuransiActivity

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_home, container, false)

        v.findViewById<LinearLayout>(R.id.ll_pertama).setOnClickListener {
            goToDetail()
        }
        v.findViewById<LinearLayout>(R.id.ll_kedua).setOnClickListener {
            goToDetail()
        }
        v.findViewById<LinearLayout>(R.id.ll_ketiga).setOnClickListener {
            goToDetail()
        }
        v.findViewById<LinearLayout>(R.id.ll_empat).setOnClickListener {
            goToDetail()
        }

        return v
    }

    fun goToDetail(){
        val intent = Intent(context,DetailAsuransiActivity::class.java)
        startActivity(intent)
    }

}
