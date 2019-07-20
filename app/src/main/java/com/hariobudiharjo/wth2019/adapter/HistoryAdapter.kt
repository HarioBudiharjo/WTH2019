package com.hariobudiharjo.wth2019.adapter

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hariobudiharjo.wth2019.R
import com.hariobudiharjo.wth2019.activity.LoginActivity
import com.hariobudiharjo.wth2019.model.testModel

class HistoryAdapter(private val context: Context, private val items: List<testModel>) :
    RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {
    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        fun bindItems(data: testModel) {

            val title: TextView = itemView.findViewById(R.id.title)

            title.text = data.judul


//            image.setImageResource(data.imageint!!)

            itemView.setOnClickListener {
                val intent = Intent(it.context, LoginActivity::class.java)
                intent.putExtra("judul", data.judul)
                startActivity(it.context, intent, null)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryAdapter.ViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.rv_list_contoh, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: HistoryAdapter.ViewHolder, position: Int) {
        holder.bindItems(items[position])
    }
}