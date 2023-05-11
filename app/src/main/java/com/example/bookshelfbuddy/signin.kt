package com.example.bookshelfbuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class signin : AppCompatActivity() {
    lateinit var edt_email1:EditText
    lateinit var edt_pass1:EditText
    lateinit var signup:Button
    lateinit var edt_tv1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)

        edt_email1=findViewById(R.id.email1)
        edt_pass1=findViewById(R.id.pass1)
        signup=findViewById(R.id.signin)
        edt_tv1=findViewById(R.id.tv1)

        edt_tv1.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}