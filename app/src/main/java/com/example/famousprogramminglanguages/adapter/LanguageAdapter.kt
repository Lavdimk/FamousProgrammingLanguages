package com.example.famousprogramminglanguages.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.famousprogramminglanguages.R
import com.example.famousprogramminglanguages.model.ProgrammingLanguages

class LanguageAdapter (private val context: Context, private val languages:List<ProgrammingLanguages>):BaseAdapter(){
    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int=languages.size


    override fun getItem(p0: Int): Any= languages[p0]


    override fun getItemId(p0: Int): Long=p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.second_screen_item,p2,false)
        val tvname=rowView.findViewById<TextView>(R.id.tvProgrammingName)
        val tvdate=rowView.findViewById<TextView>(R.id.tvdatepr)
         val tvpercent=rowView.findViewById<TextView>(R.id.tvpercent)
        val ivimg=rowView.findViewById<ImageView>(R.id.ivimg1)


        tvname.text=languages[p0].name
        tvdate.text=languages[p0].date
        tvpercent.text=languages[p0].percent
        ivimg.setImageResource(languages[p0].profilePicture)

        return rowView


    }

}