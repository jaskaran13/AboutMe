package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonvisibilty = findViewById<Button>(R.id.done_button)
        buttonvisibilty.setOnClickListener {
            buttonvisibilty.visibility = View.GONE
            addnickname(it)

        }
    }

    private fun addnickname(view: View) {
        var editText = findViewById<EditText>(R.id.nicname_edit)
        var nicknametext: TextView = findViewById(R.id.nickname_text)

        nicknametext.text = editText.text
        editText.visibility = View.GONE
        nicknametext.visibility = View.VISIBLE
    }
}
