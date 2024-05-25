package com.example.netclanexplore

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat

import android.widget.TextView

class Refine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refine)

        var btnBack= findViewById<ImageView>(R.id.btnBack) as ImageView

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        btnBack.setOnClickListener {
            onBackPressed()
        }

        var textView12 = findViewById(R.id.textView12) as TextView
        var textView13 = findViewById(R.id.textView13) as TextView
        var textView14 = findViewById(R.id.textView14) as TextView
        var textView15 = findViewById(R.id.textView15) as TextView
        var textView16 = findViewById(R.id.textView16) as TextView
        var textView17 = findViewById(R.id.textView17) as TextView
        var textView18 = findViewById(R.id.textView18) as TextView
        var textView19 = findViewById(R.id.textView19) as TextView
        var textView20 = findViewById(R.id.textView20) as TextView
        var array: ArrayList<View> = ArrayList()
        array.add(textView12)
        array.add(textView13)
        array.add(textView14)
        array.add(textView15)
        array.add(textView16)
        array.add(textView17)
        array.add(textView18)
        array.add(textView19)



        for (x in array) {
            changeColor(x)
        }

        textView20.setOnClickListener {
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", "Hello from ActivityA!")
        startActivity(intent)
            finish()
    }






    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle back button click
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun changeColor(view: View) {
        view.setOnClickListener {
            // Code to be executed when the view is clicked
            if (view is TextView) {
                // Code using currentTextColor
                if (view.currentTextColor == ContextCompat.getColor(this, R.color.white)) {
                    view.setBackgroundResource(R.drawable.refineiten)
                    if (view is TextView) {
                        view.setTextColor(ContextCompat.getColor(this, R.color.my_dark_primary))
                    }
                } else {
                    view.setBackgroundResource(R.drawable.saverefinr)
                    if (view is TextView) {
                        view.setTextColor(ContextCompat.getColor(this, R.color.white))
                    }
                }
            }

        }
    }

}