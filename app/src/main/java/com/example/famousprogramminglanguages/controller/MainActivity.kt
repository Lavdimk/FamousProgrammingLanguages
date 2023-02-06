package com.example.famousprogramminglanguages.controller

import android.app.ListActivity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.famousprogramminglanguages.R
import com.example.famousprogramminglanguages.databinding.ActivityMainBinding
import com.example.famousprogramminglanguages.model.User

class   MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userList = listOf(
            User("Albin", "123456"),
            User("Leonit", "15596"),
            User("Lavdim", "Krasniqi"),
            User("Mirand", "Rrudhani"),
            User("Shqipdon", "Mehmeti"),
            User("Ali", "Zekaj"),
            User("Arbnor", "Hoti"),
            User("John", "Smith"),
            User("Vanilla", "Smith"),
            User("Arben", "Vllasaliu")
        )
        val userName: TextView = findViewById(R.id.etUsername)
        val password: TextView = findViewById(R.id.etPassword)
        val loginbutton: Button = findViewById(R.id.btnLOGIN)
        val forgotButton: Button = findViewById(R.id.btnForgotPassword)
        var found:Boolean = false;

        loginbutton.setOnClickListener {
            for (list in userList) {
                if (list.password == password.text.toString() && list.username == userName.text.toString()) {

                        val intent=Intent(this@MainActivity, SecondActivity::class.java)
                        startActivity(intent)
                    found = true;
                }
            }
            if (found == false) {
                Toast.makeText(this, "Gabim Username/Passwords", Toast.LENGTH_SHORT).show();
            }
        }


        forgotButton.setOnClickListener {
            var found2 = false;
            for (list in userList) {
                if (list.password != password.text.toString() && list.username == userName.text.toString()) {
                    Toast.makeText(
                        this,
                        "Passwordi eshte gabim,Passwordi juaj eshte ${list.password}",
                        Toast.LENGTH_SHORT
                    ).show();
                    found2 = true;
                }
            }
            if (found2==false) {
                Toast.makeText(this, "Nuk ekziston useri me keto te dhena", Toast.LENGTH_SHORT)
                    .show();
            }
        }




        }




    }
