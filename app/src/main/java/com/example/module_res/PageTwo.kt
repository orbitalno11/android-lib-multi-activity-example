package com.example.module_res

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_two.*

class PageTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_two)

        buttonActivity1.setOnClickListener {
            startActivity(Intent(this, PageOne::class.java))
        }

        buttonActivity3.setOnClickListener {
            startActivity(Intent(this, PageThree::class.java))
        }
    }
}