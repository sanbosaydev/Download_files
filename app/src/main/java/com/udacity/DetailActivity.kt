package com.udacity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {
    private lateinit var fileName: String
    private lateinit var status: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        button_ok.setOnClickListener {
            returnToMainActivity()
        }
        fileName = intent.getStringExtra("fileName").toString()
        status = intent.getStringExtra("status").toString()
        file_name.text = fileName
        file_status.apply {
            text = status
            setTextColor(if (status == "success") Color.GREEN else Color.RED)
        }
    }

    private fun returnToMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }

}
