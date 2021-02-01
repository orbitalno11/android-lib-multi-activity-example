package com.example.module_res

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_one.*

class PageOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_one)

        buttonActivity2.setOnClickListener {
            startActivity(Intent(this, PageTwo::class.java))
        }

        buttonActivity3.setOnClickListener {
            startActivity(Intent(this, PageThree::class.java))
        }
    }
}