package com.example.module_res

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_one.*

class ActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        buttonActivity2.setOnClickListener {
            startActivity(Intent(this, ActivityTwo::class.java))
        }

        buttonActivity3.setOnClickListener {
            startActivity(Intent(this, ActivityThree::class.java))
        }
    }
}