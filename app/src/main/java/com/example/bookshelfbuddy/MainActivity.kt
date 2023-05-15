package com.example.bookshelfbuddy


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edt_email2:EditText
    lateinit var edt_pass2:EditText
    lateinit var login:Button
    lateinit var edt_tv2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_email2=findViewById(R.id.email2)
        edt_pass2=findViewById(R.id.pass2)
        login=findViewById(R.id.login)
        edt_tv2=findViewById(R.id.tv2)

        edt_tv2.setOnClickListener {
            val intent=Intent(this, signin::class.java)
            startActivity(intent)
        }
        login.setOnClickListener {
            val intent=Intent(this, search::class.java)
            startActivity(intent)
        }
    }
}