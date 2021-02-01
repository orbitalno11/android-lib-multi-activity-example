package com.example.module_res

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_three.*

class PageThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_three)

        buttonActivity1.setOnClickListener {
            startActivity(Intent(this, PageOne::class.java))
        }

        buttonActivity2.setOnClickListener {
            startActivity(Intent(this, PageTwo::class.java))
        }
    }
}