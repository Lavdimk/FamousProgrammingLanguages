package com.example.famousprogramminglanguages.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.famousprogramminglanguages.R
import com.example.famousprogramminglanguages.adapter.LanguageAdapter
import com.example.famousprogramminglanguages.databinding.ActivityMainBinding
import com.example.famousprogramminglanguages.databinding.ActivitySecondBinding
import com.example.famousprogramminglanguages.model.ProgrammingLanguages

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val languages = listOf(
            ProgrammingLanguages(R.drawable.kotlin, "Kotlin", "23.12.2002", "99%"),
            ProgrammingLanguages(R.drawable.java, "Java", "01.07.1994", "33%"),
            ProgrammingLanguages(R.drawable.csharp, "C#", "18.09.1928", "75%"),
            ProgrammingLanguages(R.drawable.js, "JavaScript", "21.12.2002", "90%"),
            ProgrammingLanguages(R.drawable.typescript, "TypeScript", "09.11.2016", "63%"),
            ProgrammingLanguages(R.drawable.python, "Python", "13.04.2006", "44%"),
            ProgrammingLanguages(R.drawable.swift, "Swift", "26.08.2012", "79%"),
            ProgrammingLanguages(R.drawable.sql, "SQL", "31.02.2001", "71%"),
            ProgrammingLanguages(R.drawable.assembly, "Assembly", "12.01.1912", "49%"),
            ProgrammingLanguages(R.drawable.ruby, "Ruby", "04.10.2013", "63%"),
            ProgrammingLanguages(R.drawable.php, "PHP", "29.11.1443", "60%")
        )

        val languageAdapter = LanguageAdapter(this, languages)
        binding.lvList.adapter = languageAdapter

        binding.lvList.setOnItemClickListener{  adapterView, view, position, l ->
            Toast.makeText(this,"Kjo gjuhe quhet : ${languages[position].name} dhe daton prej dates : ${languages[position].date}",Toast.LENGTH_LONG).show()}

    }
}